package twitter4s

import org.specs._
import org.specs.runner.{ConsoleRunner, JUnit4}
import org.specs.mock._
import scala.xml._

import twitter4s.domain._
import twitter4s.httpClient._

object APITest extends TwitterMock {
	
	"The authenticated Twitter service wrapper" should {
		doBefore { init }
		
		"have credentials" in {
			expect {
				one(httpClient).get("http://twitter.com/account/verify_credentials.xml") willReturn (200, XMLData.userXML.toString)
			}
			
			authenticatedTwitter.hasCredentials_? must beTrue
			authenticatedTwitter.authenticated_? must beTrue
		}
		
		"return the currently authenticated resource" in {
			expect {
				one(httpClient).get("http://twitter.com/users/foo.xml") willReturn (200, XMLData.userXML.toString)
			}
			
			val user = authenticatedTwitter.getMe
			user.id must_== 5815992L
		}
	}

}

trait TwitterMock extends Specification with JMocker with ClassMocker {
	var httpClient:HTTPClient = _
	var authenticatedTwitter:Twitter = _
	def init = {
		httpClient = mock[HTTPClient]
		authenticatedTwitter = new Twitter("foo", "bar", httpClient)
	}
}

class APITest extends JUnit4(APITest)
object APITestRunner extends ConsoleRunner(APITest)