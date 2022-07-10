package com.automationpractice.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class SummaryPage {

    public static final Target BOTON_PROCESAR_CHECKOUT_SUMMARY =
            the("Boton procesar checkout en summary")
                    .located(By.xpath("//span[.='Proceed to checkout']"));
}
