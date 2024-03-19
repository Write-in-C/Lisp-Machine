(ns factorial-improved)

(defn fac_helper ^Integer [^Integer n ^Integer acc]
      (if (= 1 n)
        acc
        (fac_helper (- n 1) (* acc n))))

(defn factorial ^Integer [^Integer n]
      (fac_helper n 1))