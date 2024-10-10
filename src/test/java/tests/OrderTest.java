package tests;

import org.testng.annotations.Test;

public class OrderTest {

    @Test
    public void ordenagregarproducto() {
        System.out.println("orden agregar producto");
    }

    @Test
    public void ordeneliminarproducto() {
        System.out.println("orden eliminar producto");
    }

    @Test
    public void ordenmodificarcantidadproducto() {
        System.out.println("orden actualizar producto");
    }


    @Test
    public void ordencrearnuevo() {
        System.out.println("orden crear nuevo producto");
    }

}
