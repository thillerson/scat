package scat.api

import scala.xml.XML

import scat.domain._

trait BlockAPI extends TwitterAPI {
	
	val blockPath = twitterUrl + "/blocks"
	
	def block(user:String):User = {
		credentialsRequired
		null
	}
	
	def unblock(user:String):User = {
		credentialsRequired
		null
	}
	
}