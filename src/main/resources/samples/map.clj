(ns map)

(defn map [^java.lang.function foo xs]
  (if (= nil xs)
    nil
    (cons (foo (fst xs)) (map foo (snd xs)))))

(print
 (let [f (fn [n] (* n 777))]
   (map
    f (cons 1 (cons 2 (cons 3 (cons 4 (cons 5 nil))))))))