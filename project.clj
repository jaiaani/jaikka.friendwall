(defproject friendwall "0.1.0-SNAPSHOT"
  :description "Demo App for a small social network"
  :url "https://github.com/jaiaani/jaikka.friendwall"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring "1.9.5"]
                 [compojure "1.7.0"]]
  :main ^:skip-aot friendwall.core
  :repl-options {:init-ns friendwall.core}
 )
