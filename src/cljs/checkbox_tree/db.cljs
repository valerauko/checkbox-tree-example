(ns checkbox-tree.db)

(def default-db
  {:name "CheckboxTree example"
   :tree-struct
   [{:value "mars"
     :label "Mars"
     :children
     [{:value "phobos"
       :label "Phobos"}
      {:value "deimos"
       :label "Deimos"}]}
    {:value "earth"
     :label "Earth"
     :children
     [{:value "moon"
       :label "Moon"}]}]
   :expanded []
   :checked []})
