(defproject fundingcircle/ring-accept "2.0.3"
  :description "Content negotiation middleware for Ring"
  :url "http://github.com/FundingCircle/ring-middleware-accept"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :profiles {:dev {:dependencies [[midje "1.9.1"]]
                   :plugins [[lein-midje "3.2.1"]]
                   :aliases {"test" ["midje"]}}})
