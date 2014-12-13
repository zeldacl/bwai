(ns lab.dexter.noah.starcraft
  (:require '[clojure.java.io :as io])
  (:use [flatland.protobuf.core :only [protodef protobuf protobuf-dump protobuf-load]])
  (:import (org.bwapi.proxy.messages GameMessages$StaticGameData))
  (:import (java.net Socket ServerSocket)))

(defn- run []
  (with-open [server-socket (doto (ServerSocket. 12345)
                             (.setSoTimeout 2000))
              client-socket (.accept server-socket)]
    (loop run-game(client-socket))))

(defn- receive [socket]
  (io/reader socket))

(defn- send [socket]
  (io/write socket))

(defn- run-game [socket]
  (let [Static-game-data (protobuf-load GameMessages$StaticGameData b)]
    ))

(defn -main [& args]
  (println "hello"))