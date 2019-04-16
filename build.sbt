ThisBuild / scalaVersion := "2.12.8"
ThisBuild / organization := "dainslef"

lazy val hello = (project in file("."))
  .settings(
    name := "ScalaPractice",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  )
