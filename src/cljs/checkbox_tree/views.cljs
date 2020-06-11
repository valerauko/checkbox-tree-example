(ns checkbox-tree.views
  (:require
   ;: there are many and more ways to import (stuff from) javascript packages.
   ;; check out the shadow-cljs docs for reference:
   ;; https://shadow-cljs.github.io/docs/UsersGuide.html#_using_npm_packages
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
     ;; notice the @ (deref)
     [:h1 "This is " @name]
     ;; :> is a shorthand for using React components without preparing them
     ;; the following two are identical in this case:
     ;; [(reagent.core/adapt-react-class CheckboxTree) ,,,]
     ;; [:> CheckboxTree ,,,]
     [:> CheckboxTree
      {:nodes @tree-struct
       :checked @checked
       :expanded @expanded
       ;; kebab-case is automagically converted to camelCase
       :show-expand-all true
       :on-check #(re-frame/dispatch [::events/check-item %])
       :on-expand #(re-frame/dispatch [::events/expand-item %])}]]))
