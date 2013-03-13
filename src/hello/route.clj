(ns hello.route
  (:use compojure.core
		hello.index
		[hiccup.middleware :only (wrap-base-url)])
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
			[compojure.response :as response]))

(defroutes hello-routes
(GET "/" [] (index-page))
  (route/resources "/")
  (route/not-found "Page not found"))

(def app
  (-> (handler/site hello-routes)
	  (wrap-base-url)))
