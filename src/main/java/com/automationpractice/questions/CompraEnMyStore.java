package com.automationpractice.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.automationpractice.userinterface.PaymentPage.LABEL_ORDEN_COMPLETADA;

public class CompraEnMyStore implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LABEL_ORDEN_COMPLETADA.resolveFor(actor).isVisible();
    }

    public static CompraEnMyStore esExitosa(){
        return new CompraEnMyStore();
    }
}
