(ns lab.dexter.noah.starcraft.overmind.schedule.schedule
  (:use [lab.dexter.noah.starcraft.utils.akka :only [actor dispatch-on !]]))

(def schedule
  (actor
    (onReceive [{t :type v :v}]
               (dispatch-on t
                            :init (do (println 0))
                            :process (println 1)
                            :register (println 2)))))