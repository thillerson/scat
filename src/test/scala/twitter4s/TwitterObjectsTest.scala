package twitter4s

import org.specs._
import org.specs.runner.{ConsoleRunner, JUnit4}
import scala.xml._

import twitter4s.domain._

class TwitterObjectsTest extends JUnit4(TwitterObjectsTest)
object TwitterObjectTestRunner extends ConsoleRunner(TwitterObjectsTest)

object TwitterObjectsTest extends Specification {

  "A User" should {
    "have a name" in {
      val user = new User(XML.loadString("<user><name>Bob Dobbs</name></user>"))
      user.name must beMatching("Bob Dobbs")
    }
  }
  
}
