(ns all-cases.core-test
  (:require [clojure.test :refer :all]
            [all-cases.core :refer :all]))

(deftest check-string-of-one-char-returns-both-cases
  (testing "Given a string 'I' all-cases/all-cases returns a set
 containing i and I"
    (is (= (set-of-all-cases "i") #{"i" "I"}))
    (is (= (set-of-all-cases "I") #{"i" "I"}))))

(deftest check-string-hi-returns-4-variants
  (testing "Given a string 'Hi' all-cases/all-cases returns a set
  containing 4 variants of the passed string"
    (is (= (count (set-of-all-cases "Hi")) 4)))
  (testing "Given a string 'Hi' all-cases/all-cases returns a set
  containing Hi, HI, hi, hI"
    (is (= (set-of-all-cases "Hi") #{"Hi" "HI" "hI" "hi"}))))
