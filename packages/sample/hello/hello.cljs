(ns hello)

(defn handler [name]
  (let [name (or name "straaanger")
        greeting (str "Hello " name "!")]
    (js/console.log greeting)
    #js {:body greeting}))

#js {:handler handler}
