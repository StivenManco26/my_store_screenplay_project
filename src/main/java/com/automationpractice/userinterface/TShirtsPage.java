package com.automationpractice.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class TShirtsPage extends PageObject {

    public static final Target BOTON_COLOR_PRENDA = the("Botón de color de la camiseta").located(By.xpath("//ul[@class='color_to_pick_list clearfix']/li[1]/a[1]"));
    public static final Target BOTON_ADICIONAR_AL_CARRITO = the("Botón adicionar al carrito").located(By.xpath("//span[.='Add to cart']"));
    public static final Target BOTON_PROCESAR_CHECKOUT = the("Botón procesar checkout").located(By.xpath("//span[contains(.,'Proceed to checkout')]"));

}
