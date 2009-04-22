package twitter4s.api

import twitter4s.exceptions._
import twitter4s.httpClient._

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