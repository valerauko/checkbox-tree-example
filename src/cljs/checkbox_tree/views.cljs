(ns checkbox-tree.views
  (:require
   [re-frame.core :as re-frame]
   [checkbox-tree.subs :as subs]
   [checkbox-tree.events :as events]
   ["react-checkbox-tree" :as CheckboxTree]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1 "Hello from " @name]
     ]))
