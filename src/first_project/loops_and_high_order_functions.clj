(ns first-project.loops-and-high-order-functions)

;;LOOPS
;; recursion

(defn factorial [n]
  (if (> n 1)
    (* n (factorial (dec n)))
    1))

;; dec is equals number minus 1
(dec 8)
;; inc is equals number plus 1
(inc 8)
(factorial 5)
(* 5 4 3 2 1)

;; HIGH ORDER FUNCTIONS
;; It takes a functions as argument or it returns a function
;; map, filter, reduce
;; (map <predicate function> <collection>)
(map inc [1 2 3 4 5])
(map factorial [1 2 3 4 5])

;; using anonymous function
(map
  (fn [n] (* 2 n)) [1 2 3 4 5])

;; using lambda function
(map
  #(* 2 %)
  [1 2 3 4 5])

;; filter
(filter
  even? [1 2 3 4 5])
(filter
  #(= 3 %) [1 2 3 4 5])

;; reduce
;; (reduce <predicate function> <collection>)
;; (reduce <predicate function> <initial value> <collection>)
(reduce + [1 2 3 4 5])
(reduce + 10 [1 2 3 4 5])

(reduce
  (fn [acc curr] (assoc acc curr curr))
  {}
  [1 2 3 4 5])

(reduce (fn [acc curr] (assoc acc curr curr)) {} (filter even? [1 2 3 4 5]))


;; some
(some #{9} [4 5 2 9 0 1])

;; clojures
(defn sum-with [x]
  (fn [y]
    (+ x y)))

((sum-with 3) 4)

(def add-to-3
  (sum-with 3))

(add-to-3 4)