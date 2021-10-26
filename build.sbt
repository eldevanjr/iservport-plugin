organization := "com.iservport"

name := "sbt-iservport"

scalaVersion := "2.12.7"

sbtPlugin := true

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.8.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-web"             % "1.4.4")

enablePlugins(SbtPlugin)

resolvers += Resolver.sonatypeRepo("releases")

resolvers += Resolver.mavenLocal

resolvers += "jitpack" at "https://jitpack.io"

publishMavenStyle := true

//credentials += Credentials(Path.userHome / ".sbt" / ".githubcredentials")
//
//publishTo := Some("GitHub Package Registry" at "https://maven.pkg.github.com/iservport/sbt-iservport")
publishTo := Some("GitHub eldevanjr Apache Maven Packages" at "https://maven.pkg.github.com/eldevanjr/iservport-plugin")
publishMavenStyle := true
credentials += Credentials(
  "GitHub Package Registry",
  "maven.pkg.github.com",
  "eldevanjr",
  System.getenv("PUBLISH_SECRET")
)
