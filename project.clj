(defproject fundingcircle/ring-accept "_"
  :description "Content negotiation middleware for Ring"
  :url "http://github.com/FundingCircle/ring-middleware-accept"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  
  :dependencies [[org.clojure/clojure "1.9.0"]]

  :plugins [[me.arrdem/lein-git-version "2.0.8"]]

  :git-version
  {:status-to-version
   (fn [{:keys [tag version branch ahead ahead? dirty?] :as git}]
     (if (and tag (not ahead?) (not dirty?))
       (do (assert (re-find #"\d+\.\d+\.\d+" tag)
                   "Tag is assumed to be a raw SemVer version")
           tag)
       (if (and tag (or ahead? dirty?))
         (let [[_ prefix patch] (re-find #"(\d+\.\d+)\.(\d+)" tag)
               patch            (Long/parseLong patch)
               patch+           (inc patch)]
           (format "%s.%d-%s-SNAPSHOT" prefix patch+ branch))
         "0.1.0-SNAPSHOT")))})
