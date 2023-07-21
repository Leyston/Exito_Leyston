package com.choucair.exito.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaProducto {
    public static final Target NOMBRE_PRODUCTO=Target.the("Nombre del producto a agregar al carrito")
            .located(By.cssSelector("div.exito-vtex-components-4-x-defaultModalBody span.vtex-store-components-3-x-productBrand"));
    public static final Target PRECIO_PRODUCTO=Target.the("Nombre del producto a agregar al carrito")
            .located(By.cssSelector("div.exito-vtex-components-4-x-defaultModalBody div.exito-vtex-components-4-x-PricePDP span"));
    public static final Target BOTON_AGREGAR=Target.the("boton de agregar en el producto")
            .located(By.cssSelector("div.exito-vtex-components-4-x-defaultModalBody span.exito-vtex-components-4-x-buttonText"));
    public static final Target BOTON_AGREGAR_MAS=Target.the("boton de agregar mas unidades del producto")
            .located(By.cssSelector("div.exito-vtex-components-4-x-defaultModalBody span.product-details-exito-vtex-components-buy-button-manager-more"));
    public static final Target OPCION_CONTINUAR_COMPRANDO=Target.the("boton de agregar mas unidades del producto")
            .located(By.xpath("//p[contains(text(),'Continuar comprando')]"));
    public static final Target MENSAJE_CANTIDAD_NO_DISPONIBLE=Target.the("Menjase de cantidad de producto no disponible")
            .located(By.xpath("//div[contains(text(),'No est� disponible la cantidad deseada')]"));
}