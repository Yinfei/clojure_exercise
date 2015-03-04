(ns rpg-tools-clj.coin)

(def coin ["Head" "Tails"])

(defn coin-flip
  "It flips a coin"
  []
  (rand-nth coin))
