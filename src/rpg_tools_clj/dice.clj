(ns rpg-tools-clj.dice)

(defn standard-roll
  "It rolls a collection of standard dices"
  [dice_number max-value]
  (map inc (take dice_number (repeatedly #(rand-int max-value)))))

(defn fudge-roll
  "It rolls a collection of fudge dices"
  [dice_number]
  (take dice_number (repeatedly #(+ (rand-int (- 2 -1)) -1))))
