 @login @sprint1 
Feature: Prueba inicio compra
yo como cliente de la tienda metro deseeo ingresar a la aplicacion web y añadir un producto
mediante el mecanismo de carrito de compras.
	

	

@tag_1 
Scenario: el usuario realiza el proceso de compra por la tienda web
    Given el usuario procede ha acceder a la web de la tienda metro
	When el usuario busque un producto en especifico
	And seleccione un resultado de los encontrados y lo añade al carrito de compras
	Then el usuario deberia validar que en el carrito de compras, aparezca el numero de producto seleccionado
	


