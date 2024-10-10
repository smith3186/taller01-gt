package pages;

import org.testng.annotations.Test;

public class RegisterPage {

    @Test
    public void registroexitoso() {
        System.out.println("registro exitoso");
    }

    @Test
    public void registrocamposfaltantes() {
        System.out.println("registro fallido");
    }

    @Test
    public void registroformatocorreoerrado() {
        System.out.println("registro fallido");
    }

    @Test
    public void registroclavesegura() {
        System.out.println("registro exitoso");
    }

    @Test
    public void registroconfirmacionclave() {
        System.out.println("registro exitoso");
    }

    @Test
    public void registrocorreounico() {
        System.out.println("registro fallido");
    }


}
