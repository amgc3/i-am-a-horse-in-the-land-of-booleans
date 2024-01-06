(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
    (= x nil) false
    (= x false) false
    :else true))

(defn abs [x]
  ( if (< x 0)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (if  (zero? (mod n divisor) )
  true false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? [age]
  (if (and (< age 20) (> age 12)) true false))

(defn not-teen? [age]
  (not (teen? age)))

;generic-doublificate x  takes one argument and
;doubles it if it is a number,
;returns nil if it is an empty collection,
;if it is a list or a vector, returns two times the length of it
;returns true otherwise.
(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (cond (zero? (mod year 400)) true
        (zero? (mod year 100)) false
        (zero? (mod year 4)) true
        :else false))

; '_______'
