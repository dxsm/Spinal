name := "prj1"

version := "0.1"

scalaVersion := "2.11.12"

val scopt = "com.github.scopt" %% "scopt" % "3.7.1"
val sourcecode = "com.lihaoyi" %% "sourcecode" % "0.2.7"
val lib1 = "org.slf4j" % "slf4j-simple" % "1.7.25" % Compile
val lib2 = "net.openhft" % "affinity" % "3.1.11"
val lib3 = "commons-io" % "commons-io" % "2.4"
val lib4 = "com.github.dblock" % "oshi-core" % "3.4.0"
val lib5 = "com.github.spinalhdl" %% "spinalhdl-idsl-plugin" % "1.6.0"

lazy val mylib = (project in file("."))
  .settings(
    libraryDependencies ++= Seq(scopt, sourcecode, lib1, lib2, lib3, lib4, lib5,
      compilerPlugin("com.github.spinalhdl" % "spinalhdl-idsl-plugin_2.11" % "1.6.0"))
  )

fork := true


