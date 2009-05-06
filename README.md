Scat
====

A Scala Twitter API wrapper
---------------------------

This work in progress allows me to learn more about Scala and you to post sweet tweets from your JVM in a more palatable way - THE SCALA WAY.

My goal is to make a complete 1 to 1 between the Twitter API and this API wrapper. I welcome any constructive criticism.

What it do
----------

Try this on your line of commanding:

    [tony@tony:~/work/scat] (master)
    $ mvn scala:console
    [INFO] Scanning for projects...
    [INFO] Searching repository for plugin with prefix: 'scala'.
    [INFO] ------------------------------------------------------------------------
    [INFO] Building scat
    [INFO]    task-segment: [scala:console]
    [INFO] ------------------------------------------------------------------------
    [INFO] Preparing scala:console
    [INFO] [resources:resources]
    [INFO] Using default encoding to copy filtered resources.
    [INFO] [compiler:compile]
    [INFO] Nothing to compile - all classes are up to date
    [INFO] [scala:compile {execution: default}]
    [INFO] Checking for multiple versions of scala
    [INFO] Nothing to compile - all classes are up to date
    [INFO] [scala:console]
    [INFO] Checking for multiple versions of scala
    Welcome to Scala version 2.7.3.final (Java HotSpot(TM) Client VM, Java 1.5.0_16).
    Type in expressions to have them evaluated.
    Type :help for more information.
    
    scala> import scat._
    import scat._
    
    scala> val twitter = new Twitter("{username}", "{password}")
    val twitter = new Twitter("{username}", "{password}")
    twitter: scat.Twitter = scat.Twitter@cc8157
    
    scala> twitter.publicTimeline
    twitter.publicTimeline
    res0: List[scat.domain.Status] = List(Status("is going to a farawa..." by Keeelaahbebs), Status("@AubreyODay it's bec..." by Krissykiss), Status("@HilzFuld @aloncarme..." by ronenk), Status("@sparkymat OK, so ba..." by vinaygmurthy), Status("@Maharishi_VeLLe no ..." by SBnewnie), Status("CHECK OUT THE NEW CL..." by AudioGenius), Status("I wish clouds puked ..." by RunWithForest), Stat...
    scala> twitter.friendsTimeline
    twitter.friendsTimeline
    res1: List[scat.domain.Status] = List(Status("lolz from scala" by scat4scala))
    
    scala> twitter.tweet("tweetin from scala lol")
    twitter.tweet("tweetin from scala lol")
    res2: scat.domain.Status = Status("tweetin from scala l..." by scat4scala)
    
    