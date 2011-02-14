package scat

import scat.api._
import scat.httpClient.HTTPClient

class Twitter(uname:Option[String], pass:Option[String], httpc:HTTPClient)
  extends TimelineAPI
    with AccountAPI
    with StatusAPI
    with UserAPI
    with DirectMessageAPI
    with FavoriteAPI
    with BlockAPI
    with FriendshipAPI
    with NotificationAPI {
      
      def this(uname:Option[String], pass:Option[String]) = this(uname, pass, new HTTPClient(uname, pass))
      def this() = this(None, None)
      def this(u:String, p:String) = this(Some(u), Some(p))
      def this(u:String, p:String, c:HTTPClient) = this(Some(u), Some(p), c)
      
      def hasCredentials_?():Boolean = (uname != None && pass != None)
      def username:Option[String] = uname
      def password:Option[String] = pass
      def httpClient:HTTPClient = httpc
    }
