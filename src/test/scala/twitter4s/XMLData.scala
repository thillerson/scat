package twitter4s

object XMLData {
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
	
	val publicTimeline = <statuses type="array">
	    <status>
	      <created_at>Sun Apr 19 06:08:06 +0000 2009</created_at>
	      <id>1556513084</id>
	      <text>@Honeypott310  One track?</text>
	      <source>&lt;a href="http://www.tweetdeck.com/"&gt;TweetDeck&lt;/a&gt;</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id/>
	      <in_reply_to_user_id>16897239</in_reply_to_user_id>
	      <favorited>false</favorited>
	      <user>
	      <id>18555957</id>
	      <name>Eric Gates</name>
	      <screen_name>eric_from_aleks</screen_name>
	      <description>Like to hold birds near face while saving students failing Math or Chem</description>
	      <location>Irvine, CA</location>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url>http://www.aleks.com</url>
	      <protected>false</protected>
	      <followers_count>862</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:06 +0000 2009</created_at>
	      <id>1556513082</id>
	      <text>@goldenmusicmgmt RIGHT HERE FAM!!! Lol</text>
	      <source>web</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id>1556496800</in_reply_to_status_id>
	      <in_reply_to_user_id>29014557</in_reply_to_user_id>
	      <favorited>false</favorited>
	      <user>
	      <id>25938835</id>
	      <name>Mz Epiq the Producer</name>
	      <screen_name>MzEpiqBeatz</screen_name>
	      <description/>
	      <location>Las Vegas, NV</location>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url>http://www.myspace.com/mzepiqbeatz</url>
	      <protected>false</protected>
	      <followers_count>98</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:06 +0000 2009</created_at>
	      <id>1556513080</id>
	      <text>http://twitpic.com/3l004 - Chalie puts it all on the line</text>
	      <source>&lt;a href="http://twitpic.com/"&gt;TwitPic&lt;/a&gt;</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id/>
	      <in_reply_to_user_id/>
	      <favorited>false</favorited>
	      <user>
	      <id>14577188</id>
	      <name>colonel32</name>
	      <screen_name>colonel32</screen_name>
	      <description>I like php, doom metal, phish, and fruity pebbles. and i coded twitmatic.</description>
	      <location>Napa, CA</location>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url>http://www.ffwd.com</url>
	      <protected>false</protected>
	      <followers_count>169</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:06 +0000 2009</created_at>
	      <id>1556513079</id>
	      <text>@patg231 Are you a friend of @matt231? Or are you his cousin?</text>
	      <source>web</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id/>
	      <in_reply_to_user_id>21469176</in_reply_to_user_id>
	      <favorited>false</favorited>
	      <user>
	      <id>19275274</id>
	      <name>Matt</name>
	      <screen_name>MATT1604</screen_name>
	      <description>I'm Matt. Check out my website, because I can't do a bio in 160 characters :P</description>
	      <location>Sydney, Australia</location>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url>http://www.matt1604.com</url>
	      <protected>false</protected>
	      <followers_count>106</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:06 +0000 2009</created_at>
	      <id>1556513078</id>
	      <text>@primaDONNA90 I KNOW ITS MAD FUNNY I MADE IT UP MYSELF</text>
	      <source>web</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id>1556509878</in_reply_to_status_id>
	      <in_reply_to_user_id>24744359</in_reply_to_user_id>
	      <favorited>false</favorited>
	      <user>
	      <id>18055557</id>
	      <name>Exclusive</name>
	      <screen_name>5starhiphopExc1</screen_name>
	      <description/>
	      <location/>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url>http://www.5STARHIPHOP.com</url>
	      <protected>false</protected>
	      <followers_count>646</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:06 +0000 2009</created_at>
	      <id>1556513077</id>
	      <text>@snugglezz sure I would, why wouldnt I? I stopped watching MTV in the 90s lol</text>
	      <source>&lt;a href="http://www.tweetdeck.com/"&gt;TweetDeck&lt;/a&gt;</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id>1556507423</in_reply_to_status_id>
	      <in_reply_to_user_id>21550185</in_reply_to_user_id>
	      <favorited>false</favorited>
	      <user>
	      <id>28712932</id>
	      <name>Chris Lejarzar</name>
	      <screen_name>ChrisLejarzar</screen_name>
	      <description>Just an average guy really that will occassionally wear a pink shirt and white jacket</description>
	      <location>Modesto, California</location>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url>                       </url>
	      <protected>false</protected>
	      <followers_count>355</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:06 +0000 2009</created_at>
	      <id>1556513076</id>
	      <text>susanin:Реальное интересное видео испорчено музыкой. А уж эта песня ну никак. Кому интересен перевод...htt http://joi.nu/~005ba #avsimsu</text>
	      <source>web</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id/>
	      <in_reply_to_user_id/>
	      <favorited>false</favorited>
	      <user>
	      <id>26515381</id>
	      <name>Avsim.Su</name>
	      <screen_name>avsimsu</screen_name>
	      <description/>
	      <location/>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url>http://www.avsim.su</url>
	      <protected>false</protected>
	      <followers_count>6</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:06 +0000 2009</created_at>
	      <id>1556513075</id>
	      <text>@risoarisco jajaj lo clickeaste??? desocupado. El que me llegó a mí no mencionaba a Oprah</text>
	      <source>&lt;a href="http://www.netvibes.com/subscribe.php?module=Twitter"&gt;Netvibes&lt;/a&gt;</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id>1556437762</in_reply_to_status_id>
	      <in_reply_to_user_id>15339173</in_reply_to_user_id>
	      <favorited>false</favorited>
	      <user>
	      <id>6009262</id>
	      <name>Nata</name>
	      <screen_name>Anval</screen_name>
	      <description/>
	      <location/>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url>http://heyyoshimi.tumblr.com/</url>
	      <protected>false</protected>
	      <followers_count>47</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:06 +0000 2009</created_at>
	      <id>1556513074</id>
	      <text>はーグラコロシーズン早く来い来い（＾o＾）））</text>
	      <source>web</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id/>
	      <in_reply_to_user_id/>
	      <favorited>false</favorited>
	      <user>
	      <id>16363424</id>
	      <name>ヤマドリヨシトモ</name>
	      <screen_name>yamadori</screen_name>
	      <description>フォローするも外すもお気軽にどうぞ(´∀｀)　但しつぶやきが超多い＆キモいのでご注意下さい……あと最近ローランド様の事しか考えてません　pixivID：118209</description>
	      <location>ウィンドラント</location>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url>http://mappinikki.main.jp/</url>
	      <protected>false</protected>
	      <followers_count>113</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:06 +0000 2009</created_at>
	      <id>1556513073</id>
	      <text>@claireo831 awww it's working for me!! But I'm in mh...  Hmmm cold shower? ^^</text>
	      <source>&lt;a href="http://twitterfon.net/"&gt;TwitterFon&lt;/a&gt;</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id>1556482735</in_reply_to_status_id>
	      <in_reply_to_user_id>24291207</in_reply_to_user_id>
	      <favorited>false</favorited>
	      <user>
	      <id>15952565</id>
	      <name>Nicholas Ahn</name>
	      <screen_name>nicholas_ahn</screen_name>
	      <description/>
	      <location>iPhone: 37.135422,-121.644989</location>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url/>
	      <protected>false</protected>
	      <followers_count>17</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:06 +0000 2009</created_at>
	      <id>1556513072</id>
	      <text>It only hurts wen im breathing, my heart only breaks wen its beating..i miss him so much.</text>
	      <source>&lt;a href="http://help.twitter.com/index.php?pg=kb.page&amp;id=75"&gt;txt&lt;/a&gt;</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id/>
	      <in_reply_to_user_id/>
	      <favorited>false</favorited>
	      <user>
	      <id>21532893</id>
	      <name>kelsie bliss</name>
	      <screen_name>kelsie2821</screen_name>
	      <description>hey im kelsie and i love cats!! lol</description>
	      <location>arkansas</location>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url/>
	      <protected>false</protected>
	      <followers_count>4</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:06 +0000 2009</created_at>
	      <id>1556513069</id>
	      <text>@kotmkg ホントにねっ☆</text>
	      <source>&lt;a href="http://tw.ah-huh.net/"&gt;tw.ah-huh.net&lt;/a&gt;</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id/>
	      <in_reply_to_user_id>20443974</in_reply_to_user_id>
	      <favorited>false</favorited>
	      <user>
	      <id>20308472</id>
	      <name>ほうき</name>
	      <screen_name>ooyu</screen_name>
	      <description>^o^&amp;lt;ついったー</description>
	      <location/>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url>http://www.pixiv.net/member.php?id=132369</url>
	      <protected>false</protected>
	      <followers_count>17</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:06 +0000 2009</created_at>
	      <id>1556513068</id>
	      <text>sleeker than slick</text>
	      <source>web</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id/>
	      <in_reply_to_user_id/>
	      <favorited>false</favorited>
	      <user>
	      <id>25495902</id>
	      <name>eleanor barnes</name>
	      <screen_name>eleanorbarnes</screen_name>
	      <description/>
	      <location/>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url/>
	      <protected>false</protected>
	      <followers_count>6</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:06 +0000 2009</created_at>
	      <id>1556513067</id>
	      <text>@Ordinal http://tinyurl.com/d4fpaa</text>
	      <source>&lt;a href="http://www.twhirl.org/"&gt;twhirl&lt;/a&gt;</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id/>
	      <in_reply_to_user_id>792333</in_reply_to_user_id>
	      <favorited>false</favorited>
	      <user>
	      <id>8435922</id>
	      <name>SignpostMarv</name>
	      <screen_name>SignpostMarv</screen_name>
	      <description/>
	      <location>Durham, UK</location>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url>http://blog.signpostmarv.name/</url>
	      <protected>false</protected>
	      <followers_count>125</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:08 +0000 2009</created_at>
	      <id>1556513066</id>
	      <text>@AndyHannon Sleeping is never easy when you're not feeling well. I was up until 3am last night with the hacking cough.</text>
	      <source>web</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id>1556487598</in_reply_to_status_id>
	      <in_reply_to_user_id>11251292</in_reply_to_user_id>
	      <favorited>false</favorited>
	      <user>
	      <id>15052203</id>
	      <name>Pattie Lee</name>
	      <screen_name>Piratealice</screen_name>
	      <description>Experienced Media Buyer/Planner avail for freelance or full time work (avatar courtesy of @zesmerelda)</description>
	      <location>Chicago</location>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url>http://tinyurl.com/dgxdsm</url>
	      <protected>false</protected>
	      <followers_count>437</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:06 +0000 2009</created_at>
	      <id>1556513065</id>
	      <text>@heidimontag your stupid.</text>
	      <source>web</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id>1556374963</in_reply_to_status_id>
	      <in_reply_to_user_id>23396761</in_reply_to_user_id>
	      <favorited>false</favorited>
	      <user>
	      <id>20650324</id>
	      <name>David Brooks</name>
	      <screen_name>DavidMbrooks</screen_name>
	      <description/>
	      <location>United states</location>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url>http://myspace.com/shitheadnumber2</url>
	      <protected>false</protected>
	      <followers_count>42</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:06 +0000 2009</created_at>
	      <id>1556513063</id>
	      <text>just saw Hannah Montana the movie and I LOVED It. I wanna go see it again.. ASAP</text>
	      <source>web</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id/>
	      <in_reply_to_user_id/>
	      <favorited>false</favorited>
	      <user>
	      <id>24622484</id>
	      <name>Elizabeth Husted</name>
	      <screen_name>ellielovesyou7</screen_name>
	      <description/>
	      <location/>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url/>
	      <protected>false</protected>
	      <followers_count>6</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:06 +0000 2009</created_at>
	      <id>1556513062</id>
	      <text>just saw haunting in conneticut..terribly disturbing movie, i actually cried, &amp; i thought i was gonna faint. ugh :'(</text>
	      <source>web</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id/>
	      <in_reply_to_user_id/>
	      <favorited>false</favorited>
	      <user>
	      <id>25163423</id>
	      <name>Christa Hudson</name>
	      <screen_name>degrassiaddict</screen_name>
	      <description/>
	      <location/>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url/>
	      <protected>false</protected>
	      <followers_count>2</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:05 +0000 2009</created_at>
	      <id>1556513061</id>
	      <text>Sleep</text>
	      <source>web</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id/>
	      <in_reply_to_user_id/>
	      <favorited>false</favorited>
	      <user>
	      <id>32979480</id>
	      <name>Aslıhan </name>
	      <screen_name>arslannn</screen_name>
	      <description/>
	      <location/>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url/>
	      <protected>false</protected>
	      <followers_count>1</followers_count>
	    </user>
	    </status><status>
	      <created_at>Sun Apr 19 06:08:06 +0000 2009</created_at>
	      <id>1556513060</id>
	      <text>@1Mrsg haha wow........whot are you guys doinf over there. Woops.</text>
	      <source>&lt;a href="http://help.twitter.com/index.php?pg=kb.page&amp;id=75"&gt;txt&lt;/a&gt;</source>
	      <truncated>false</truncated>
	      <in_reply_to_status_id/>
	      <in_reply_to_user_id>30767546</in_reply_to_user_id>
	      <favorited>false</favorited>
	      <user>
	      <id>18596543</id>
	      <name>Kaitlyn</name>
	      <screen_name>FruitloopsXsays</screen_name>
	      <description/>
	      <location/>
	      <profile_image_url>http://static.twitter.com/images/default_profile_normal.png</profile_image_url>
	      <url/>
	      <protected>false</protected>
	      <followers_count>12</followers_count>
	    </user>
	    </status>
	    </statuses>
  
}