(ns clojider-lambda.core
  (:require [uswitch.lambada.core :refer [deflambdafn]]
            [clojure.java.io :as io]
            [clojider-lambda.runner :refer [run-simulation]]
            [cheshire.core :refer [generate-stream parse-stream]]))

(deflambdafn clojider.LambdaFn
  [is os ctx]
  (let [input (parse-stream (io/reader is) true)
        output (io/writer os)]
    (println "Running simulation with config" input)
    (let [result (run-simulation
                   (map #(eval (read-string %)) (:scenarios input))
                   (eval (read-string (:simulation input)))
                   (:users input)
                   (:options input))]
      (println "Returning result" result)
      (generate-stream result output)
      (.flush output))))
