package com.choucair.exito.interactions;

import com.choucair.exito.models.Datos;
import com.choucair.exito.userinterface.PaginaExito;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;


public class SeleccionAleatoria implements Interaction {

    private String selector;
    PaginaExito object = new PaginaExito();

    public SeleccionAleatoria(String selector) {
        this.selector = selector;
    }




    public static SeleccionAleatoria jsClick(String selector){
        return Tasks.instrumented(SeleccionAleatoria.class,selector);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30); // Espera hasta 10 segundos
        List<WebElement> categorias = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(selector)));
        Datos.setIndiceRandom(new Random().nextInt(categorias.size()));
        WebElement categoria = categorias.get(Datos.getIndiceRandom());
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center', inline: 'center'});", categoria);
        categoria.click();
    }
}
