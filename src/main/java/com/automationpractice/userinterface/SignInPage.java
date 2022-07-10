package com.automationpractice.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class SignInPage {

    public static final Target INPUT_EMAIL =
            the("Input email")
                    .located(By.id("email"));

    public static final Target INPUT_PASSWORD =
            the("Input password")
                    .located(By.id("passwd"));
    public static final Target BOTON_SIGN_IN =
            the("Botón sign in")
                    .located(By.xpath("//button[@id='SubmitLogin']/span[contains(.,'Sign in')]"));
}
