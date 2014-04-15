(defproject bwai "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.logging "0.2.6"]
                 [ch.qos.logback/logback-classic "1.1.2"]
                 [org.slf4j/slf4j-api "1.7.7"]
                 [com.google.protobuf/protobuf-java "2.5.0"]]
  :source-paths ["src/clj"]
  :java-source-paths ["src/jvm"]
  :resource-paths ["resources"]
  :test-paths ["test/clj"]
  :warn-on-reflection true
  ;:aot :all ;[com.cyou.gmonitor.CentralMain]
  ;:main com.cyou.gmonitor.centralmain
  :uberjar-name "bwai-0.00.1.jar"
  :uberjar-exclusions [#".+\.java$" #".+\.sql$" #".+tmpls/.+\.tpl"
                       #".+\.clj$" #"pom.xml" #"META-INF/DUMMY.SF" #"META-INF/ECLIPSEF.SF"])
