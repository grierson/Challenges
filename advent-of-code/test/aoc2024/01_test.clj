(ns aoc2024.01-test
  (:require [clojure.test :refer [deftest is testing are]]
            [aoc2024.01 :refer []]))

(deftest parse-test
  (testing "first example"
    (is (= (parse "1abc2") 12))))
