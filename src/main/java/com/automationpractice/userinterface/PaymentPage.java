package com.automationpractice.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class PaymentPage {

    public static final Target BOTON_PAGAR_POR_BANCO =
            the("Botón pagar por medio de banco")
                    .located(By.xpath("//a[contains(.,'Pay by bank wire (order processing will be longer)')]"));

    public static final Target BOTON_CONFIRMAR_MI_ORDEN =
            the("Botón confirmar mi orden")
                    .located(By.xpath("//span[.='I confirm my order']"));
    public static final Target LABEL_ORDEN_COMPLETADA =
            the("Label de orden completada")
                    .located(By.xpath("//strong[.='Your order on My Store is complete.']"));

}
