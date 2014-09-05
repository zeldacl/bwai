(ns lab.dexter.noah.starcraft.models
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