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
 (fn [db [_ item]]
   (assoc db :checked item)))

(re-frame/reg-event-db
 ::expand-item
 (fn [db [_ item]]
   (assoc db :expanded item)))
