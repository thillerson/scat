package scat.api

import scala.xml.XML

import scat.domain._

trait BlockAPI extends TwitterAPI {
	
	val blockPath = twitterUrl + "/blocks"
	
}