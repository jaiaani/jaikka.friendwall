(ns friendwall.core
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [config.core :refer [env]]
            [rum.core :refer [defc render-static-markup]])
  (:gen-class))

(defc main-page []
  [:div {:id "main-div"
         :class "main-page-div"}
   [:h1 "Hello Jaiane!"]])

(defc friends-page []
  [:id {:id "main-div"
        :class "main-page-div"}
   [:h1 "There are no friends yet, baby :("]])

(defroutes app
           (GET "/" [] (render-static-markup (main-page)))
           (GET "/friends" [] (render-static-markup (friends-page))))

(defn -main
  [& _]
  (run-jetty (wrap-defaults app site-defaults) {:port (:port env)}))