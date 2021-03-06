(ns lab.dexter.noah.starcraft.overmind.strategy.strategy
  (:use [lab.dexter.noah.starcraft.utils.akka :only [actor dispatch-on !]]))

(def strategy
  (actor
    (onReceive [{t :type v :v}]
               (dispatch-on t
                            :init (do (println 0))
                            :process (println 1)
                            :register (println 2)))))