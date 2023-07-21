package com.choucair.exito.questions;

import com.choucair.exito.models.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;

import java.util.ArrayList;
import java.util.List;

import static com.choucair.exito.userinterface.PaginaCarrito.*;
import static java.lang.Integer.parseInt;

public class ValidaProductosEnCarrito implements Question<Boolean> {
    private List<Producto> productosEsperados;
    private List<Producto> productosEnCarrito = new ArrayList<>();
    private List<String> nombre = new ArrayList<>();
    private List<String> cantidad = new ArrayList<>();
    private List<String> precioProducto = new ArrayList<>();
    private List<String> precioCarrito = new ArrayList<>();


    private ValidaProductosEnCarrito(List<Producto> productosEsperados) {
        this.productosEsperados = productosEsperados;
    }

    public static ValidaProductosEnCarrito son(List<Producto> productosEsperados) {
        return new ValidaProductosEnCarrito(productosEsperados);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        obtenerProductosCarrito(actor);
        int totalCarrito= parseInt(precioCarrito.get(0).replaceAll("[^\\d]", ""));
        int precioTotal=0;
        for (int i = 0; i < nombre.size(); i++) {
            int precio=parseInt(precioProducto.get(i).replaceAll("[^\\d]", ""));
            precioTotal += precio;
            productosEnCarrito.add(new Producto(nombre.get(i),precio, parseInt(cantidad.get(i))));
        }
        return  productosEnCarrito.containsAll(productosEsperados) && productosEsperados.containsAll(productosEnCarrito) && precioTotal == totalCarrito;
    }

    private void obtenerProductosCarrito (Actor actor) {

        if (NOMBRE_PRODUCTO_1.resolveFor(actor).isVisible()) {
            nombre = Text.of(NOMBRE_PRODUCTO_1).viewedBy(actor).resolveAll();
            cantidad = Text.of(CANTIDAD_PRODUCTO_1).viewedBy(actor).resolveAll();
            precioProducto = Text.of(PRECIO_TOTAL_PRODUCTO_1).viewedBy(actor).resolveAll();
            precioCarrito = Text.of(PRECIO_TOTAL_CARRITO_1).viewedBy(actor).resolveAll();
        }else if (NOMBRE_PRODUCTO_2.resolveFor(actor).isVisible()){
            nombre = Text.of(NOMBRE_PRODUCTO_2).viewedBy(actor).resolveAll();
            cantidad = Value.of(CANTIDAD_PRODUCTO_2).viewedBy(actor).resolveAll();
            precioProducto = Text.of(PRECIO_TOTAL_PRODUCTO_2).viewedBy(actor).resolveAll();
            precioCarrito = Text.of(PRECIO_TOTAL_CARRITO_2).viewedBy(actor).resolveAll();
        }

    }

}
