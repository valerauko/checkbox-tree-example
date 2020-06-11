(ns checkbox-tree.events
  (:require
   [re-frame.core :as re-frame]
   [checkbox-tree.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
