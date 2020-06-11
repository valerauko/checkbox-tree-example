(ns checkbox-tree.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::name
 (fn [db]
   (:name db)))

(re-frame/reg-sub
 ::tree-struct
 (fn [db]
   (:tree-struct db)))

(re-frame/reg-sub
 ::items-checked
 (fn [db _]
   (:checked db)))

(re-frame/reg-sub
 ::items-expanded
 (fn [db _]
   (:expanded db)))
