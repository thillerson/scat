package twitter4s.domain

import _root_.scala.xml.NodeSeq
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
}
