package com.accenture.prueba.steps;

import java.io.IOException;

import com.accenture.prueba.tasks.meteroCompraTasks;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class metroCompraEndUserSteps{
	meteroCompraTasks metroCompra;




	@Step("abrir pagina web")
	public void abrirPagina() {
	metroCompra.openAt("https://www.metro.pe/");
		
	}
	@Step("abrir pagina web")
	public void buscarProducto() {
	metroCompra.buscarProducto();
		
	}
	public void añadirProductoCarrito() {
		metroCompra.añadirProductoCarrito();
		
	}
	public boolean revisarCompraAñadida() {
		return metroCompra.revisarCompraAñadida();
				
				
	}

	

	

}