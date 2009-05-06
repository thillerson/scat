package scat.api

import scat.exceptions._
import scat.httpClient._

trait TwitterAPI {
	
	val twitterUrl = "http://twitter.com"
	
	def username:Option[String]
	def password:Option[String]
	def hasCredentials_?():Boolean
	def httpClient:HTTPClient
	
	protected def credentialsRequired = {
		if (! hasCredentials_?) {
			throw new AuthenticationException
		}
	}
	
}