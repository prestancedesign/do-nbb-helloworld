(ns hello)

(defn -main [name]
  (let [name (or name "stranger")
        greeting (str "Hello " name "!")]
    (js/console.log greeting)
    #js {:body greeting}))

#js {:main -main}
