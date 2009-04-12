package twitter4s.domain

import _root_.scala.xml.NodeSeq
import org.joda.time._;

class Status(x:NodeSeq) {

  def id                    = (x \ "id").text.toLong
  def text                  = (x \ "text").text
  def source                = (x \ "source").text
  def createdAt             = DomainUtils.STD_DATE_TIME_FORMATTER.parseDateTime((x \ "created_at").text)
  def truncated             = (x \ "truncated").text.toBoolean
  def favorited             = (x \ "favorited").text.toBoolean
  def inReplyToStatusId     = (x \ "in_reply_to_status_id").text.toLong
  def inReplyToUserId       = (x \ "in_reply_to_user_id").text.toLong
  def inReplyToScreenName   = (x \ "in_reply_to_screen_name").text
}
