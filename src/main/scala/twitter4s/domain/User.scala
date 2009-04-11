package twitter4s.domain

import _root_.scala.xml.NodeSeq

class User(x:NodeSeq) {
    def name = (x \ "name").text
}
