package twitter4s.api

import _root_.scala.xml.{Node}
import scala.xml.XML

import twitter4s.domain._

trait StatusAPI extends TwitterAPI {
	
	val statusesPath = twitterUrl + "/statuses"
	
	def getStatus(statusId:Long):Status = {
		credentialsRequired
		val (statusCode, result) = httpClient.get("%s/show/%d.xml".format(statusesPath, statusId))
		return new Status(XML.loadString(result))
	}

	def tweet(body:String):Status	= {
		credentialsRequired
		null
	}
	
	def tweet(body:String, inReplyToId:Long):Status	= {
		credentialsRequired
		null
	}
	
	def deleteStatus(id:Long):Status	= {
		credentialsRequired
		null
	}
	
}