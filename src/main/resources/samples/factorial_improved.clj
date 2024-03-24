(ns factorial-improved)

(defn helper [n acc]
      (if (= 1 n)
        acc
        (helper (- n 1) (* acc n))))

(defn factorial [n]
      (helper n 1))

(print (factorial 10))