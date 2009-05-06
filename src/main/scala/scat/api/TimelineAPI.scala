package scat.api

import scala.xml.XML

import scat.domain._

trait TimelineAPI extends TwitterAPI {
	
	val timelinePath = twitterUrl + "/statuses"
	
	def friendsTimeline():List[Status]	= authenticatedTimelineAtPath("/friends_timeline.xml")
	def userTimeline():List[Status]			= authenticatedTimelineAtPath("/user_timeline.xml")
	def mentions():List[Status]					= authenticatedTimelineAtPath("/mentions.xml")
	def publicTimeline():List[Status] 	= timelineAtPath("/public_timeline.xml")
	
	def authenticatedTimelineAtPath(path:String):List[Status] = {
		credentialsRequired
		timelineAtPath(path)
	}
	
	def timelineAtPath(path:String):List[Status] = {
		val (statusCode, result) = httpClient.get(timelinePath + path)
		Status.fromXMLList(XML.loadString(result))
	}
	
}