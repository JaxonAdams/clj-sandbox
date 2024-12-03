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
(defn reverse-interleave [col n]
  (let [groups (repeat n [])]
    (loop [to-process col
           current-groups (vec groups)
           idx 0]
      (if (seq to-process)
        (recur
         (rest to-process)
         (update current-groups (mod idx n) conj (first to-process))
         (inc idx))
        current-groups))))

(comment
  (reverse-interleave [1 2 3 4 5 6] 2)
  (reverse-interleave (range 9) 3))