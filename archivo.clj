(defn frecuencias[v]
  (into {}(map (fn[x]
                 (cuenta v x))v)))


(defn cuenta[x n]
      {n(count(reduce concat(map (fn[x]
(or(and (== x n) (conj [] x))[]))x)))})
