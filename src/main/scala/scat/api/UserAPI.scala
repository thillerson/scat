package scat.api

import _root_.scala.xml.{Node}
import scala.xml.XML

import scat.domain._

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
	
	def friendsWith_?(user:String):Boolean = {
		credentialsRequired
		true
	}
	
	def getUser(id:String):User = {
		credentialsRequired
		null
	}
	
	def user():User = {
		val (statusCode, result) = httpClient.get("%s/%s.xml".format(usersPath, username.get))
		new User(result)
	}
	
}