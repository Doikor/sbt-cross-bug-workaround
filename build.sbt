version := "0.0.1-SNAPSHOT"

crossSbtVersions := Vector("0.13.16", "1.0.3")

scalaVersion in ThisBuild := {
  if((sbtBinaryVersion in pluginCrossBuild).value.startsWith("0.")) "2.10.7" else "2.12.4"
}

lazy val root = (project in file("foo"))
  .settings(
    sbtPlugin := true
  )
