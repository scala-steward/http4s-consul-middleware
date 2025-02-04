addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.4.1")
addSbtPlugin("org.typelevel" % "sbt-typelevel-ci-release" % "0.4.13")
addSbtPlugin("org.typelevel" % "sbt-typelevel-mergify" % "0.4.13")
addSbtPlugin("org.portable-scala" % "sbt-crossproject" % "1.2.0")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.2.0")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.10.1")

libraryDependencies ++= {
  val http4sVersion = "0.23.15"

  Seq(
    "org.http4s" %% "http4s-ember-client" % http4sVersion,
    "org.http4s" %% "http4s-circe" % http4sVersion,
    "io.circe" %% "circe-generic" % "0.14.2",
  )
}
