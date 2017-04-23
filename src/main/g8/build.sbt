lazy val baseSettings: Seq[Setting[_]] = Seq(
  scalaVersion       := "$scala_version$",
  scalacOptions     ++= Seq(
    "-deprecation",
    "-encoding", "UTF-8",
    "-feature",
    "-language:higherKinds",
    "-language:implicitConversions", "-language:existentials",
    "-unchecked",
    "-Xfatal-warnings",
    "-Xlint",
    "-Yno-adapted-args",
    "-Ywarn-numeric-widen",
    "-Ywarn-value-discard",
    "-Xfuture"
  ),
  resolvers += Resolver.sonatypeRepo("releases")
)

lazy val $name$ = project.in(file("."))
  .settings(moduleName := "$name$")
  .settings(baseSettings: _*)
  .aggregate(core, slides)
  .dependsOn(core, slides)

lazy val core = project
  .settings(moduleName := "$name$-core")
  .settings(baseSettings: _*)


lazy val slides = project
  .settings(moduleName := "$name$-slides")
  .settings(baseSettings: _*)
  .settings(tutSettings: _*)
  .settings(
    tutSourceDirectory := baseDirectory.value / "tut",
    tutTargetDirectory := baseDirectory.value / "tut-out",
    watchSources ++= (tutSourceDirectory.value ** "*.html").get
  ).dependsOn(core)
