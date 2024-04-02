(ns all_in)

(defn factorial [n]
  (let [k 1] (let [t 0] (if (= n t)
                          k
                          (* n (factorial (- n k)))))))

(print (factorial 10))
(print (factorial 5))
(print (factorial 7))


(defn helper [n acc]
  (if (= 1 n)
    acc
    (helper (- n 1) (* acc n))))

(defn factorial_improved [n]
  (helper n 1))

(print (factorial_improved 10))


(defn fibonacci [N]
  (if ( <= N 1)
    1
    (+ (fibonacci (- N 1)) (fibonacci (- N 2)))))

(print (fibonacci 20))


(defn filter [^java.lang.function foo xs]
  (if (= xs nil)
    nil
    (if (foo (fst xs))
      (cons (fst xs) (filter foo (snd xs)))
      (filter foo (snd xs)))))

(print
 (let [f (fn [n] (= n 5))]
   (filter
    f (cons 1 (cons 2 (cons 3 (cons 4 (cons 5 6))))))))


(defn list []
  (cons 1 (cons 2 (cons 3 (cons 4 (cons 5 nil))))))

(print (list))


(defn map [^java.lang.function foo xs]
  (if (= nil xs)
    nil
    (cons (foo (fst xs)) (map foo (snd xs)))))

(print
 (let [g (fn [n] (* n 777))]
   (map
    g (cons 1 (cons 2 (cons 3 (cons 4 (cons 5 nil))))))))


(defn sum [a b]
  (+ a b))

(print (sum 15 27))


(defn sum_with_let []
  (let [a 27]
    (let [b 15] (+ a b))))

(print (sum_with_let))


(defn tribonacci [N]
  (if ( <= N 2)
    1
    (+ (+ (tribonacci (- N 1)) (tribonacci (- N 2))) (tribonacci (- N 3)))))

(print (tribonacci 5))