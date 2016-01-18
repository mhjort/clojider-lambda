(ns clojider-lambda.core
  (:require [uswitch.lambada.core :refer [deflambdafn]]
            [clojure.java.io :as io]
            [cheshire.core :refer [parse-stream]]))


(deflambdafn clojider.LambdaFn
    [in out ctx]
    (let [input (parse-stream (io/reader in) true)]
      (println "Hello from Lambda with input" input)))
