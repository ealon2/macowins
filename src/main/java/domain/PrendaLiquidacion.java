package domain;

public class PrendaLiquidacion implements Descuento{
    @Override
    public double obtenerPrecioBruto(Double precioNeto) {
        return precioNeto*0.50;
    }
}
