(ns checkbox-tree.events
  (:require
   [re-frame.core :as re-frame]
   [checkbox-tree.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))

(re-frame/reg-event-db
 ::check-item
 ;; the second argument will be whatever vector is given to the dispatch
 ;; the first in the vector will be the name of the event: "check-item"
 (fn [db [_ item]]
   (assoc db :checked item)))

(re-frame/reg-event-db
 ::expand-item
 (fn [db [_ item]]
   (assoc db :expanded item)))
