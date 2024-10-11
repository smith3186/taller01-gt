package tests;

import jdk.jfr.Description;
import org.testng.annotations.Test;

public class RegisterTest {


    public class RegisterPage {

        @Test(groups = {"Functional"})
        @Description("TC-Register-01")
        public void registroexitoso() {

        }


        @Test(groups = {"Functional", "Integration"})
        @Description("TC-Register-02")
        public void registrocamposfaltantes() {

        }

        @Test(groups = {"Functional", "Regression"})
        @Description("TC-Register-03")
        public void registroformatocorreoerrado() {

        }

        @Test(groups = {"Regression"})
        @Description("TC-Register-04")
        public void registroclavesegura() {

        }

        @Test(groups = {"Functional", "Integration"})
        @Description("TC-Register-05")
        public void registroconfirmacionclave() {

        }

        @Test(groups = {"Integration"})
        @Description("TC-Register-06")
        public void registrocorreounico() {

        }


    }


}
