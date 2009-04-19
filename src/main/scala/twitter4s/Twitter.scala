package twitter4s

import twitter4s.domain._
import twitter4s.httpClient._

class Twitter(username:Option[String], password:Option[String], httpClient:HTTPClient) {
	
	def this(username:Option[String], password:Option[String]) = this(username, password, new HTTPClient(username, password))
	def this(username:String, password:String) = this(Some(username), Some(password))
	def this(username:String, password:String, httpClient:HTTPClient) = this(Some(username), Some(password), httpClient)
	def this() = this(None, None)
	
	val twitterUrl = "http://twitter.com"
	val accountPath = twitterUrl + "/account"
	val usersPath = twitterUrl + "/users"
	
	def hasCredentials_?():Boolean				= password != None
	
	def authenticated_?():Boolean					= {
		val (statusCode, result) = httpClient.get(accountPath + "/verify_credentials.xml")
		statusCode == HTTPClient.OK
	}
	
	def timeline()												= ()
	def tweet(body:String)								= ()
	def deleteStatus(id:Int)							= ()
	def getStatus(id:Int):Array[Status]		= null
	def getReplies():Array[Status]				= null
	def getDMs():Array[Status]						= null
	def getSentDMs():Array[Status]				= null
	def destroyDM(id:Int)									= ()
	def follow(user:String)								= ()
	def unfollow(user:String)							= ()
	def block(user:String)								= ()
	def unblock(user:String)							= ()
	def getFavorites():Array[Status]			= null
	def favorite(id:Int)									= ()
	def unfavorite(id:Int)								= ()
	def publicTimeline()									= ()
	
	def getMe():User											= {
		val (statusCode, result) = httpClient.get(String.format("%s/%s.xml", usersPath, username.get))
		new User(result)
	}
	
}