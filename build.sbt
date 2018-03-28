lazy val fiberNet = (
  project in file(".")
).settings(
  scalaVersion := "0.7.0-RC1",
  organization := "com.github.text_thunder",
  name := "fiber_net",
  mainClass := Some("com.github.text_thunder.fiber_net.FiberNet"),
  version := "0.0.1-SNAPSHOT"
)
