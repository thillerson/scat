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

	"A Status Message" should {
		"deserialize from xml" in {
			val status = new Status(statusWithReplyTo)
			status.id must_== 1501043971L
			status.text mustEqual("@dacort Our fault. Thanks for pointing it out.")
			status.source mustEqual("<a href=\"http://www.atebits.com/\">Tweetie</a>")
			status.truncated must beFalse
			status.favorited must beFalse
			status.inReplyToStatusId must_== 1500895949L
			status.inReplyToUserId must_== 99723L
			status.inReplyToScreenName mustEqual("dacort")
      status.createdAt.isEqual(new DateTime(2009, 4, 12, 3, 39, 45, 0, DateTimeZone.UTC)) must beTrue
		}
	}
		
	"A Direct Message" should {
		"deserialize from xml" in {
			val dm = new DirectMessage(dmXML)
			dm.id must_== 89514158L
			dm.senderId must_== 8398792L
			dm.recipientId must_== 5815992L
			dm.text mustEqual("Yeah she did.")
			dm.senderScreenName mustEqual("andymcintosh")
			dm.recipientScreenName mustEqual("thillerson")
      dm.createdAt.isEqual(new DateTime(2009, 4, 9, 17, 45, 26, 0, DateTimeZone.UTC)) must beTrue
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
	<status>
		<created_at>Sun Apr 12 01:12:58 +0000 2009</created_at>
		<id>1500329547</id>
		<text>
		Nice little spread - Photo: http://bkite.com/06oRi.
		</text>
		<source>&lt;a href="http://brightkite.com/"&gt;Brightkite&lt;/a&gt;</source>
		<truncated>false</truncated>
		<in_reply_to_status_id/>
		<in_reply_to_user_id/>
		<favorited>false</favorited>
		<in_reply_to_screen_name/>
	</status> 
	</user>

  val statusWithReplyTo = 
	<status>
		<created_at>Sun Apr 12 03:39:45 +0000 2009</created_at>
		<id>1501043971</id>
		<text>@dacort Our fault. Thanks for pointing it out.</text>
		<source>&lt;a href="http://www.atebits.com/"&gt;Tweetie&lt;/a&gt;</source>
		<truncated>false</truncated>
		<in_reply_to_status_id>1500895949</in_reply_to_status_id>
		<in_reply_to_user_id>99723</in_reply_to_user_id>
		<favorited>false</favorited>
		<in_reply_to_screen_name>dacort</in_reply_to_screen_name>
		<user>
			<id>18713</id>
			<name>Alex Payne</name>
			<screen_name>al3x</screen_name>
			<location>San Francisco</location>
			<description>
				Twitter's API Lead. Writer, critic, beverage enthusiast, programming language obsessive.
			</description>
			<profile_image_url>
				http://s3.amazonaws.com/twitter_production/profile_images/77218859/al3x_feb_2009_normal.png
			</profile_image_url>
			<url>http://al3x.net/</url>
			<protected>false</protected>
			<followers_count>10076</followers_count>
			<profile_background_color>e5e9eb</profile_background_color>
			<profile_text_color>232323</profile_text_color>
			<profile_link_color>336699</profile_link_color>
			<profile_sidebar_fill_color>c3cbd0</profile_sidebar_fill_color>
			<profile_sidebar_border_color>333</profile_sidebar_border_color>
			<friends_count>410</friends_count>
			<created_at>Thu Nov 23 19:29:11 +0000 2006</created_at>
			<favourites_count>1543</favourites_count>
			<utc_offset>-28800</utc_offset>
			<time_zone>Pacific Time &#40;US &amp; Canada&#41;</time_zone>
			<profile_background_image_url>
				http://static.twitter.com/images/themes/theme1/bg.gif
			</profile_background_image_url>
			<profile_background_tile>false</profile_background_tile>
			<statuses_count>8338</statuses_count>
			<notifications>false</notifications>
			<following>false</following>
		</user>
	</status>
	
	val dmXML = 
	<direct_message>
		<id>89514158</id>
		<sender_id>8398792</sender_id>
		<text>Yeah she did.</text>
		<recipient_id>5815992</recipient_id>
		<created_at>Thu Apr 09 17:45:26 +0000 2009</created_at>
		<sender_screen_name>andymcintosh</sender_screen_name>
		<recipient_screen_name>thillerson</recipient_screen_name>
		<sender>
			<id>8398792</id>
			<name>andymcintosh</name>
			<screen_name>andymcintosh</screen_name>
			<location>Edwardsburg Rd &amp; Jami St, </location>
			<description/>
			<profile_image_url>
				http://s3.amazonaws.com/twitter_production/profile_images/41055012/prada_normal.jpg
			</profile_image_url>
			<url>http://www.andymcintosh.com</url>
			<protected>false</protected>
			<followers_count>117</followers_count>
			<profile_background_color>9ae4e8</profile_background_color>
			<profile_text_color>000000</profile_text_color>
			<profile_link_color>0000ff</profile_link_color>
			<profile_sidebar_fill_color>e0ff92</profile_sidebar_fill_color>
			<profile_sidebar_border_color>87bc44</profile_sidebar_border_color>
			<friends_count>99</friends_count>
			<created_at>Fri Aug 24 06:19:26 +0000 2007</created_at>
			<favourites_count>1</favourites_count>
			<utc_offset>-25200</utc_offset>
			<time_zone>Mountain Time &#40;US &amp; Canada&#41;</time_zone>
			<profile_background_image_url>
				http://static.twitter.com/images/themes/theme1/bg.gif
			</profile_background_image_url>
			<profile_background_tile>false</profile_background_tile>
			<statuses_count>584</statuses_count>
			<notifications>false</notifications>
			<following>false</following>
		</sender>
		<recipient>
			<id>5815992</id>
			<name>Tony Hillerson</name>
			<screen_name>thillerson</screen_name>
			<location>Leyden Junction</location>
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
			<statuses_count>3604</statuses_count>
			<notifications>false</notifications>
			<following>true</following>
		</recipient>
	</direct_message>
}
