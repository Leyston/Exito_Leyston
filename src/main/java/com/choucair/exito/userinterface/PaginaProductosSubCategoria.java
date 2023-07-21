package com.choucair.exito.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaProductosSubCategoria {
    public static final String TARJETA_PRODUCTOS=Target.the("Tarjetas de productos")
            .locatedBy("div.pointer.pt3.pb4.flex.flex-column.h-100").toString();
    public static final String NOMPRE_PRODUCTOS=Target.the("Nombre de productos en tarjeta")
            .locatedBy("div.pointer.pt3.pb4.flex.flex-column.h-100 span.vtex-store-components-3-x-productBrand").toString();
    public static final Target BOTONES_COMPRA_RAPIDA=Target.the("Nombre de productos en tarjeta")
            .locatedBy("//div[contains(@class, 'button-modal')]");
}
