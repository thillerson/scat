package scat.api

import _root_.scala.xml.{Node}
import scala.xml.XML

import scat.domain._

trait StatusAPI extends TwitterAPI {
  
  val statusesPath = twitterUrl + "/statuses"
  
  def getStatus(statusId:Long):Status = {
    credentialsRequired
    val (statusCode, result) = httpClient.get("%s/show/%d.xml".format(statusesPath, statusId))
    return new Status(XML.loadString(result))
  }

  def tweet(body:String):Status = {
    credentialsRequired
    val (statusCode, result) = httpClient.post(statusesPath + "/update.xml", List(("status", body)))
    return new Status(XML.loadString(result))
  }
  
  def tweet(body:String, inReplyToId:Long):Status = {
    credentialsRequired
    val (statusCode, result) = httpClient.post(statusesPath + "/update.xml", List(("status", body), ("in_reply_to_status_id", inReplyToId)))
    return new Status(XML.loadString(result))
  }
  
  def deleteStatus(id:Long):Status = {
    credentialsRequired
    val (statusCode, result) = httpClient.delete("%s/destroy/%s.xml".format(statusesPath, id.toString))
    return new Status(XML.loadString(result))
  }
  
}
