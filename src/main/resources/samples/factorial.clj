(ns factorial)
(defn factorial [n] // можно писать аннотации для типов, типо хинтов [^int n]
      (if (= n 0)
        1
        (* n (factorial (- n 1)))))
