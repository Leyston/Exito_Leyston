package com.choucair.exito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.choucair.exito.userinterface.PaginaInicio.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class SeleccionaCarrito implements Task {
    public static SeleccionaCarrito compras() {
        return Tasks.instrumented(SeleccionaCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CARRITO_NO_DISPONIBLE, isNotVisible()).forNoMoreThan(30).seconds(),
                Click.on(BOTON_CARRITO));
    }
}
