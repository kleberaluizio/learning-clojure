(ns first-project.import-file
  (:require [first-project.add-2 :as add-2]
            [clojure.string :as s])
  (:import [java.lang Math]))

(add-2/add-2-to 4)
(Math/decrementExact 10)
(s/join "-" ["T" "E" "S" "T"])

