package com.choucair.exito.stepdefinitions;

import com.choucair.exito.models.Datos;
import com.choucair.exito.questions.ValidaProductosEnCarrito;
import com.choucair.exito.tasks.Abrir;
import com.choucair.exito.tasks.SeleccionaCarrito;
import com.choucair.exito.tasks.SeleccionaProductos;
import com.choucair.exito.tasks.SeleccionoCategoria;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ExitoStepDefinition {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("^El cliente eligio una categoria y subcategoria en la pagina del exito$")
    public void elClienteEligioUnaCategoriaYSubcategoriaEnLaPaginaDelExito() {
        theActorCalled("usuario").wasAbleTo(Abrir.laPagina(), SeleccionoCategoria.ySubcategoria());
    }
    @Cuando("^Agrega 5 productos al carrito con cantidades ente 1 y 10$")
    public void agregaProductosAlCarritoConCantidadesEnteY() {
        theActorInTheSpotlight().attemptsTo( SeleccionaProductos.alAzar(),SeleccionaCarrito.compras());

    }
    @Entonces("^El contenido del carrito corresponde a los productos seleccionados$")
    public void elContenidoDelCarritoCorrespondeALosProductosSeleccionados() {
        theActorInTheSpotlight().should(seeThat(ValidaProductosEnCarrito.son(Datos.getProductosSeleccionados())));


    }




}
