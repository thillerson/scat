package scat.domain

import _root_.scala.xml.{NodeSeq, Node}
import org.joda.time._;

class Status(x:NodeSeq) {

  lazy val id                    = (x \ "id").text.toLong
  lazy val text                  = (x \ "text").text
  lazy val source                = (x \ "source").text
  lazy val createdAt             = DomainUtils.STD_DATE_TIME_FORMATTER.parseDateTime((x \ "created_at").text)
  lazy val truncated             = (x \ "truncated").text.toBoolean
  lazy val favorited             = (x \ "favorited").text.toBoolean
  lazy val inReplyToStatusId     = (x \ "in_reply_to_status_id").text.toLong
  lazy val inReplyToUserId       = (x \ "in_reply_to_user_id").text.toLong
  lazy val inReplyToScreenName   = (x \ "in_reply_to_screen_name").text

	lazy val user									 = new User((x \ "user"))
	
	lazy val shortText = {
		if (text.size <= 20) {
			text
		}	else {
			//TODO is this a good way to do this? The Scala way?
			val l = List.fromString(text)
			val (first, last) = l.splitAt(20)
			first.mkString("","","") + "..."
		}
	}

	override def toString = {
		String.format("Status(\"%s\" by %s)", shortText, user.screenName)
	}
}

object Status {
	
	def fromXMLList(xml:NodeSeq) = {
		val statuses = (xml \\ "status")
		val statusSeq = for (statusNode:Node <- statuses) yield new Status(statusNode)
		statusSeq.toList
	}
	
}