ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"
ThisBuild / organization := "vn.edu.mc8max"

val scalaTest = "org.scalatest" %% "scalatest" % "3.2.12"

lazy val root = (project in file("."))
  .settings(
    name := "sample.app1",
    libraryDependencies += scalaTest % Test,
  )
