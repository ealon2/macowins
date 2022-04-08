package domain;

public class PrendaNueva implements Descuento{
    @Override
    public double obtenerPrecioBruto(Double precioNeto) {
        return precioNeto;
    }
}
