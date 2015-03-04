(defproject rpg_tools_clj "0.1.0-SNAPSHOT"
  :description "My first clojure exercise"
  :url "https://github.com/Yinfei/clojure_exercise"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot rpg-tools-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
