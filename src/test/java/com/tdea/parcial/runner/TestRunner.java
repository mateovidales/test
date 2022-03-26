package com.tdea.parcial.runner;

import com.tdea.parcial.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static org.junit.jupiter.api.Assertions.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com.tdea.parcial")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.tdea.parcial.gluecode")

public class TestRunner {

    int hora;
    String tiempo;
    Boolean validar;


    @Given("si la hora es {int}")
    public void si_la_hora_es(Integer int1) {
        hora=int1;
        tiempo= Utils.getTimeOfDay(hora);

    }
    @When("verificar si es valida")
    public void verificar_si_es_valida() {
        validar=Utils.isValidHour(hora);
        if(hora>24){
            assertFalse(validar);
        }else{
            assertTrue(validar);
        }

    }
    @Then("obtener {string}")
    public void obtener(String string) {
    assertEquals(string, tiempo);
    }

}