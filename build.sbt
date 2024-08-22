ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.3"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % "test"
libraryDependencies += "org.apache.logging.log4j" %% "log4j-api-scala" % "13.1.0"

libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.23.1"

lazy val root = (project in file("."))
  .settings(
    name := "SAO"
  )
