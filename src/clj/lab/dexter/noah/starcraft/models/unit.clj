(ns lab.dexter.noah.starcraft.models.unit
  (:use [flatland.protobuf.core :only [protodef protobuf protobuf-dump protobuf-load]])
  (:import (org.bwapi.proxy.messages GameMessages$Unit)))

(def Unit (protodef GameMessages$Unit))

(defn make-unit [id]
  {:id id
   :message null
   :previous-message null
   :position null
   :initail-position null
   :tile-position null
   :initial-tile-position null
   :target-position null
   :rally-position null
   :training-queue []
   :load-units #{}})

(defn make-message [message]
  {

    })


(defn make-unit [id]
  {:id 1
   :replay-id 1
   :player-id 1
   :type-id 1
   :x 1
   :y 1
   :tile-x 1
   :tile-y 1
   :angle 1
   :velocity-x 1
   :velocity-y 1
   :hit-points 1
   :shield 1
   :energy 1
   :resources 1
   :resource-group 1
   :last-command-frame 1
   :last-command-id 1
   :last-Attacking-player-id 1
   :initial-type-id 1
   :initial-x 1
   :initial-y 1
   :initial-Tile-x 1
   :initial-tile-y 1
   :initial-hit-points 1
   :initial-resources 1
   :kill-count 1
   :acid-spore-count 1
   :interceptor-count 1
   :scarab-count 1
   :spider-mine-count 1
   :ground-weapon-cooldown 1
   :air-weapon-cooldown 1
   :spell-cooldown 1
   :defense-matrix-points 1
   :defense-matrix-timer 1
   :ensnare-timer 1
   :irradiate-timer 1
   :lockdown-timer 1
   :maelstrom-timer 1
   :order-timer 1
   :plague-timer 1
   :remove-timer 1
   :stasis-timer 1
   :stim-timer 1
   :build-type-id 1
   :training-queue-size 1
   :researching-tech-id 1 ;
   :upgrading-upgrade-id 1
   :remaining-build-timer 1
   :remaining-train-time 1
   :remaining-research-time 1
   :remaining-upgrade-time 1
   :build-unit-id 1
   :target-unit-id 1
   :target-x 1
   :target-y 1
   :order-id 1
   :order-target-id 1
   :secondary-order-id 1
   :rally-x 1
   :rally-y 1
   :rally-unit-id 1
   :addOn-id 1
   :nydus-exit-unit-id 1
   :transport-id 1
   :loaded-units-count 1
   :carrier-unit-id 1
   :hatchery-unit-id 1
   :larva-count 1
   :power-up-unit-id 1
   :exists 1
   :nuke-ready 1
   :accelerating 1
   :attacking 1
   :attack-frame 1
   :being-constructed 1
   :being-gathered 1
   :being-healed 1
   :blind 1
   :braking 1
   :burrowed 1
   :carrying-gas 1
   :carrying-minerals 1
   :cloaked 1
   :completed 1
   :constructing 1
   :defense-matrixed 1
   :detected 1
   :ensnared 1
   :following 1
   :gathering-gas 1
   :gathering-minerals 1
   :hallucination 1
   :holding-position 1
   :idle 1
   :interruptable 1
   :invincible 1
   :irradiated 1
   :lifted 1
   :loaded 1
   :locked-down 1
   :maelstrommed 1
   :morphing 1
   :moving 1
   :parasited 1
   :patrolling 1
   :plagued 1
   :repairing 1
   :selected 1
   :sieged 1
   :starting-attack 1
   :stasised 1
   :stimmed 1
   :stuck 1
   :training 1
   :under-attack 1
   :under-dark-swarm 1
   :under-disruption-web 1
   :under-storm 1
   :unpowered 1
   :upgrading 1
   :visible 1})