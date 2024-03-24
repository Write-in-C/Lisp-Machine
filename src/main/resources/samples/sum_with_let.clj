(ns sum_with_let)
(defn sum_with_let []
      (let [a 5]
            (let [b 10] (+ a b))))

(print (sum_with_let))