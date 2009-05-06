package scat.api

import _root_.scala.xml.{Node}
import scala.xml.XML

import scat.domain._
import scat.httpClient.HTTPClient

trait AccountAPI extends TwitterAPI {
	
	val accountPath = twitterUrl + "/account"
	
	def authenticated_?():Boolean					= {
		val (statusCode, result) = httpClient.get(accountPath + "/verify_credentials.xml")
		statusCode == HTTPClient.OK
	}
	
}