package twitter4s

import org.specs._
import org.specs.runner.{ConsoleRunner, JUnit4}
import org.specs.mock._
import scala.xml._

import twitter4s.domain._
import twitter4s.exceptions._
import twitter4s.httpClient._

object APITest extends TwitterMock {
	
	"The unauthenticated Twitter service wrapper" should {
		doBefore { init }
		
		"get the public timeline" in {
			expect {
				one(httpClient).get("http://twitter.com/statuses/public_timeline.xml") willReturn (200, XMLData.publicTimeline.toString)
			}
			
			val timeline = twitter.publicTimeline
			timeline.size must_== 20
			val firstStatus = timeline(0)
			firstStatus.id must_== 1556513084L
		}
		
		"not allow calling services that require authentication" in {
			twitter.friendsTimeline must throwAn[AuthenticationException]
			twitter.userTimeline must throwAn[AuthenticationException]
			twitter.tweet("foo") must throwAn[AuthenticationException]
			twitter.tweet("@bradumbaugh foo", 1234656L) must throwAn[AuthenticationException]
			twitter.getStatus(12345678L) must throwAn[AuthenticationException]
			twitter.deleteStatus(12345678L) must throwAn[AuthenticationException]
			twitter.replies must throwAn[AuthenticationException]
			twitter.mentions must throwAn[AuthenticationException]
			twitter.directMessages must throwAn[AuthenticationException]
			twitter.getDirectMessage(12345678L) must throwAn[AuthenticationException]
			twitter.getSentDirectMessages must throwAn[AuthenticationException]
			twitter.destroyDirectMessage(12345678L) must throwAn[AuthenticationException]
			twitter.dm("oprah", "Love your show, O") must throwAn[AuthenticationException]
			twitter.friends must throwAn[AuthenticationException]
			twitter.followers must throwAn[AuthenticationException]
			twitter.follow("al3x") must throwAn[AuthenticationException]
			twitter.friendsWith_?("rainnwilson") must throwAn[AuthenticationException]
			twitter.unfollow("scobleizer") must throwAn[AuthenticationException]
			twitter.getUser("d2h") must throwAn[AuthenticationException]
			twitter.block("rjowen") must throwAn[AuthenticationException]
			twitter.unblock("rjowen") must throwAn[AuthenticationException]
			twitter.getFavorites must throwAn[AuthenticationException]
			twitter.favorite(12345678L) must throwAn[AuthenticationException]
			twitter.unfavorite(12345678L) must throwAn[AuthenticationException]
		}
	}
	
	"The authenticated Twitter service wrapper" should {
		doBefore { init }
		
		"have credentials" in {
			expect {
				one(httpClient).get("http://twitter.com/account/verify_credentials.xml") willReturn (200, XMLData.userXML.toString)
			}
			
			authenticatedTwitter.hasCredentials_? must beTrue
			authenticatedTwitter.authenticated_? must beTrue
		}
		
		"return the currently authenticated user resource" in {
			expect {
				one(httpClient).get("http://twitter.com/users/foo.xml") willReturn (200, XMLData.userXML.toString)
			}
			
			val user = authenticatedTwitter.user
			user.id must_== 5815992L
		}
		
		"get the user's friends timeline" in {
			expect {
				one(httpClient).get("http://twitter.com/statuses/friends_timeline.xml") willReturn (200, XMLData.publicTimeline.toString)
			}
			
			val timeline = authenticatedTwitter.friendsTimeline
			timeline.size must_== 20
			val firstStatus = timeline(0)
			firstStatus.id must_== 1556513084L
		}
	}

}

trait TwitterMock extends Specification with JMocker with ClassMocker {
	var httpClient:HTTPClient = _
	var authenticatedTwitter:Twitter = _
	var twitter:Twitter = _
	
	def init = {
		httpClient = mock[HTTPClient]
		authenticatedTwitter = new Twitter("foo", "bar", httpClient)
		twitter = new Twitter(None, None, httpClient)
	}
}

class APITest extends JUnit4(APITest)
object APITestRunner extends ConsoleRunner(APITest)