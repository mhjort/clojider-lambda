(defproject clojider-lambda "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [uswitch/lambada "0.1.0"]
                 [cheshire "5.5.0"]
                 [clj-gatling "0.7.4" :exclusions [io.gatling/gatling-charts
                                                   io.gatling.highcharts/gatling-charts-highcharts]]]
  :aot [clojider-lambda.core])


