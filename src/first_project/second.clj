(ns first-project.second)

(def temp-vector
  (vector 1 2 3))

(def temp-list
  (list 1 2 3))

; Both vector and list are a Collection (Polymorphism)
(conj temp-vector 10)
(conj temp-list 10)

;Polymorphism
(coll? temp-vector)
(coll? temp-list)
(seq? temp-vector)
(seq? temp-list)

(first temp-list)
(second temp-vector)

(type temp-vector)
(type temp-list)


;SET
(set [1 2 3 4 5 3 1])

(def temp-set
  #{1 3 4 2})

(coll? temp-set)

; HASH MAP
(hash-map "a" 1
          "b" 2
          "c" 3)

(def temp-hash
  {:a 1,
   :b 2,
   :c 3,
   :nested-thing {:another-key "value"}})

(type temp-hash)

;;get
(get temp-hash :b)
(get temp-hash :nested-thing)
(get (get temp-hash :nested-thing) :another-key)
(get-in temp-hash [:nested-thing :another-key])

;;mutations
(assoc temp-hash :a-new-key "a new value")
(assoc-in temp-hash[:nested-thing :a-new-key ]"a new value in")
(dissoc temp-hash :c)

;;referential transparency
(= temp-hash {:a 1,
              :b 2,
              :c 3,
              :nested-thing {:another-key "value"}})