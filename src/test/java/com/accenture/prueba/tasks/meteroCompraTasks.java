package com.accenture.prueba.tasks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import com.accenture.prueba.pages.metroCompraPages;
import com.accenture.prueba.utilidades.excepciones;

public class meteroCompraTasks extends metroCompraPages {
	excepciones ex;

	public void buscarProducto() {
		labelmensajes.withTimeoutOf(30, TimeUnit.SECONDS).waitUntilPresent().click();
		inputBusquedaProducto.withTimeoutOf(30, TimeUnit.SECONDS).waitUntilEnabled().sendKeys("televisor\n");
	}

	public void añadirProductoCarrito() {
		btnAgregarCompra.withTimeoutOf(30, TimeUnit.SECONDS).waitUntilPresent().click();

	}

	public boolean revisarCompraAñadida() {
		if (cardProductoAñadido.withTimeoutOf(30, TimeUnit.SECONDS).isVisible()
				) {
			return true;
		}
		else {
			return false;
		}
	}

}
