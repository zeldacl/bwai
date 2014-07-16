(ns lab.dexter.noah.starcraft.jnibwapiproxy
  (:import [jnibwapi JNIBWAPI BWAPIEventListener Position]))

;(def bwapi [])

(defn listener-handler []
  (reify BWAPIEventListener
    (^void connected [this]
      (println "a"))
    (^void matchStart [this]
      (println "1"))
    (^void matchFrame [this]
      (println "2"))
    (^void matchEnd [this ^boolean winner]
      (println "3"))
    (^void keyPressed [this ^int keyCode]
      (println "4"))
    (^void sendText [this ^String text]
      (println "5"))
    (^void receiveText [this ^String text]
      (println "6"))
    (^void playerLeft [this ^int playerID]
      (println "7"))
    (^void nukeDetect [this ^Position p]
      (println "8"))
    (^void nukeDetect [this]
      (println "9"))
    (^void unitDiscover [this ^int unitID]
      (println "10"))
    (^void unitEvade [this ^int unitID]
      (println "11"))
    (^void unitShow [this ^int unitID]
      (println "12"))
    (^void unitHide [this ^int unitID]
      (println "13"))
    (^void unitCreate [this ^int unitID]
      (println "14"))
    (^void unitDestroy [this ^int unitID]
      (println "15"))
    (^void unitMorph [this ^int unitID]
      (println "16"))
    (^void unitRenegade [this ^int unitID]
      (println "17"))
    (^void saveGame [this ^String gameName]
      (println "18"))
    (^void unitComplete [this ^int unitID]
      (println "19"))
    (^void playerDropped [this ^int playerID]
      (println "20"))))

(defn launch-server! []
  (let [listener (listener-handler)
        bwapi (JNIBWAPI. listener true)]
    (.start bwapi))
  )