# Private Class Data Design Pattern
## ¿En qué consiste?
El Private Class Data Design Pattern es un patrón estructural que busca proteger los atributos de una clase, encapsulándolos en otra clase aparte, hecha especialmente para guardar los atributos de la clase principal, esta clase puede llamarse Class Data o Class Atributtes. 
- Los atributos que tenga la clase que encapsula los atributos de la clase principal, como se espera, deben ser privados.
- Se espera que dichos atributos solo tengan *getters* asociados
- Solo en caso de necesitarse, alguno de los atributos puede tener un *setter*.
#### En resumen, el patrón busca encapsular la inicialización de atributos de clase.

### Imagen prrona
![Qué lástima, no carga la imagen](https://drive.google.com/open?id=1qBtJdYLB8Ar04iPpP_iqI4OuQtQLHNIi)

## ¿Cuándo es útil este patrón?

- Este patrón es especialmente útil cuando se quiere remover al programador de modificar los atributos de una clase después de que hayan sido inicializados en el constructor de la misma. Con la implementación de este patrón de diseño se crea un nuevo tipo de variable: ` final ` después del constructor. 

- Este patrón es útil cuando se quiere proteger el estado del objeto al proteger los atributos que definen al mismo.

- Este patrón es útil cuando se quiere encapsular atributos de una clase, ya que los pone a todos en un solo objeto que los contiene. 

- Es útil cuando se quiere encapsular la manipulación de los atributos de una clase, ya que los *getters* y *setters* también están contenidos en la clase que contiene los datos.
Con lo anterior se reduce la exposición de los atributos importantes.

- Es útil cuando se quiere reducir la cantidad de atributos que tiene una clase

### `Final` después del constructor

Bajo la lógica de este patrón de diseño, no basta con que los atributos de una clase se protejan de la modificación directa por parte de clases de terceros al hacerlos `private` e implementar *getters* y *setters*  **hay que proteger los atributos de la clase, de sufrir modificación durante la ejecución sus propios métodos**, en síntesis: **separar los datos de los métodos que los usan**.
Con el Private Class Data Design, podemos implementar atributos que solo pueden modificarse una vez (durante la ejecución del constructor), pero no pueden ser `final`; es decir: `final` después del constructor.

## Ventajas

- Encapsulamiento fuerte de atributos y métodos de clase y reducción de la exposición de los mismos.

- "Nuevo" tipo de dato `final` después del constructor, que remueve la posibilidad de que el programador modifique atributos que no deberían modificarse en el tiempo de vida del objeto.

- Creación de capa adicional que separa la clase de quién la manipula


## Desventajas
- Redundar los *getters* y *setters* en caso de que se requiera manipulación desde fuera de la clase principal

- Puede volverse tedioso estar llamando métodos constantemente para poder usar variables que tengo bajo mis narices. 
