(defproject hello "0.1.0-SNAPSHOT"
  :description "Unknown description"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.5"]
				 [hiccup "1.0.0"]
				 [enlive "1.1.1"]]
  :plugins [[lein-ring "0.8.2"]]
  :ring {:handler hello.route/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.3"]]}})
