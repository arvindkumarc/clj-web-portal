(ns hello.route
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
(GET ["/user/:id", :id #"[0-9]+"] [id]
  (str "<h1>Hello user " id "</h1>"))
  (route/not-found "Page not found"))

(def app
  (handler/site app-routes))
