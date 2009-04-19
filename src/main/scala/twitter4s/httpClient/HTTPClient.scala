package twitter4s.httpClient

import org.apache.commons.httpclient.{HttpClient, UsernamePasswordCredentials, HttpMethodBase};
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.{GetMethod, PostMethod, PutMethod, DeleteMethod};

class HTTPClient(username:Option[String], password:Option[String]) {
	
	val client = new HttpClient
	
	def this() = this(None, None)
	def this(username:String, password:String) = this(Some(username), Some(password))
	
	def hasCredentials_? = password != None
	
	def get(url:String):Tuple2[Int, String] = execute(new GetMethod(url))
	def get(url:String, params:List[Tuple2[String, Any]]):Tuple2[Int, String] = (200, "")

	def post(url:String):Tuple2[Int, String] = (200, "")
	def post(url:String, params:List[Tuple2[String, Any]]):Tuple2[Int, String] = (200, "")

	def put(url:String):Tuple2[Int, String] = (200, "")
	def put(url:String, params:List[Tuple2[String, Any]]):Tuple2[Int, String] = (200, "")

	def delete(url:String):Tuple2[Int, String] = (200, "")
	def delete(url:String, params:List[Tuple2[String, Any]]):Tuple2[Int, String] = (200, "")
	
	protected def execute(method:HttpMethodBase):Tuple2[Int, String] = {
		method.setDoAuthentication(hasCredentials_?)
		if (hasCredentials_?) {
			client.getState.setCredentials(
				//TODO magic values here
				new AuthScope("twitter.com", 80, "realm"),
				new UsernamePasswordCredentials(username.get, password.get)
			)
		}
    try {
        val status = client.executeMethod(method)
        val response = method.getResponseBodyAsString
				(status, response)
		//TODO handle exceptions, return correct status and actual payload
    } finally {
        method releaseConnection
    }
	}
	
}

object HTTPClient {
	val OK = 200
}