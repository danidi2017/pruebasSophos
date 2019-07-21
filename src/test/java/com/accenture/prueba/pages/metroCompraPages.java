package com.accenture.prueba.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class metroCompraPages  extends PageObject{
	
	@FindBy(id = "onesignal-popover-cancel-button")
	public static WebElementFacade labelmensajes;

	@FindBy(id = "search-autocomplete-input")
	public static WebElementFacade inputBusquedaProducto;
	
	@FindBy(id = "search-autocomplete-submit")
	public static WebElementFacade buttonBuscar;
	
	@FindBy(xpath = "/html[1]/body[1]/div[24]/div[1]/div[2]/div[4]/div[2]/div[2]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[3]/div[1]/a[1]")
	public static WebElementFacade productSelect;

	@FindBy(xpath = "//div[@class='product-item product-item--55864 gotten-product-item-data']//button[@class='product-item__add-to-cart product-add-to-cart btn red add-to-cart']")
	public static WebElementFacade btnAgregarCompra;
	
	@FindBy(xpath = "//div[contains(@class,'minicart minicart--floating minicart--has-items minicart--single-category')]//div[contains(@class,'minicart__items-wrapper')]")
	public static WebElementFacade cardProductoAñadido;
	
	
}