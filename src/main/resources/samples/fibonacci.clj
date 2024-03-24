(ns fibonacci)

(defn fibonacci [N]
  (if ( <= N 1)
    1
    (+ (fibonacci (- N 1)) (fibonacci (- N 2)))))

(print (fibonacci 20))