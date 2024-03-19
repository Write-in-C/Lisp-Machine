(ns tribonacci)

(defn tribonacci ^Integer [^Integer N]
  (if ( <= N 2)
    1
    (+ (+ (tribonacci (- N 1)) (tribonacci (- N 2))) (tribonacci (- N 3)))))