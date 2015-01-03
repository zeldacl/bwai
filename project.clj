(defproject bwai "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.logging "0.3.0"]
                 [ch.qos.logback/logback-classic "1.1.2"]
                 [org.slf4j/slf4j-api "1.7.7"]
                 [com.google.protobuf/protobuf-java "2.5.0"]
                 [org.flatland/protobuf "0.7.1"]
                 [circleci/clj-yaml "0.5.3"]
                 [com.typesafe.akka/akka-actor_2.11 "2.3.8"]
                 [com.typesafe.akka/akka-slf4j_2.11 "2.3.8"]
                 [com.typesafe.akka/akka-remote_2.11 "2.3.8"]
                 [com.typesafe.akka/akka-kernel_2.11 "2.3.8"]]
  :source-paths ["src/clj"]
  :java-source-paths ["src/jvm"]
  :resource-paths ["resources"]
  :test-paths ["test/clj"]
  :plugins [[lein-protobuf "0.4.1"]]
  :proto-path "resources/proto"
  :warn-on-reflection true
  ;:aot :all ;[com.cyou.gmonitor.CentralMain]
  ;:main com.cyou.gmonitor.centralmain
  :uberjar-name "bwai-0.00.1.jar"
  :uberjar-exclusions [#".+\.java$" #".+\.sql$" #".+tmpls/.+\.tpl"
                       #".+\.clj$" #"pom.xml" #"META-INF/DUMMY.SF" #"META-INF/ECLIPSEF.SF"])
