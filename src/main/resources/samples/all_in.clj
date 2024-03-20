(ns factorial)

(defn factorial1 ^Integer [^Integer n]
      (if (= n 0)
        1
        (* n (factorial1 (- n 1)))))

(defn fac_helper ^Integer [^Integer n ^Integer acc]
      (if (= 1 n)
        acc
        (fac_helper (- n 1) (* acc n))))

(defn factorial ^Integer [^Integer n]
      (fac_helper n 1))

(defn fibonacci ^Integer [^Integer N]
  (if ( <= N 1)
    1
    (+ (fibonacci (- N 1)) (fibonacci (- N 2)))))

(defn sum ^Integer [^Integer a ^Integer b]
     (+ a b))

(defn tribonacci ^Integer [^Integer N]
  (if ( <= N 2)
    1
    (+ (+ (tribonacci (- N 1)) (tribonacci (- N 2))) (tribonacci (- N 3)))))