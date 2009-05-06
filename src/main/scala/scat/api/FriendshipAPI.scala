package scat.api

import scala.xml.XML

import scat.domain._

trait FriendshipAPI extends TwitterAPI {
	
	val friendshipPath = twitterUrl + "/friendships"
	
}