package scat.api

import scala.xml.XML

import scat.domain._

trait FriendshipAPI extends TwitterAPI {
	
	val friendshipPath = twitterUrl + "/friendships"
	
	def follow(user:String):User = {
		credentialsRequired
		null
	}
	
	def unfollow(user:String):User = {
		credentialsRequired
		null
	}
	
}