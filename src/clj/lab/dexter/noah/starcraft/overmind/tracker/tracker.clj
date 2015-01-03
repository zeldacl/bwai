(ns lab.dexter.noah.starcraft.overmind.tracker.tracker
  (:use [lab.dexter.noah.starcraft.utils.akka :only [actor dispatch-on ! spawn]])
  (:use [lab.dexter.noah.starcraft.overmind.tracker.meta-flag-tracker :only [meta-flag-tracker]]))

(def tracker
  (let [trackers (atom {})]
    (actor
      (preStart [] (do
                     (swap! trackers assoc :meta-flag-tracker (spawn meta-flag-tracker :name "meta-flag-tracker"))
                     (swap! trackers assoc :creep-tracker (spawn creep-tracker :name "creep-tracker"))
                     (swap! trackers assoc :self-building-tracker (spawn self-building-tracker :name "self-building-tracker")))
      (onReceive [{t :type v :v}]
                 (dispatch-on t
                              :on-start (do (doseq  0))
                              :process (println 1)
                              :register (println 2)))))))