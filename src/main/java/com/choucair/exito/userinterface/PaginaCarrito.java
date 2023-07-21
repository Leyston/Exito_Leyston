package com.choucair.exito.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCarrito {

    public static final Target NOMBRE_PRODUCTO_1=Target.the("Nombre producto")
            .located(By.xpath("//div[@data-molecule-product-detail-name]/span"));
    public static final Target PRECIO_TOTAL_PRODUCTO_1=Target.the("Precio total por producto")
            .located(By.xpath("//div[@data-molecule-product-detail-price-best-price]/span"));
    public static final Target CANTIDAD_PRODUCTO_1=Target.the("Cantidad agregada por producto")
            .located(By.xpath("//div[@data-molecule-quantity-und]/span[1]"));
    public static final Target PRECIO_TOTAL_CARRITO_1=Target.the("Precio total de la compra")
            .located(By.xpath("(//span[@data-molecule-summary-item-value])[2]"));

    public static final Target NOMBRE_PRODUCTO_2=Target.the("Nombre producto")
            .located(By.xpath("//td[contains(@class,'product-name')]//a[contains(@class,'product-name')]"));
    public static final Target PRECIO_TOTAL_PRODUCTO_2=Target.the("Precio total por producto")
            .located(By.xpath("//td[contains(@class,'quantity-price')]//span[contains(@class,'total-selling-price')]"));
    public static final Target CANTIDAD_PRODUCTO_2=Target.the("Cantidad agregada por producto")
            .located(By.xpath("//td[contains(@class,'quantity')]//input"));
    public static final Target PRECIO_TOTAL_CARRITO_2=Target.the("Precio total de la compra")
            .located(By.xpath("//td[contains(@class,'exito-checkout-monetary')]"));

}
