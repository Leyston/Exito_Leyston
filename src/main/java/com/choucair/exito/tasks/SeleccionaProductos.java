package com.choucair.exito.tasks;

import com.choucair.exito.interactions.SeleccionAleatoria;
import com.choucair.exito.models.Datos;
import com.choucair.exito.models.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.choucair.exito.userinterface.PaginaProducto.*;
import static com.choucair.exito.userinterface.PaginaProductosSubCategoria.BOTONES_COMPRA_RAPIDA;

public class SeleccionaProductos implements Task {

    private final List<Producto> productosSeleccionados = new ArrayList<>();

    public static SeleccionaProductos alAzar() {
        return Tasks.instrumented(SeleccionaProductos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int min = 1;
        int max = 10;
        for (int i = 0; i < 5; i++) {
            actor.attemptsTo(SeleccionAleatoria.jsClick(BOTONES_COMPRA_RAPIDA.getCssOrXPathSelector()),
                    Click.on(BOTON_AGREGAR));
            int cantidad =new Random().nextInt((max - min) + 1) + min;  ;
            for (int j = 1; j < cantidad; j++) {
                actor.attemptsTo(Click.on(BOTON_AGREGAR_MAS));
                if (MENSAJE_CANTIDAD_NO_DISPONIBLE.resolveFor(actor).isVisible()) {
                    cantidad = j;
                    break;
                }
            }
            productosSeleccionados.add( new Producto(NOMBRE_PRODUCTO.resolveFor(actor).getText(),
                    Integer.parseInt(PRECIO_PRODUCTO.resolveFor(actor).getText().replaceAll("[^\\d]", ""))*cantidad,
                    cantidad));
            actor.attemptsTo(Click.on(OPCION_CONTINUAR_COMPRANDO));
        }

        Datos.setProductosSeleccionados(productosSeleccionados);
    }
}