(ns rpg-tools-clj.core
  (:gen-class))

(def coin ["Head !" "Tails !"])

(defn coin-flip
  "It flips a coin"
  []
  (println (str "Let's pick a coin : " (rand-nth coin))))

(defn -main
  "It calls coin-flip."
  [& args]
  (coin-flip))
