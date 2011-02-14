package scat.domain

import _root_.scala.xml.NodeSeq
import org.joda.time._;

class DirectMessage(x:NodeSeq) {

  lazy val id                   = (x \ "id").text.toLong
  lazy val text                 = (x \ "text").text
  lazy val createdAt            = DomainUtils.STD_DATE_TIME_FORMATTER.parseDateTime((x \ "created_at").text)
  lazy val senderScreenName     = (x \ "sender_screen_name").text
  lazy val senderId		= (x \ "sender_id").text.toLong
  lazy val recipientScreenName  = (x \ "recipient_screen_name").text
  lazy val recipientId		= (x \ "recipient_id").text.toLong

  lazy val sender		= new User((x \ "sender"))
  lazy val recipient		= new User((x \ "recipient"))
}
