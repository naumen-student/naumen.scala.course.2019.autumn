name := "homework_2"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies += "com.lihaoyi" %% "utest" % "0.5.3" % "test"

testFrameworks += new TestFramework("utest.runner.Framework")