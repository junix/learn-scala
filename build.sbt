name := "learn-scala"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= {
  val akkaV  = "2.3.9"
  Seq(
    "com.lihaoyi"          %  "ammonite_2.11.7"      % "0.7.4" % "test",
    "com.typesafe"         %  "config"               % "1.3.0",
    "org.json4s"           % "json4s-jackson_2.11"   % "3.4.0",
    "org.mybatis"          %  "mybatis"              % "3.4.1",
    "com.google.code.gson" %  "gson"                 % "2.7",
    "mysql"                %  "mysql-connector-java" % "6.0.3",
    "com.google.guava"     %  "guava"                % "19.0",
    "org.scalaz"           %% "scalaz-core"          % "7.2.5",
    "com.typesafe.akka"    %% "akka-actor"           % akkaV,
    "com.typesafe.akka"    %% "akka-testkit"         % akkaV    % "test",
    "org.specs2"           %% "specs2-core"          % "2.3.11" % "test"
  )
}

initialCommands in (Test, console) := """ammonite.Main().run()"""