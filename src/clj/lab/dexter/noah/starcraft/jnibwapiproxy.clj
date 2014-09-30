(ns lab.dexter.noah.starcraft.jnibwapiproxy
  (:import [jnibwapi JNIBWAPI BWAPIEventListener Position Unit]
           [jnibwapi.types.UnitType$UnitTypes]
           [jnibwapi.types.UnitType]))

;(def bwapi [])

(def api nil)

(defn bind-api! [binding] (alter-var-root #'api #(identity %2) binding))

(defn listener-handler []
  (reify BWAPIEventListener
    (^void connected [this]
      (println "a"))

    (^void matchStart [this]
      (let [static-neutral-units (set (.getStaticNeutralUnits api))
            static-minerals (filter #(.. % .getType .isMineralField) static-neutral-units)
            static-geysers (filter #(= (.getType %) jnibwapi.types.UnitType$UnitTypes/Resource_Vespene_Geyser)
                             static-neutral-units)
            map-width (.getMapWidth api)
            map-height (.getMapHeight api)
            map-filename (.getMapFilename api)
            map-name (.getMapName api)
            map-hash (.getMapHash api)
            bulit-map (fn [update-fn w h ]
                        (let [bw-map (vec (repeat w (vec (repeat h nil))))]
                          (reduce
                            (fn [new-map [x y]]
                              (let [new-status (update-fn x y)]
                                (assoc-in new-map [x y] new-status)))
                            bw-map (for [x (range w) y (range h)] [x y]))))
                            ;???(for [x (range h) y (range w)] [x y]))))
            walkable (bulit-map (fn [x y]
                                  (.. api .getMap (.isWalkable (Position. x y))))
                       (* map-width 4) (* map-height 4))
            buildable (bulit-map (fn [x y]
                                   (.. api .getMap (.isBuildable (Position. x y))))
                        map-width map-height)
            ground-height (bulit-map (fn [x y]
                                      (.. api .getMap (.getGroundHeight (Position. x y))))
                            (* map-width 4) (* map-height 4))]
        (println "1")))

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
    (bind-api! api)
    (.start bwapi))
  )