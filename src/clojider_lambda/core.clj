(ns clojider-lambda.core
  (:require [uswitch.lambada.core :refer [deflambdafn]]
            [clojure.java.io :as io]
            [cheshire.core :refer [generate-stream parse-stream]]))

(deflambdafn clojider.LambdaFn
  [is os ctx]
  (let [input (parse-stream (io/reader is) true)
        output (io/writer os)]
    (println "Hello from Lambda with input" input)
    (generate-stream {:result "ok"} output)
    (.flush output)))
