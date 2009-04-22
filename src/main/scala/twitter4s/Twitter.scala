package twitter4s

import twitter4s.api._
import twitter4s.httpClient.HTTPClient

class Twitter(
	uname:Option[String],
	pass:Option[String],
	httpc:HTTPClient) extends AccountAPI with StatusAPI with UserAPI with DirectMessageAPI {
	
	def this(username:Option[String], password:Option[String]) = this(username, password, new HTTPClient(username, password))
	def this() = this(None, None)
	def this(username:String, password:String) = this(Some(username), Some(password))
	def this(username:String, password:String, httpClient:HTTPClient) = this(Some(username), Some(password), httpClient)
	
	def hasCredentials_?():Boolean = password != None
	def username:Option[String] = uname
	def password:Option[String] = pass
	def httpClient:HTTPClient = httpc
	
}