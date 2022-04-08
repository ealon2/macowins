package domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private Long cantidad;
    private Prenda prenda;
    private double precioBase;
    private Descuento descuento;

    public double obtenerPrecioNeto(){
        return descuento.obtenerPrecioBruto(precioBase);
    }

    public double obtenerMontoNeto(){
        return descuento.obtenerPrecioBruto(precioBase)*cantidad;
    }
}
