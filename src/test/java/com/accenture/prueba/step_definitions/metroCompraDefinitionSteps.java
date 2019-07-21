package com.accenture.prueba.step_definitions;


import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

import com.accenture.prueba.steps.metroCompraEndUserSteps;


public class metroCompraDefinitionSteps {

	@Steps
	metroCompraEndUserSteps actor;

	@Screenshots(afterEachStep = true)
	 @Given("^el usuario procede ha acceder a la web de la tienda metro$")
    public void elUsuarioProcedeHaAccederALaWebDeLaTiendaMetro() throws Throwable {
		actor.abrirPagina();
        
    }
	
    @When("^el usuario busque un producto en especifico$")
    public void elUsuarioBusqueUnProductoEnEspecifico() throws Throwable {
        actor.buscarProducto();
    }

    @And("^seleccione un resultado de los encontrados y lo añade al carrito de compras$")
    public void seleccioneUnResultadoDeLosEncontradosYLoAadeAlCarritoDeCompras() throws Throwable {
    	 actor.añadirProductoCarrito();
    }
    
    @Then("^el usuario deberia validar que en el carrito de compras, aparezca el numero de producto seleccionado$")
    public void elUsuarioDeberiaValidarQueEnElCarritoDeComprasAparezcaElNumeroDeProductoSeleccionado() throws Throwable {
       assertTrue(actor.revisarCompraAñadida());
    }
	

}
