(ns lab.dexter.noah.starcraft.core.mainjni
  (:import (clojure.lang.IDeref)
           (jnibwapi.JNIBWAPI)
           (jnibwapi.BWAPIEventListener)))

(gen-class
  :name "lab.dexter.noah.starcraft.core.mainjni"
  :implements [jnibwapi.BWAPIEventListener clojure.lang.IDeref]
  :state state
  :init init
  :main true
  :constructors {[] []})


(defn -main [& args]
  (let [ai (lab.dexter.noah.starcraft.core.mainjni.)
        api (jnibwapi.JNIBWAPI. ai)]
    (swap! (.state ai) swap-key :api api)
    (bind-api! api)
    (start)))