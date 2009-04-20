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
	
	def friendsTimeline():List[Status]							 			= {
		val (statusCode, result) = httpClient.get(statusesPath + "/friends_timeline.xml")
		Status.fromXMLList(XML.loadString(result))
	}
	
	def userTimeline():List[Status]							 					= null
	def tweet(body:String):Status									 				= null
	def tweet(body:String, inReplyToId:Int):Status				= null
	def getStatus(id:Int):Status						 							= null
	def deleteStatus(id:Int):Status					 							= null
	def replies():List[Status]							 							= null
	def mentions():List[Status]							 							= null
	def directMessages():List[DirectMessage]							= null
	def getDirectMessage(id:Int):DirectMessage						= null
	def getSentDirectMessages():List[DirectMessage]				= null
	def destroyDirectMessage(id:Int):List[DirectMessage]	= null
	def dm(toUserId:String, text:String):DirectMessage		= null
	def friends():List[User]															= null
	def followers():List[User]														= null
	def follow(user:String):User													= null
	def friendsWith_?(user:String):Boolean								= false
	def unfollow(user:String):User												= null
	def getUser(id:Int):User															= null
	def block(user:String)																= null
	def unblock(user:String)															= null
	def getFavorites():List[Status]												= null
	def favorite(id:Int):Status														= null
	def unfavorite(id:Int):Status													= null
	
	def publicTimeline():List[Status] = {
		val (statusCode, result) = httpClient.get(statusesPath + "/public_timeline.xml")
		Status.fromXMLList(XML.loadString(result))
	}
	
	def user():User = {
		val (statusCode, result) = httpClient.get(String.format("%s/%s.xml", usersPath, username.get))
		new User(result)
	}
	
}