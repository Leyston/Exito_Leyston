package com.choucair.exito.models;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Producto implements Comparable<Producto>{
    private final String nombre;
    private final int precio;
    private final int cantidad;

    public Producto(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }


    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public int compareTo(@NotNull Producto o) {
        return this.nombre.compareTo(o.getNombre());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Producto other = (Producto) obj;
        return Objects.equals(nombre, other.nombre)
                && Objects.equals(precio, other.precio)
                && cantidad == other.cantidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, cantidad);
    }
}
