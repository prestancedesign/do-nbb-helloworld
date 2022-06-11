(ns hello)

(defn handler [name]
  (let [name (or name "stranger")
        greeting (str "Hello " name "!")]
    (js/console.log greeting)
    #js {:body greeting}))

#js {:handler handler}
