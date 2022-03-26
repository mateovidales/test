package com.tdea.parcial.gluecode;

import com.tdea.parcial.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.tdea.parcial.Utils.getTimeOfDay;
import static com.tdea.parcial.Utils.isValidHour;
import static org.junit.jupiter.api.Assertions.*;

public class Test {

    private WebDriver driver;

    void setUp() {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

    }


    int hora;
    String tiempo;
    Boolean validar;


    @Given("si la hora es {int}")
    public void si_la_hora_es(Integer int1) {
        hora=int1;
        tiempo= Utils.getTimeOfDay(int1);

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
    @Then("obtenemos Nigth")
    public void obtenemos_nigth() {
        assertEquals("Nigth",tiempo);

    }
}


