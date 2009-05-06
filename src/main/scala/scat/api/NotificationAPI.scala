package scat.api

import scala.xml.XML

import scat.domain._

trait NotificationAPI extends TwitterAPI {
	
	val notificationPath = twitterUrl + "/notifications"
	
}