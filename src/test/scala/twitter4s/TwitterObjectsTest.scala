package twitter4s

import org.specs._
import org.specs.runner.{ConsoleRunner, JUnit4}
import org.joda.time._;
import scala.xml._

import twitter4s.domain._

object TwitterObjectsTest extends Specification {

  "A User" should {
    "deserialize from xml" in {
      val user = new User(XMLData.userXML)
      user.id must_== 5815992L
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
		
		"should have a status" in {
			val user = new User(XMLData.userXML)
			user.status.id must_== 1500329547L
		}
  }

	"A Status Message" should {
		"deserialize from xml" in {
			val status = new Status(XMLData.statusWithReplyTo)
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
		
		"should have a user" in {
			val status = new Status(XMLData.statusWithReplyTo)
			status.user.id must_== 18713L
		}
	}
		
	"A Direct Message" should {
		"deserialize from xml" in {
			val dm = new DirectMessage(XMLData.dmXML)
			dm.id must_== 89514158L
			dm.senderId must_== 8398792L
			dm.recipientId must_== 5815992L
			dm.text mustEqual("Yeah she did.")
			dm.senderScreenName mustEqual("andymcintosh")
			dm.recipientScreenName mustEqual("thillerson")
      dm.createdAt.isEqual(new DateTime(2009, 4, 9, 17, 45, 26, 0, DateTimeZone.UTC)) must beTrue
		}
		
		"should have a sender and recipient" in {
			val dm = new DirectMessage(XMLData.dmXML)
			dm.sender.id must_== 8398792L
			dm.recipient.id must_== 5815992L
		}
	}

}

class TwitterObjectsTest extends JUnit4(TwitterObjectsTest)
object TwitterObjectTestRunner extends ConsoleRunner(TwitterObjectsTest)
