(ns lab.dexter.noah.starcraft.overmind.overmind
  (:use [lab.dexter.noah.starcraft.utils.akka :only [actor dispatch-on ! spawn]])
  (:use [lab.dexter.noah.starcraft.overmind.command.command-parser :only [command-parser]])
  (:use [lab.dexter.noah.starcraft.overmind.strategy.strategy :only [strategy]])
  (:use [lab.dexter.noah.starcraft.overmind.schedule.schedule :only [schedule]])
  )

;(def )

(defn- initialize [overmind-meta]
  ;(swap! overmind-meta assoc :command-parser (spawn command-parser :name "command-parser"))
  ;(! (:command-parser @overmind-meta) {:type :register :v {}})
  ;(swap! overmind-meta assoc :strategy (spawn strategy :name "strategy"))
  ;(swap! overmind-meta assoc :schedule (spawn schedule :name "schedule"))
  )

(defn on-start [overmind-meta]
  ;(initialize overmind-meta)
  )

(defn on-frame [])

(defn on-end [])

(def overmind
  (let [overmind-meta (atom {})]
     (actor
       (onReceive [{t :type v :v}]
                  (dispatch-on t
                               :on-start (;on-start overmind-meta
                                           )
                               :on-frame (on-frame)
                               :on-end (on-end))))))




