package twitter4s.api

import _root_.scala.xml.{Node}
import scala.xml.XML

import twitter4s.domain._

trait UserAPI extends TwitterAPI {
	
	val usersPath = twitterUrl + "/users"

	def friends():List[User] = {
			credentialsRequired
			null
	}
	
	def followers():List[User] = {
			credentialsRequired
			null
	}
	
	def follow(user:String):User = {
			credentialsRequired
			null
	}
	
	def friendsWith_?(user:String):Boolean = {
			credentialsRequired
			true
	}
	
	def unfollow(user:String):User = {
			credentialsRequired
			null
	}
	
	def getUser(id:String):User = {
			credentialsRequired
			null
	}
	
	def block(user:String):User = {
			credentialsRequired
			null
	}
	
	def unblock(user:String):User = {
			credentialsRequired
			null
	}
	
	def user():User = {
		val (statusCode, result) = httpClient.get(String.format("%s/%s.xml", usersPath, username.get))
		new User(result)
	}
	
}