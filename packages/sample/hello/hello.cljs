(ns hello)

(defn handler [args]
  (let [name (or (.-name args) "stranger")
        greeting (str "Hello " name "!")]
    #js {:body greeting}))

#js {:handler handler}
