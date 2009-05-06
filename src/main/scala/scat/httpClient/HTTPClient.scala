package scat.httpClient

import org.apache.commons.httpclient.{HttpClient, UsernamePasswordCredentials, HttpMethod, NameValuePair};
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.cookie.CookiePolicy
import org.apache.commons.httpclient.methods.{GetMethod, PostMethod, PutMethod, DeleteMethod, EntityEnclosingMethod};

class HTTPClient(username:Option[String], password:Option[String]) {
	
	val client = new HttpClient
	
	def this() = this(None, None)
	def this(username:String, password:String) = this(Some(username), Some(password))
	
	def hasCredentials_? = password != None
	
	def get(url:String):Tuple2[Int, String] = execute(new GetMethod(url))
	//TODO: need to build a query string for params, if any
	def get(url:String, params:List[Tuple2[String, Any]]):Tuple2[Int, String] = (200, "")

	def post(url:String):Tuple2[Int, String] = execute(new PostMethod(url))
	def post(url:String, params:List[Tuple2[String, Any]]):Tuple2[Int, String] = execute(addParams(new PostMethod(url), params))

	//TODO
	def put(url:String):Tuple2[Int, String] = (200, "")
	def put(url:String, params:List[Tuple2[String, Any]]):Tuple2[Int, String] = (200, "")

	//TODO
	def delete(url:String):Tuple2[Int, String] = (200, "")
	def delete(url:String, params:List[Tuple2[String, Any]]):Tuple2[Int, String] = (200, "")
	
	protected def execute(method:HttpMethod):Tuple2[Int, String] = {
		method.setDoAuthentication(hasCredentials_?)
    method.getParams.setCookiePolicy(CookiePolicy.IGNORE_COOKIES)

		if (hasCredentials_?) {
	    client.getParams.setAuthenticationPreemptive(true)
			client.getState.setCredentials(
				//TODO magic values here
				new AuthScope("twitter.com", 80, AuthScope.ANY_REALM),
				new UsernamePasswordCredentials(username.get, password.get)
			)
		}
    try {
        val status = client.executeMethod(method)
        val response = method.getResponseBodyAsString
				(status, response)
				//TODO handle HTTP exceptions, return correct status and actual payload
    } finally {
        method releaseConnection
    }
	}
	
	//TODO why don't put and post work the same? research
	// we'll need put to take params at some point
	protected def addParams(method:PostMethod, params:List[Tuple2[String, Any]]) = {
		val nvps = for (param <- params) yield new NameValuePair(param._1, param._2.toString)
		method.setRequestBody(nvps.toArray)
		method
	}
	
}

object HTTPClient {
	val OK = 200
}