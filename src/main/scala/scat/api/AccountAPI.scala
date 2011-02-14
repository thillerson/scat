package scat.api

import _root_.scala.xml.{Node}
import scala.xml.XML

import scat.domain._
import scat.httpClient.HTTPClient

trait AccountAPI extends TwitterAPI {
  
  val accountPath = twitterUrl + "/account"
  
  def verify_credentials:Boolean = authenticated_?
  def authenticated_?():Boolean					= {
    val (statusCode, result) = httpClient.get(accountPath + "/verify_credentials.xml")
    statusCode == HTTPClient.OK
  }
  
  def rateLimitStatus:User = {
    credentialsRequired
    null
  }
  
  def updateDeliveryDevice:User = {
    credentialsRequired
    null
  }
  
  def updateProfileColors:User = {
    credentialsRequired
    null
  }
  
  def updateProfileImage:User = {
    credentialsRequired
    null
  }
  
  def updateProfileBackgroundImage:User = {
    credentialsRequired
    null
  }
  
  def updateProfile:User = {
    credentialsRequired
    null
  }
  
  def logout = endSession
  def endSession = {
    if (hasCredentials_?) {
      //POST
    }
  }
}
