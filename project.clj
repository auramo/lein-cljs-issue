(defproject lein-cljsbuild-example "1.2.3"
  :plugins [[lein-cljsbuild "1.0.5"]]
  :dependencies [[org.clojure/clojurescript "0.0-3126"]]
  :cljsbuild {
    :builds [{
        :source-paths ["src"]
        :compiler {
          :output-to "out/init.js"
          :optimizations :whitespace
                   :pretty-print true}}]})
