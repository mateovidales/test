package com.tdea.parcial.gluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.tdea.parcial.Utils.getTimeOfDay;
import static com.tdea.parcial.Utils.isValidHour;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    private WebDriver driver;

    void setUp() {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

    }

    //    Given si la hora es 3
//    When verificar si es 'nigth'
//    Then obtenemos "nigth"

    int hora;
    String hora2;
    boolean validar;



    @Given("si la hora es {int}")
    public void si_la_hora_es(Integer int1) {
        int hora = int1;
        hora2 = getTimeOfDay(int1);

    }
    @When("verificar si es valida")
    public void verificar_si_es() {
        validar = isValidHour(hora);
        if (hora > )
    }





    }
    @Then("obtenemos {string}")
    public void obtenemos(String string) {
    assertEquals(String, hora2);
    }
    }
}
