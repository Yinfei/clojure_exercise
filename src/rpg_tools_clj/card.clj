(ns rpg-tools-clj.card)

(def deck-of-52-cards (flatten [(range 1 11 1), "Jack", "Queen", "King"]))

(def deck-of-32-cards (flatten [(range 7 11 7), "Jack", "Queen", "King"]))

(def colors ["Clubs", "Hearts", "Diamonds", "Spades"])

(defn pick-joker
  "It returns a Joker"
  []
  (println "Joker"))

(defn pick-from-52-deck
  "It pick a card from a 52 cards deck with two Jokers"
  []
  (if (< (rand-int 55) 2)
    (pick-joker)
    (println (rand-nth deck-of-54-cards) "of" (rand-nth colors))))

(defn pick-from-32-deck
  "It pick a card from a 32 cards deck"
  []
  (println (rand-nth deck-of-32-cards) "of" (rand-nth colors)))

(defn pick-card
  "It pick a card from a deck"
  [type]
  (condp <= type
    52 (pick-from-52-deck)
    32 (pick-from-32-deck)
    (throw (Exception. "Invalid argument. Usage: pick-card [32 52]"))))
