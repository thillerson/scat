package scat.api

import _root_.scala.xml.{Node}
import scala.xml.XML

import scat.domain._

trait DirectMessageAPI extends TwitterAPI {

	def directMessages():List[DirectMessage]	= {
		credentialsRequired
		null
	}
	
	def getDirectMessage(id:Long):DirectMessage	= {
		credentialsRequired
		null
	}
	
	def getSentDirectMessages():List[DirectMessage]	= {
		credentialsRequired
		null
	}
	
	def destroyDirectMessage(id:Long):List[DirectMessage]	= {
		credentialsRequired
		null
	}

	def dm(toUserId:String, text:String):DirectMessage = {
		credentialsRequired
		null
	}
	
}