package com.automationpractice.stepdefinitions;

import com.automationpractice.interactions.Abrir;
import com.automationpractice.questions.CompraEnMyStore;
import com.automationpractice.tasks.Adiciona;
import com.automationpractice.tasks.IngresaALaSeccion;
import com.automationpractice.tasks.Realiza;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ComprarProductoStepDefinition {

    @Dado("que {word} se encuentra en la pagina principal de My store")
    public void queUsuarioSeEncuentraEnLaPaginaPrincipalDeMyStore(String nombreActor) {
        theActorCalled(nombreActor).wasAbleTo(
                Abrir.elNavegador()
        );
    }

    @Dado("se dirige a la seccion t-shirts")
    public void seDirigeALaSeccionTShirts() {
        withCurrentActor(IngresaALaSeccion.tShirt());
    }

    @Cuando("el agrega un producto al carrito")
    public void elAgregaUnProductoAlCarrito() {
        withCurrentActor(Adiciona.unProductoAlCarrito());
    }

    @Cuando("realiza el checkoput con sus credenciales")
    public void realizaElCheckoputConSusCredenciales(Map<String, String> credenciales) {
        withCurrentActor(Realiza.checkoutDeLaCompra(credenciales));
    }

    @Entonces("deberia visualizar su orden completada")
    public void deberiaVisualizarSuOrdenCompletada() {
        theActorInTheSpotlight().should(seeThat(CompraEnMyStore.esExitosa()));
    }
}
