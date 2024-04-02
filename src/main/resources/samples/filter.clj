(ns filter)

(defn filter [^java.lang.function foo xs]
  (if (= xs nil)
    nil
    (if (foo (fst xs))
      (cons (fst xs) (filter foo (snd xs)))
      (filter foo (snd xs)))))

(print
 (let [f (fn [n] (= n 5))]
   (filter
    f (cons 1 (cons 2 (cons 3 (cons 4 (cons 5 6))))))))