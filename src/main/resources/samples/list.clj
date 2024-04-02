(ns list)

(defn list []
  (cons 1 (cons 2 (cons 3 (cons 4 (cons 5 nil))))))

(print (list))