ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.9"
ThisBuild / organization := "vn.edu.mc8max"

val scalaTest = "org.scalatest" %% "scalatest" % "3.2.12"

val flinkVersion = "1.14.5"
val flinkDependencies = Seq(
  "org.apache.flink" %% "flink-scala" % flinkVersion,
  "org.apache.flink" %% "flink-streaming-scala" % flinkVersion,
  "org.apache.flink" %% "flink-clients" % flinkVersion,
)

lazy val root = (project in file("."))
  .settings(
    name := "flink.sample.app1",
    libraryDependencies += scalaTest % Test,
    libraryDependencies ++= flinkDependencies,
  )
