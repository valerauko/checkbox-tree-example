(ns checkbox-tree.views
  (:require
   [re-frame.core :as re-frame]
   [checkbox-tree.subs :as subs]
   [checkbox-tree.events :as events]
   ["react-checkbox-tree" :as CheckboxTree]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])
        tree-struct (re-frame/subscribe [::subs/tree-struct])
        checked (re-frame/subscribe [::subs/items-checked])
        expanded (re-frame/subscribe [::subs/items-expanded])]
    [:div
     [:h1 "This is " @name]
     [:> CheckboxTree
      {:nodes @tree-struct
       :checked @checked
       :expanded @expanded
       :show-expand-all true
       :on-check #(re-frame/dispatch [::events/check-item %])
       :on-expand #(re-frame/dispatch [::events/expand-item %])}]]))
