(ns first-project.naming)

;; NAMING CONVENTIONS

'valid?         ;; boolean functions
(even? 4)
(odd? 3)
(mod 11 7)
's->t           ;; transformation functions
'mutable!       ;; non-pure functions w/ side effects
'end-with-star* ;; up to the library

(defn is-sum-even [a b]
  (even? (+ a b)))

(is-sum-even 9 1)
(is-sum-even 9 2)

;; IF CONDITION
(defn is-sum-even2 [a b]
  (if (even? (+ a b))
    (+ a b)
    "Not even"))

(is-sum-even2 9 1)
(is-sum-even2 9 2)

;; When is used when we don't care about the false clause
(defn is-sum-even3 [a b]
  (when (even? (+ a b))
    "It's fucking even"))

(is-sum-even3 9 1)
(is-sum-even3 9 2)