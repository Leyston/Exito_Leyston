package com.choucair.exito.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicio {
    public static final Target MENU_CATEGORIA =Target.the("Menu de categorias")
            .located(By.xpath("//div[@id='category-menu']"));
    public static final Target CATEGORIA_DORMITORIOS =Target.the("Categoria dormitorios")
            .located(By.xpath("//li[contains(@class, 'itemCategory')]//p[contains(text(),'Dormitorio')]"));
    public static final Target SUB_CATEGORIA_CABECEROS =Target.the("Sub categoria Cabeceros")
            .located(By.xpath("*//p[contains(text(),'Cabeceros')]"));
    public static final String LISTA_CATEGORIAS = "//li[contains(@class, 'itemCategory')]";
    public static final String LISTA_SUBCATEGORIAS = "//a[contains(@id, 'Categorías-nivel3')]";
    public static final Target BOTON_CARRITO =Target.the("Boton para ingresar al carrito")
            .located(By.xpath("//a[contains(@class,'minicartLink')]"));
    public static final Target CARRITO_NO_DISPONIBLE =Target.the("Icono de carrito no disponible")
            .located(By.xpath("//div[contains(@class,'miniCartContainerDisabledLoader')]"));



}
