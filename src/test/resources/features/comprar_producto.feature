#language:es

Característica: Compra de productos
  Yo como usuario de My store
  Quiero realizar la compra de productos
  Para disfrutar de ellos

  Escenario: Comprar un producto de manera exitosa
    Dado que Juan se encuentra en la pagina principal de My store
    Y se dirige a la seccion t-shirts
    Cuando el agrega un producto al carrito
    Y realiza el checkoput con sus credenciales
      | usuario | pruebascreenplay@yopmail.com |
      | clave   | prueba123  |
    Entonces deberia visualizar su orden completada