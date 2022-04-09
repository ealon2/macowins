package domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Venta {
    private List<Item> items;
    private Date fechaDeVenta;
    private TipoDePago tipoDePago;

    public double obtenerMontoBruto(){
        return tipoDePago.aplicarImpuesto(items.stream()
                .mapToDouble(l -> l.obtenerMontoNeto())
                .sum());
    }
}
