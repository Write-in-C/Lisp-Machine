(ns factorial)
(defn factorial ^Integer [^Integer n]
      (if (= n 0)
        1
        (* n (factorial (- n 1)))))
