(ns rpg-tools-clj.coin)

(def coin ["Head !" "Tails !"])

(defn coin-flip
  "It flips a coin"
  []
  (println (str "Let's pick a coin : " (rand-nth coin))))
