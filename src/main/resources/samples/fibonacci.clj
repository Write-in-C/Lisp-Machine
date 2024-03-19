(ns fibonacci)

(defn fibonacci ^Integer [^Integer N]
  (if ( <= N 1)
    1
    (+ (fibonacci (- N 1)) (fibonacci (- N 2)))))