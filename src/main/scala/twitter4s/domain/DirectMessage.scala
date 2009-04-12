package twitter4s.domain

import _root_.scala.xml.NodeSeq
import org.joda.time._;

class DirectMessage(x:NodeSeq) {

  def id                    = (x \ "id").text.toLong
  def text                  = (x \ "text").text
  def createdAt             = DomainUtils.STD_DATE_TIME_FORMATTER.parseDateTime((x \ "created_at").text)
  def senderScreenName      = (x \ "sender_screen_name").text
  def senderId				      = (x \ "sender_id").text.toLong
  def recipientScreenName   = (x \ "recipient_screen_name").text
  def recipientId						= (x \ "recipient_id").text.toLong
}
