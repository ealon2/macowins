package domain;

public enum TipoDePago {
    EFECTIVO(1),
    TARJETA(1,0.10);

    private double impuesto;
    private int cuotas = 1;

    TipoDePago(double impuesto){
        this.impuesto=impuesto;
    }

    TipoDePago(int cuotas,double impuesto){
        this.impuesto =impuesto;
        this.cuotas = cuotas;
    }

    public double aplicarImpuesto(double precioNeto) {
        //TODO: No recuerdo como evaluar el tipoDePago seleccionado. Entiendo que el equal no lo es, pero lo dejo para revisar.
        return precioNeto * cuotas * impuesto;
    }
}
