package scat.api

import _root_.scala.xml.{Node}
import scala.xml.XML

import scat.domain._

trait FavoriteAPI extends TwitterAPI {
	
	val favoritesPath = twitterUrl + "/favorites"
	
	def getFavorites():List[Status] = {
		credentialsRequired
		null
	}

	def favorite(id:Long):Status = {
		credentialsRequired
		null
	}

	def unfavorite(id:Long):Status = {
		credentialsRequired
		null
	}

}