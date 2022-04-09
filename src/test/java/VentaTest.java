import domain.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

public class VentaTest {


    @Before
    public void setup(){

    }


    @Test
    public void generarUnaVentaEnEfectivoPrendaNueva(){
        Item item = new Item(10,
                new Prenda(TipoDePrenda.PANTALON),
                100.00,
                new PrendaNueva()
                );

        ArrayList<Item> items = new ArrayList<>();
        items.add(item);
        Venta venta = new Venta(items,
                new Date(),
                TipoDePago.EFECTIVO);

        Assert.assertEquals(venta.obtenerMontoBruto(),100.00);
    }


}
