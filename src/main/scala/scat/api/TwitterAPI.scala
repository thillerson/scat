package scat.api

import scat.exceptions._
import scat.httpClient._

trait TwitterAPI {
	
	val twitterUrl = "http://twitter.com"
	
	def username:Option[String]
	def password:Option[String]
	def hasCredentials_?():Boolean
	def httpClient:HTTPClient
	
	def test():Boolean = ping
	def ping():Boolean = {
		val (status, result) = httpClient.get(twitterUrl + "/help/test.xml")
		status == HTTPClient.OK
	}
	
	protected def credentialsRequired = {
		if (! hasCredentials_?) {
			throw new AuthenticationException
		}
	}
	
}