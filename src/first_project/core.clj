(ns first-project.core)

; Syntax is simple, it uses prefix notation, aka polish notation
(defn plusTen [u] (+ u 10))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(foo "Kleber")

; First Comment
(plusTen 1)