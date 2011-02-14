package scat.domain

import _root_.scala.xml.NodeSeq
import org.joda.time._;

class User(x:NodeSeq) {
  
  def this(xmlString:String)         = this(scala.xml.XML.loadString(xmlString))

  lazy val id                        = (x \ "id").text.toLong
  lazy val name                      = (x \ "name").text
  lazy val screenName                = (x \ "screen_name").text
  lazy val location                  = (x \ "location").text
  lazy val description               = (x \ "description").text
  lazy val url                       = (x \ "url").text
  lazy val isProtected               = (x \ "protected").text.toBoolean
  lazy val notifications             = (x \ "notifications").text.toBoolean
  lazy val following                 = (x \ "following").text.toBoolean
  lazy val followersCount            = (x \ "followers_count").text.toInt
  lazy val friendsCount              = (x \ "friends_count").text.toInt
  lazy val favouritesCount           = (x \ "favourites_count").text.toInt
  lazy val statusesCount             = (x \ "statuses_count").text.toInt
  lazy val createdAt                 = DomainUtils.STD_DATE_TIME_FORMATTER.parseDateTime((x \ "created_at").text)
  lazy val utcOffset                 = (x \ "utc_offset").text.toInt
  lazy val timeZone                  = (x \ "time_zone").text
  lazy val profileImageURL           = (x \ "profile_image_url").text
  lazy val profileBackgroundColor    = (x \ "profile_background_color").text
  lazy val profileTextColor          = (x \ "profile_text_color").text
  lazy val profileLinkColor          = (x \ "profile_link_color").text
  lazy val profileSidebarFillColor   = (x \ "profile_sidebar_fill_color").text
  lazy val profileSidebarBorderColor = (x \ "profile_sidebar_border_color").text
  lazy val profileBackgroundImageURL = (x \ "profile_background_image_url").text
  lazy val profileBackgroundTile     = (x \ "profile_background_tile").text.toBoolean

  lazy val status                    = new Status((x \ "status"))
  
  override def toString = {
    String.format("User(%s)", screenName)
  }
}
