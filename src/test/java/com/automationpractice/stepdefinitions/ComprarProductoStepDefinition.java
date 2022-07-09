package com.automationpractice.stepdefinitions;

import com.automationpractice.interactions.Abrir;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ComprarProductoStepDefinition {

    @Dado("que {word} se encuentra en la pagina principal de My store")
    public void queUsuarioSeEncuentraEnLaPaginaPrincipalDeMyStore(String nombreActor) {
        theActorCalled(nombreActor).wasAbleTo(
                Abrir.elNavegador()
        );
    }

    @Dado("se dirige a la seccion t-shirts")
    public void seDirigeALaSeccionTShirts() {

    }

    @Cuando("el agrega un producto al carrito")
    public void elAgregaUnProductoAlCarrito() {

    }

    @Cuando("realiza el checkoput con sus credenciales")
    public void realizaElCheckoputConSusCredenciales(Map<String, String> credenciales) {

    }

    @Entonces("deberia visualizar su orden completada")
    public void deberiaVisualizarSuOrdenCompletada() {

    }
}
