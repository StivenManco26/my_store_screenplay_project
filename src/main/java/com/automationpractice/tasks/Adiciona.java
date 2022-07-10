package com.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.automationpractice.userinterface.TShirtsPage.BOTON_ADICIONAR_AL_CARRITO;
import static com.automationpractice.userinterface.TShirtsPage.BOTON_COLOR_PRENDA;
import static com.automationpractice.userinterface.TShirtsPage.BOTON_PROCESAR_CHECKOUT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Adiciona implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_COLOR_PRENDA),
                Click.on(BOTON_ADICIONAR_AL_CARRITO),
                Click.on(BOTON_PROCESAR_CHECKOUT)
                );
    }

    public static Adiciona unProductoAlCarrito(){
        return instrumented(Adiciona.class);
    }
}
