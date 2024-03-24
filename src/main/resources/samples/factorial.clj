(ns factorial)
(defn factorial [n]
      (let [k 1] (let [t 0] (if (= n t)
        k
        (* n (factorial (- n k)))))))

(print (factorial 10))
(print (factorial 5))
(print (factorial 7))