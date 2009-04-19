package twitter4s

import _root_.scala.xml.{Node}
import scala.xml.XML
import twitter4s.domain._
import twitter4s.httpClient.{HTTPClient}

class Twitter(username:Option[String], password:Option[String], httpClient:HTTPClient) {
	
	def this(username:Option[String], password:Option[String]) = this(username, password, new HTTPClient(username, password))
	def this() = this(None, None)
	def this(username:String, password:String) = this(Some(username), Some(password))
	def this(username:String, password:String, httpClient:HTTPClient) = this(Some(username), Some(password), httpClient)
	
	val twitterUrl = "http://twitter.com"
	val statusesPath = twitterUrl + "/statuses"
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
	def getStatus(id:Int):List[Status]		= null
	def getReplies():List[Status]					= null
	def getDMs():List[Status]							= null
	def getSentDMs():List[Status]					= null
	def destroyDM(id:Int)									= ()
	def follow(user:String)								= ()
	def unfollow(user:String)							= ()
	def block(user:String)								= ()
	def unblock(user:String)							= ()
	def getFavorites():List[Status]				= null
	def favorite(id:Int)									= ()
	def unfavorite(id:Int)								= ()
	
	def publicTimeline():List[Status]			= {
		val (statusCode, result) = httpClient.get(statusesPath + "/public_timeline.xml")
		val statuses = (XML.loadString(result) \\ "status")
		val statusSeq = for (statusNode:Node <- statuses) yield new Status(statusNode)
		statusSeq.toList
	}
	
	def getMe():User											= {
		val (statusCode, result) = httpClient.get(String.format("%s/%s.xml", usersPath, username.get))
		new User(result)
	}
	
}