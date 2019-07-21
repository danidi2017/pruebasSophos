 @login @sprint1 
Feature: Prueba tecnica sophos
yo como usuario de alibaba deseeo ingresar a la aplicacion web y añadir una compra
mediante el mecanismo carrito de compras.
	
Background: abrir la pagina web de alibaba
	Given el usuario procede ha acceder a la web de alibaba
	

@tag_1 
Scenario: el usuario hace un login exito 
	When el usuario busque un articulo en especifico
	And selecciona un resultado al azar de los buscados y lo añade al carrito de compras
	Then el usuario deberia validar que en el carrito de compras, aparezca el producto seleccionado, con su respectiva cantidad
	
#@tag_2 
#Scenario: el usuario hace un login con su usuario o password incorrecto 
#	When el usuario ingresa su usuario incorrecto o password incorrecto 
#	Then el usuario deberia de ver un mensaje de advertencia 
#	  
	

