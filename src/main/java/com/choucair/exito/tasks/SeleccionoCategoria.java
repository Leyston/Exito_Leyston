package com.choucair.exito.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.choucair.exito.userinterface.PaginaInicio.*;

public class SeleccionoCategoria implements Task {

    public static SeleccionoCategoria ySubcategoria() {
        return Tasks.instrumented(SeleccionoCategoria.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_CATEGORIA),
                Click.on(CATEGORIA_DORMITORIOS),
                Click.on(SUB_CATEGORIA_CABECEROS)
        );
    }
}
