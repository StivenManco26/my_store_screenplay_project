package com.automationpractice.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ShippingPage {

    public static final Target BOTON_PROCESAR_CHECKOUT_SHIPPING =
            the("Botón procesar checkout shipping")
                    .located(By.xpath("//button[@name='processCarrier']/span[contains(.,'Proceed to checkout')]"));

    public static final Target CHECKBOX_ACEPTAR_TERMINOS =
            the("Checkbox aceptar terminos y condiciones")
                    .located(By.xpath("//input[@id='cgv']"));
}
