package twitter4s

import twitter4s.domain._

object Twitter {
	
	def authenticate(
		username:String, 
		password:String)										= ()
	def authenticated_?():Boolean					= true
	def timeline()												= ()
	def tweet(body:String)								= ()
	def deleteStatus(id:Int)							= ()
	def getStatus(id:Int):Array[Status]		= null
	def getReplies():Array[Status]				= null
	def getDMs():Array[Status]						= null
	def getSentDMs():Array[Status]				= null
	def destroyDM(id:Int)									= ()
	def follow(user:String)								= ()
	def unfollow(user:String)							= ()
	def block(user:String)								= ()
	def unblock(user:String)							= ()
	def getFavorites():Array[Status]			= null
	def favorite(id:Int)									= ()
	def unfavorite(id:Int)								= ()
	def publicTimeline()									= ()
	def getMe():User											= null
	
}