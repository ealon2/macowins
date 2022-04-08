package domain;

public enum TipoDePago {
    EFECTIVO,
    TARJETA;
    public double aplicarImpuesto(double precioNeto){
        //TODO: No recuerdo como evaluar el tipoDePago seleccionado. Entiendo que el equal no lo es, pero lo dejo para revisar.
        return
                (this.equals(EFECTIVO)?precioNeto*0.50:precioNeto*1.10);
    }
}
