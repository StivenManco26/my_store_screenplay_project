package com.automationpractice.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class AddressPage {
    public static final Target BOTON_PROCESAR_CHECKOUT_ADDRESS =
            the("Botón procesar checkout address")
                    .located(By.xpath("//span[.='Proceed to checkout']"));

}
