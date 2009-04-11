package twitter4s.domain

import _root_.scala.xml.NodeSeq
import java.lang.Boolean._
import java.lang.Integer._
import java.lang.Long._
import org.joda.time._;
import org.joda.time.format._;

class User(x:NodeSeq) {

  val STD_DATE_TIME_FORMATTER = DateTimeFormat.forPattern("EEE MMM dd HH:mm:ss Z yyyy");

  def id                        = parseLong((x \ "id").text)
  def name                      = (x \ "name").text
  def screenName                = (x \ "screen_name").text
  def location                  = (x \ "location").text
  def description               = (x \ "description").text
  def url                       = (x \ "url").text
  def isProtected               = parseBoolean(((x \ "protected").text))
  def notifications             = parseBoolean((x \ "notifications").text)
  def following                 = parseBoolean((x \ "following").text)
  def followersCount            = parseInt((x \ "followers_count").text)
  def friendsCount              = parseInt((x \ "friends_count").text)
  def favouritesCount           = parseInt((x \ "favourites_count").text)
  def statusesCount             = parseInt((x \ "statuses_count").text)
  def createdAt                 = STD_DATE_TIME_FORMATTER.parseDateTime((x \ "created_at").text)
  def utcOffset                 = parseInt((x \ "utc_offset").text)
  def timeZone                  = (x \ "time_zone").text
  def profileImageURL           = (x \ "profile_image_url").text
  def profileBackgroundColor    = (x \ "profile_background_color").text
  def profileTextColor          = (x \ "profile_text_color").text
  def profileLinkColor          = (x \ "profile_link_color").text
  def profileSidebarFillColor   = (x \ "profile_sidebar_fill_color").text
  def profileSidebarBorderColor = (x \ "profile_sidebar_border_color").text
  def profileBackgroundImageURL = (x \ "profile_background_image_url").text
  def profileBackgroundTile     = parseBoolean((x \ "profile_background_tile").text)
}
