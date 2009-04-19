package twitter4s.httpClient

class HTTPClient(username:Option[String], password:Option[String]) {
	
	def this() = this(None, None)
	def this(username:String, password:String) = this(Some(username), Some(password))
	
	def hasCredentials_? = password != None
	
	def get(url:String):Tuple2[Int, String] = (200, "")
	def get(url:String, params:List[Tuple2[String, Any]]):Tuple2[Int, String] = (200, "")

	def post(url:String):Tuple2[Int, String] = (200, "")
	def post(url:String, params:List[Tuple2[String, Any]]):Tuple2[Int, String] = (200, "")

	def put(url:String):Tuple2[Int, String] = (200, "")
	def put(url:String, params:List[Tuple2[String, Any]]):Tuple2[Int, String] = (200, "")

	def delete(url:String):Tuple2[Int, String] = (200, "")
	def delete(url:String, params:List[Tuple2[String, Any]]):Tuple2[Int, String] = (200, "")
}

object HTTPClient {
	val OK = 200
}