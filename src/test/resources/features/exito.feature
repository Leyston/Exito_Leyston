#language: es
@stories
Característica: : reto Exito
  como nuevo de la pagina de exito
  quiero seleccionar unos elementos en el carro

  Escenario: Seleccion de elementos
    Dado El cliente eligio una categoria y subcategoria en la pagina del exito
    Cuando Agrega 5 productos al carrito con cantidades ente 1 y 10
    Entonces El contenido del carrito corresponde a los productos seleccionados