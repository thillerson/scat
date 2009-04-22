package twitter4s.api

import _root_.scala.xml.{Node}
import scala.xml.XML

import twitter4s.domain._
import twitter4s.httpClient.HTTPClient

trait AccountAPI extends TwitterAPI {
	
	val accountPath = twitterUrl + "/account"
	
	def authenticated_?():Boolean					= {
		val (statusCode, result) = httpClient.get(accountPath + "/verify_credentials.xml")
		statusCode == HTTPClient.OK
	}
	
}