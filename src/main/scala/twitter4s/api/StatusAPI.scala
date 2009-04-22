package twitter4s.api

import _root_.scala.xml.{Node}
import scala.xml.XML

import twitter4s.domain._

trait StatusAPI extends TwitterAPI {
	
	val statusesPath = twitterUrl + "/statuses"
	
	def friendsTimeline():List[Status] = {
		credentialsRequired
		val (statusCode, result) = httpClient.get(statusesPath + "/friends_timeline.xml")
		Status.fromXMLList(XML.loadString(result))
	}
	
	def userTimeline():List[Status]	= {
		credentialsRequired
		null
	}
	
	def tweet(body:String):Status	= {
		credentialsRequired
		null
	}
	
	def tweet(body:String, inReplyToId:Long):Status	= {
		credentialsRequired
		null
	}
	
	def getStatus(id:Long):Status	= {
		credentialsRequired
		null
	}
	
	def deleteStatus(id:Long):Status	= {
		credentialsRequired
		null
	}
	
	def replies():List[Status]	= {
		credentialsRequired
		null
	}
	
	def mentions():List[Status]	= {
		credentialsRequired
		null
	}
	
	def getFavorites():List[Status] = {
			credentialsRequired
			null
	}
	
	def favorite(id:Long):Status = {
			credentialsRequired
			null
	}
	
	def unfavorite(id:Long):Status = {
			credentialsRequired
			null
	}
	
	def publicTimeline():List[Status] = {
		val (statusCode, result) = httpClient.get(statusesPath + "/public_timeline.xml")
		Status.fromXMLList(XML.loadString(result))
	}
	
}