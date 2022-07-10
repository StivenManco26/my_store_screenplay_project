package com.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.automationpractice.userinterface.HomePage.BOTON_SECCION_TSHIRT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresaALaSeccion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_SECCION_TSHIRT));
    }

    public static IngresaALaSeccion tShirt(){
        return instrumented(IngresaALaSeccion.class);
    }
}
