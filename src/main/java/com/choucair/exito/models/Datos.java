package com.choucair.exito.models;

import java.util.ArrayList;
import java.util.List;

public class Datos {
    private static int indiceRandom;

    private static List<Producto>  productosSeleccionados = new ArrayList<>();



    public static List<Producto> getProductosSeleccionados() {
        return productosSeleccionados;
    }

    public static void setProductosSeleccionados(List<Producto> productosSeleccionados) {
        Datos.productosSeleccionados = productosSeleccionados;
    }


    public static int getIndiceRandom() {
        return indiceRandom;
    }

    public static void setIndiceRandom(int indiceRandom) {
        Datos.indiceRandom = indiceRandom;
    }
}

