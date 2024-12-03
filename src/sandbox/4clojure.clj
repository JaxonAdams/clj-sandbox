(ns sandbox.4clojure)

;; PROBLEM 41 -- DROP Nth
(defn drop-nth [col n]
  (->> col
       (map-indexed list)
       (filter #(not= 0 (mod (inc (first %)) n)))
       (map last)))

(comment
  (drop-nth [1 2 3 4 5 6 7 8] 3))

;; PROBLEM 42 -- FACTORIAL FUN
(defn factorial [n]
  (reduce * (range 1 (inc n))))

(comment
  (factorial 1)
  (factorial 3)
  (factorial 5)
  (factorial 8))

;; PROBLEM 43 -- REVERSE INTERLEAVE