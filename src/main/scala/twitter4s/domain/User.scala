package twitter4s.domain

import _root_.scala.xml.NodeSeq
import org.joda.time._;

class User(x:NodeSeq) {

  def id                        = (x \ "id").text.toLong
  def name                      = (x \ "name").text
  def screenName                = (x \ "screen_name").text
  def location                  = (x \ "location").text
  def description               = (x \ "description").text
  def url                       = (x \ "url").text
  def isProtected               = (x \ "protected").text.toBoolean
  def notifications             = (x \ "notifications").text.toBoolean
  def following                 = (x \ "following").text.toBoolean
  def followersCount            = (x \ "followers_count").text.toInt
  def friendsCount              = (x \ "friends_count").text.toInt
  def favouritesCount           = (x \ "favourites_count").text.toInt
  def statusesCount             = (x \ "statuses_count").text.toInt
  def createdAt                 = DomainUtils.STD_DATE_TIME_FORMATTER.parseDateTime((x \ "created_at").text)
  def utcOffset                 = (x \ "utc_offset").text.toInt
  def timeZone                  = (x \ "time_zone").text
  def profileImageURL           = (x \ "profile_image_url").text
  def profileBackgroundColor    = (x \ "profile_background_color").text
  def profileTextColor          = (x \ "profile_text_color").text
  def profileLinkColor          = (x \ "profile_link_color").text
  def profileSidebarFillColor   = (x \ "profile_sidebar_fill_color").text
  def profileSidebarBorderColor = (x \ "profile_sidebar_border_color").text
  def profileBackgroundImageURL = (x \ "profile_background_image_url").text
  def profileBackgroundTile     = (x \ "profile_background_tile").text.toBoolean

	//FIXME this makes the test pass, but we need to lazy load *and* memoize 
	def status										= new Status((x \ "status"))
}
