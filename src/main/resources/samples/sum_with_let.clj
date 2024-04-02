(ns sum_with_let)

(defn sum_with_let []
      (let [a 27]
            (let [b 15] (+ a b))))

(print (sum_with_let))