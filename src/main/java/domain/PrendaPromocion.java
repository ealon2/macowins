package domain;

public class PrendaPromocion implements Descuento{

    //TODO: Esta solución no es extensible, dado que para cambiar el valor de la promocion, se debe modificar el codigo
    @Override
    public double obtenerPrecioBruto(Double precioNeto) {
        return precioNeto*0.10;
    }
}
