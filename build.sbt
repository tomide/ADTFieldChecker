ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "test",
    libraryDependencies ++= Seq("com.google.ortools" % "ortools-java" % "9.4.1874",
      "org.scalatest" %% "scalatest" % "3.2.9" % "test",
      "com.lihaoyi" %% "pprint" % "0.7.0",
      "com.stephenn" %% "scalatest-json-jsonassert" % "0.2.0",
      "com.stephenn" %% "scalatest-json4s" % "0.2.0",
      "com.stephenn" %% "scalatest-play-json" % "0.2.0",
      "com.stephenn" %% "scalatest-circe" % "0.2.0",
      "com.stephenn" %% "scalatest-argonaut" % "0.2.0",
      "com.stephenn" %% "scalatest-jsoniter-scala" % "0.2.0",
      "io.circe" %% "circe-generic-extras" % "0.14.3",
      "io.circe" %% "circe-generic" % "0.15.0-M1"
    )
  )
