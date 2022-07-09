package com.automationpractice.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/comprar_producto.feature",
        glue = "com.automationpractice.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ComprarProductoRunner {
}
