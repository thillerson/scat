package twitter4s

import org.specs._
import org.specs.runner.{ConsoleRunner, JUnit4}
import org.joda.time._;
import scala.xml._

import twitter4s.domain._

class TwitterObjectsTest extends JUnit4(TwitterObjectsTest)
object TwitterObjectTestRunner extends ConsoleRunner(TwitterObjectsTest)

object TwitterObjectsTest extends Specification {

  "A User" should {
    "deserialize from xml" in {
      val user = new User(userXML)
      user.id must_== 5815992L
      user.name must beMatching("Tony Hillerson")
      user.screenName must beMatching("thillerson")
      user.location must beMatching("Arvada")
      user.description must beMatching("I'm a bass player, electronic music maker, developer for effectiveUI, flash, flex, rails, java programmer, and I fancy myself a philosoper of sorts.")
      user.profileImageURL must beMatching("http://s3.amazonaws.com/twitter_production/profile_images/52156522/Photo_3_normal.jpg")
      user.url must beMatching("http://thillerson.blogspot.com")
      user.notifications must beFalse
      user.following must beFalse
      user.isProtected must beFalse
      user.followersCount must_== 440
      user.friendsCount must_== 332
      user.statusesCount must_== 3599
      user.profileBackgroundColor must beMatching("1A1B1F")
      user.profileTextColor must beMatching("666666")
      user.profileLinkColor must beMatching("2FC2EF")
      user.profileSidebarFillColor must beMatching("252429")
      user.profileSidebarBorderColor must beMatching("181A1E")
      user.profileBackgroundImageURL must beMatching("http://static.twitter.com/images/themes/theme9/bg.gif")
      user.profileBackgroundTile must beFalse
      user.utcOffset must_== -25200
      user.timeZone must beMatching("Mountain Time.*")
      user.timeZone must beMatching(".*(US & Canada)")
      user.createdAt.isEqual(new DateTime(2007, 5, 6, 21, 05, 23, 0, DateTimeZone.UTC)) must beTrue
    }
  }

  val userXML = 
  <user>
    <id>5815992</id>
    <name>Tony Hillerson</name>
    <screen_name>thillerson</screen_name>
    <location>Arvada</location>
    <description>
      I'm a bass player, electronic music maker, developer for effectiveUI, flash, flex, rails, java programmer, and I fancy myself a philosoper of sorts.
    </description>
    <profile_image_url>
      http://s3.amazonaws.com/twitter_production/profile_images/52156522/Photo_3_normal.jpg
    </profile_image_url>
    <url>http://thillerson.blogspot.com</url>
    <protected>false</protected>
    <followers_count>440</followers_count>
    <profile_background_color>1A1B1F</profile_background_color>
    <profile_text_color>666666</profile_text_color>
    <profile_link_color>2FC2EF</profile_link_color>
    <profile_sidebar_fill_color>252429</profile_sidebar_fill_color>
    <profile_sidebar_border_color>181A1E</profile_sidebar_border_color>
    <friends_count>332</friends_count>
    <created_at>Sun May 06 21:05:23 +0000 2007</created_at>
    <favourites_count>3</favourites_count>
    <utc_offset>-25200</utc_offset>
    <time_zone>Mountain Time &#40;US &amp; Canada&#41;</time_zone>
    <profile_background_image_url>
      http://static.twitter.com/images/themes/theme9/bg.gif
    </profile_background_image_url>
    <profile_background_tile>false</profile_background_tile>
    <statuses_count>3599</statuses_count>
    <notifications>false</notifications>
    <following>false</following>
  </user>
  
}
