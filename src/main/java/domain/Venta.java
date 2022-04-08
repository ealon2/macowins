package domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Venta {
    private List<Item> items;
    private Date fechaDeVenta;
    private TipoDePago tipoDePago;

    public Venta(){
    }

    public double obtenerMontoBruto(){
        return tipoDePago.aplicarImpuesto(items.stream()
                .mapToDouble(l -> l.obtenerMontoNeto())
                .sum());
    }
}
