(ns lab.dexter.noah.starcraft.overmind.tracker.self-building-tracker
  (:use [lab.dexter.noah.starcraft.utils.akka :only [actor dispatch-on !]]))

(def self-building-tracker
  (actor
    (onReceive [{t :type v :v}]
               (dispatch-on t
                            :on-start (do (println 0))
                            :process (println 1)
                            :register (println 2)))))