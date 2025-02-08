(ns first-project.functions)

;; not best practice
(def add-2
  (fn [a b]
    (print a b)
    (+ a b)))

(add-2 2 3)

;; Best practice
(defn add-2 [a b]
  (+ a b))

(add-2 7 9)

;; adding documentation for the function
(defn add-2
  "Adds 2 numbers together"
  [a b]
  (+ a b))

(add-2 7 9)

;; Overload function (Not sure that's the name)
;; It's called multi-arity
(defn add-more
  ([a b] (+ a b))
  ([a b c](+ a b c)))

(add-more 7 21)
(add-more 1 2 3)

;; Support any number of arguments
(defn add-all [& x] (+ x))

(add-all 12 1)
(add-all 12 345 567 1)

;; Clojure
(let [a (+ 3 3)
      b (* 8 9)]
  (+ a b))






