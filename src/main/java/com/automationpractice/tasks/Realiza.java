package com.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;

import java.util.Map;

import static com.automationpractice.userinterface.AddressPage.BOTON_PROCESAR_CHECKOUT_ADDRESS;
import static com.automationpractice.userinterface.PaymentPage.BOTON_CONFIRMAR_MI_ORDEN;
import static com.automationpractice.userinterface.PaymentPage.BOTON_PAGAR_POR_BANCO;
import static com.automationpractice.userinterface.ShippingPage.BOTON_PROCESAR_CHECKOUT_SHIPPING;
import static com.automationpractice.userinterface.ShippingPage.CHECKBOX_ACEPTAR_TERMINOS;
import static com.automationpractice.userinterface.SignInPage.INPUT_EMAIL;
import static com.automationpractice.userinterface.SignInPage.INPUT_PASSWORD;
import static com.automationpractice.userinterface.SignInPage.BOTON_SIGN_IN;
import static com.automationpractice.userinterface.SummaryPage.BOTON_PROCESAR_CHECKOUT_SUMMARY;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Realiza implements Task {
    private Map<String, String> credenciales;

    public Realiza(Map<String, String> credenciales) {
        this.credenciales = credenciales;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_PROCESAR_CHECKOUT_SUMMARY),
                Type.theValue(credenciales.get("usuario")).into(INPUT_EMAIL),
                Type.theValue(credenciales.get("clave")).into(INPUT_PASSWORD),
                Click.on(BOTON_SIGN_IN),
                Click.on(BOTON_PROCESAR_CHECKOUT_ADDRESS),
                Click.on(CHECKBOX_ACEPTAR_TERMINOS),
                Click.on(BOTON_PROCESAR_CHECKOUT_SHIPPING),
                Click.on(BOTON_PAGAR_POR_BANCO),
                Click.on(BOTON_CONFIRMAR_MI_ORDEN)
                );
    }

    public static Performable checkoutDeLaCompra(Map<String, String> credenciales) {
        return instrumented(Realiza.class, credenciales);
    }
}
