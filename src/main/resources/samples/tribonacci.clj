(ns tribonacci)

(defn tribonacci [N]
  (if ( <= N 2)
    1
    (+ (+ (tribonacci (- N 1)) (tribonacci (- N 2))) (tribonacci (- N 3)))))

(print (tribonacci 5))