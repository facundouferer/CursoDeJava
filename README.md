# 🌟 Curso de Java Definitivo - De Cero a Héroe 🌟

¡Bienvenido al repositorio definitivo para aprender Java! Este proyecto, originalmente creado para el curso de la **Universidad Tecnológica Nacional (UTN)**, ha sido enriquecido para convertirse en una guía completa que te llevará desde los conceptos más básicos de la programación hasta temas avanzados de Java.

Aquí encontrarás no solo el código de los ejercicios prácticos, sino también una explicación detallada de cada concepto fundamental. ¡Prepárate para iniciar tu viaje en el fascinante mundo de Java!

## 📜 Tabla de Contenidos

1.  [Conceptos Básicos de Programación](#-conceptos-básicos-de-programación)
2.  [Introducción a Java](#-introducción-a-java)
3.  [Sintaxis y Fundamentos](#-sintaxis-y-fundamentos)
4.  [Paradigma Orientado a Objetos (POO)](#-paradigma-orientado-a-objetos-poo)
5.  [Temas Avanzados](#-temas-avanzados)
    *   [Estructuras de Datos (TAD)](#%EF%B8%8F-estructuras-de-datos-y-colecciones-collections-framework)
    *   [Java Collections Framework](#-java-collections-framework)
    *   [Control de Excepciones y Errores](#-control-de-excepciones-y-errores)
    *   [Manejo de Archivos y Persistencia](#-manejo-de-archivos-y-persistencia)
    *   [Bases de Datos y Conectividad (JDBC)](#-bases-de-datos-y-conectividad-jdbc)
    *   [Programación Funcional](#-programación-funcional)
    *   [Programación Concurrente (Multihilos)](#-programación-concurrente-multihilos)
    *   [Patrones de Diseño (Revisión)](#-patrones-de-diseño-revisión)
    *   [Pruebas Unitarias con JUnit](#-pruebas-unitarias-con-junit)
    *   [Interfaces Gráficas de Usuario (GUI)](#-interfaces-gráficas-de-usuario-gui)
    *   [Desarrollo Web con Java](#-desarrollo-web-con-java)
6.  [Guía del Repositorio](#-guía-del-repositorio)
7.  [Contacto y Contribuciones](#-contacto-y-contribuciones)
8.  [Enlaces Útiles](#-enlaces-útiles)

---

## 🧠 Conceptos Básicos de Programación

Antes de sumergirnos en Java, repasemos algunos conceptos universales de la programación.

### El Algoritmo

Un **algoritmo** es un conjunto de pasos ordenados para resolver un problema, como una receta de cocina. En programación, escribimos algoritmos para que la computadora los siga.

### Buenas Prácticas

1.  **Nombres Descriptivos:** Usa nombres de variables y funciones que expliquen su propósito (`calcularTotal` en lugar de `ct`).
2.  **Comentarios Claros:** Explica el *porqué* de tu código, no el *qué*.
3.  **Divide y Vencerás:** Crea funciones pequeñas que hagan una sola cosa.
4.  **No Repitas Código (DRY):** Reutiliza funciones en lugar de copiar y pegar.
5.  **Simplicidad (KISS):** Mantén tu código lo más simple y directo posible.
6.  **Manejo de Errores:** Anticipa y gestiona posibles fallos en tu programa.
7.  **Estilo Consistente:** Sigue un formato de código uniforme.
8.  **Pruebas:** Verifica que tu código funciona en todos los escenarios posibles.
9.  **Aprende de Otros:** Lee código de programadores con más experiencia.
10. **Practica:** La programación es una habilidad que se mejora con la práctica constante.

---

## ☕ Introducción a Java

### ¿Qué es Java?

Java es un lenguaje de programación de propósito general, orientado a objetos y de alto nivel. Su principal ventaja es la **portabilidad**: el código escrito en Java puede ejecutarse en diferentes sistemas operativos sin necesidad de reescribirlo ("Write Once, Run Anywhere").

### Ventajas de Aprender Java

*   **Amplia Demanda Laboral:** Es uno de los lenguajes más usados en el mundo empresarial.
*   **Portabilidad:** Funciona en Windows, macOS, Linux, etc.
*   **Flexibilidad:** Sirve para crear aplicaciones de escritorio, web, móviles y más.
*   **Comunidad Activa:** Existe una enorme comunidad y abundantes recursos para aprender y resolver dudas.

### Tu Primer Programa en Java: "¡Hola, Mundo!"

Todo viaje comienza con un primer paso. Este es el tuyo en Java:

```javascript
public class MiPrograma {
  public static void main(String[] args) {
     System.out.println("¡Hola, mundo!");
  }
}
```

**¿Qué acabamos de hacer?**

*   `public class MiPrograma`: Define una **clase**, que es el contenedor principal de nuestro código en Java.
*   `public static void main(String[] args)`: Este es el **método principal**, el punto de entrada que Java busca para ejecutar el programa.
*   `System.out.println("¡Hola, mundo!");`: Esta es la instrucción que **imprime** el texto en la consola.

---

## 🛠️ Sintaxis y Fundamentos

### Salida por Consola

Para mostrar información en la consola, usamos el objeto `System.out`.

*   `System.out.println()`: Imprime un texto y añade un salto de línea al final.
*   `System.out.print()`: Imprime un texto sin salto de línea.
*   `System.out.printf()`: Permite imprimir con un formato específico.

```javascript
String nombre = "Juan";
int edad = 25;

// Imprimir con formato
System.out.printf("Nombre: %s, Edad: %d\n", nombre, edad);
```

### 📦 Variables y Tipos de Datos

Una **variable** es un espacio en memoria para almacenar un valor. En Java, siempre debemos declarar el tipo de dato que contendrá.

```javascript
int edad = 25; // Declara una variable de tipo entero (int) llamada edad.
edad = 30;     // Podemos cambiar su valor.
```

#### Tipos de Datos Primitivos

Son los datos más básicos que ofrece el lenguaje.

| Tipo    | Grupo    | Tamaño  | Rango Aproximado                               | 
| :------ | :------- | :------ | :--------------------------------------------- | 
| `boolean` | Lógico   | 1 bit   | `true` o `false`                               | 
| `byte`    | Entero   | 8 bits  | -128 a 127                                     | 
| `short`   | Entero   | 16 bits | -32,768 a 32,767                               | 
| `int`     | Entero   | 32 bits | -2.1 mil millones a 2.1 mil millones           | 
| `long`    | Entero   | 64 bits | Muy grande (termina con `L`)                   | 
| `float`   | Real     | 32 bits | Números decimales (termina con `f`)            | 
| `double`  | Real     | 64 bits | Decimales de doble precisión (más común)       | 
| `char`    | Carácter | 16 bits | Un solo carácter (ej: `'a'`, `'$'`)      | 

#### Wrappers

Los **Wrappers** son clases que "envuelven" a los tipos primitivos para tratarlos como objetos. Esto es útil para usarlos en colecciones. Ejemplos: `Integer` para `int`, `Double` para `double`, `Boolean` para `boolean`.

```javascript
int numPrimitivo = 10;
Integer numObjeto = Integer.valueOf(numPrimitivo); // Envolver
int otroPrimitivo = numObjeto.intValue(); // Desenvolver
```

### 🧮 Operadores

Los operadores nos permiten manipular variables y valores.

#### Aritméticos

*   `+` (suma), `-` (resta), `*` (multiplicación), `/` (división)
*   `%` (módulo): Devuelve el resto de una división. `13 % 4` es `1`.
*   `++` (incremento): Aumenta el valor en 1. `i++`.
*   `--` (decremento): Disminuye el valor en 1. `j--`.

#### De Comparación

Devuelven `true` o `false`.

*   `==` (igual a)
*   `!=` (distinto de)
*   `>` (mayor que), `<` (menor que)
*   `>=` (mayor o igual que), `<=` (menor o igual que)

#### Lógicos

Combinan expresiones booleanas.

*   `&&` (AND): `true` si ambas condiciones son verdaderas.
*   `||` (OR): `true` si al menos una condición es verdadera.
*   `!` (NOT): Invierte el valor booleano.

#### De Asignación

Asignan un valor a una variable.

*   `=` (asignación simple): `x = 10;`
*   `+=`, `-=`, `*=`, `/=`, `%=` (combinados): `x += 3;` es lo mismo que `x = x + 3;`.

### 🎛️ Estructuras de Control de Flujo

#### Estructuras Condicionales

Permiten ejecutar código basándose en condiciones.
**📂 Ubicación:** [`src/CursoJava/Condicionales/`](src/CursoJava/Condicionales/)

*   **`if`**: Ejecuta un bloque si una condición es verdadera.
*   **`if-else`**: Ejecuta un bloque si es `true`, y otro si es `false`.
*   **`if-else-if`**: Evalúa múltiples condiciones en cadena.
*   **`switch`**: Compara una variable con múltiples valores posibles.

```javascript
int dia = 3;
String nombreDia;

switch (dia) {
    case 1: nombreDia = "Lunes"; break;
    case 2: nombreDia = "Martes"; break;
    case 3: nombreDia = "Miércoles"; break;
    default: nombreDia = "Día inválido"; break;
}
```

#### Estructuras Repetitivas (Bucles)

Permiten ejecutar un bloque de código múltiples veces.
**📂 Ubicación:** [`src/CursoJava/EstructurasIterativas/`](src/CursoJava/EstructurasIterativas/)

*   **`for`**: Ejecuta un bloque un número determinado de veces. Ideal cuando sabes cuántas iteraciones necesitas.
    ```javascript
    for(int i = 0; i < 10; i++){
      System.out.println("El valor de i es: " + i);
    }
    ```
*   **`while`**: Ejecuta un bloque mientras una condición sea verdadera. Ideal cuando no sabes cuántas iteraciones habrá.
    ```javascript
    int num = 0;
    while(num < 10){
      System.out.println("El valor de num es: " + num);
      num++;
    }
    ```
*   **`do-while`**: Similar a `while`, pero garantiza que el bloque se ejecute al menos una vez.
*   **`for-each`**: Una forma simplificada de `for` para recorrer todos los elementos de un array o colección.

### 📊 Arrays y Strings

#### Arrays (Arreglos)

Un **array** es una estructura que almacena múltiples valores del mismo tipo en una sola variable. Se accede a los elementos mediante un índice numérico, comenzando en `0`.

**📂 Ubicación:**
*   [`src/CursoJava/ArreglosEstaticos/`](src/CursoJava/ArreglosEstaticos/)
*   [`src/CursoJava/ArreglosMultidimensionales/`](src/CursoJava/ArreglosMultidimensionales/)

**Características:**

*   **Tamaño Fijo:** Una vez creado, su tamaño no puede cambiar.
*   **Mismo Tipo de Dato:** Todos los elementos deben ser del mismo tipo.

```javascript
// Declarar e inicializar un array de Strings
String[] nombres = {"Juan", "Ana", "Pedro", "Maria"};

// Acceder al tercer elemento (índice 2)
System.out.println(nombres[2]); // Imprime "Pedro"

// Recorrer un array
for (int i = 0; i < nombres.length; i++) {
   System.out.println(nombres[i]);
}
```

#### Strings (Cadenas de Texto)

Un **String** es un objeto que representa una secuencia de caracteres. Son **inmutables**, lo que significa que no se pueden modificar una vez creados.

**📂 Ubicación:** [`src/CursoJava/Secuencias/`](src/CursoJava/Secuencias/)

Un String es una secuencia de caracteres que se utiliza para representar texto. Es una clase predefinida en el lenguaje y, a diferencia de los tipos de datos primitivos como int o double, es un objeto.
Para crear un String en Java, se utiliza el operador de asignación = y se encierra el texto entre comillas dobles " ". Por ejemplo:
```javascript
String saludo = "Hola mundo!";
```
En este ejemplo, se ha creado un String llamado saludo con el valor "Hola mundo!".
Los String en Java son inmutables, lo que significa que no se pueden cambiar una vez que se han creado. Por ejemplo, si se intenta cambiar el valor de un String, se crea un nuevo objeto String con el nuevo valor. 
```javascript
String saludo = "Hola";
saludo = saludo + " mundo!";
```
En este caso, se ha creado un nuevo String con el valor "Hola mundo!" y se ha asignado a la variable saludo. El objeto String original con el valor "Hola" ya no es accesible y será eventualmente eliminado por el recolector de basura.

##### Recorrer un String
Para recorrer un String en Java, se puede utilizar un bucle for que itere a través de cada caracter del String. 
```javascript
String saludo = "Hola mundo!";
for (int i = 0; i < saludo.length(); i++) {
    char c = saludo.charAt(i);
    System.out.println(c);
}
```
En este ejemplo, se ha utilizado el método length() del String para obtener el número de caracteres en el String. Luego se utiliza un bucle for para iterar a través de cada índice del String, utilizando el método charAt() para obtener el caracter en ese índice. Por último, se utiliza el método println() para imprimir cada caracter en una línea separada.

##### Concatenación de String
La concatenación de cadenas de texto (strings) es una operación muy común en la programación en Java. En términos simples, la concatenación se refiere a la unión de dos o más cadenas de texto para formar una sola cadena de texto.
En Java, puedes concatenar cadenas de texto utilizando el operador "+", que actúa como un operador de concatenación. El operador "+" se utiliza para unir dos o más cadenas de texto en una sola cadena.
Por ejemplo, si queremos concatenar las cadenas "Hola" y "Mundo" para formar la cadena "Hola Mundo", podemos hacerlo de la siguiente manera:
```javascript
String cadena1 = "Hola";
String cadena2 = "Mundo";
String concatenada = cadena1 + " " + cadena2;
System.out.println(concatenada); // imprimirá "Hola Mundo"
```
En este ejemplo, hemos creado dos variables de tipo String llamadas "cadena1" y "cadena2" y las hemos inicializado con las cadenas "Hola" y "Mundo", respectivamente. Luego, hemos creado otra variable de tipo String llamada "concatenada" y hemos asignado el resultado de la concatenación de "cadena1", un espacio en blanco y "cadena2" utilizando el operador "+". Finalmente, hemos impreso la cadena concatenada utilizando el método "println()" de la clase System.
También puedes utilizar el método "concat()" de la clase String para concatenar cadenas de texto en Java. Este método toma una cadena de texto como argumento y la agrega al final de la cadena actual. Por ejemplo:
```javascript
String cadena1 = "Hola";
String cadena2 = "Mundo";
String concatenada = cadena1.concat(" ").concat(cadena2);
System.out.println(concatenada); // imprimirá "Hola Mundo"
```
En este ejemplo, hemos utilizado el método "concat()" dos veces para concatenar las cadenas "cadena1 y "cadena2" y agregar un espacio en blanco entre ellas.
Es importante recordar que la concatenación de cadenas de texto en Java puede consumir una cantidad significativa de recursos de memoria y tiempo de ejecución, especialmente cuando se trabaja con grandes cantidades de datos. Por lo tanto, es importante optimizar el uso de la concatenación de cadenas de texto en tus programas.

##### Métodos y operaciones principales de los Strings
###### Concatenar Strings
Para concatenar dos Strings en Java, se puede usar el operador +. Aquí hay un ejemplo:
```javascript
String s1 = "Hola";
String s2 = "mundo";
String s3 = s1 + " " + s2;
System.out.println(s3);
```
Este código imprimirá "Hola mundo". En el ejemplo, s1 y s2 son Strings y se concatenan usando el operador +. Luego, el resultado se asigna a s3.
Es importante tener en cuenta que cuando se concatena una cadena con otro tipo de datos, Java convierte implícitamente los otros tipos de datos en Strings. 
```javascript
int edad = 20;
String mensaje = "Tengo " + edad + " años";
System.out.println(mensaje);
```
Este código imprimirá "Tengo 20 años". En el ejemplo, edad es un entero y se concatena con la cadena "Tengo " y la cadena " años" usando el operador +. Java convierte automáticamente la variable edad en una cadena antes de concatenarla.

###### Comparar Strings
Para comparar dos objetos de tipo String se utilizan los métodos equals() y equalsIgnoreCase(). El método equals() compara dos cadenas de caracteres y devuelve un valor booleano que indica si son iguales o no, teniendo en cuenta las mayúsculas y minúsculas. Por otro lado, el método equalsIgnoreCase() compara dos cadenas de caracteres y devuelve un valor booleano que indica si son iguales o no, ignorando las mayúsculas y minúsculas.
A continuación, se muestran algunos ejemplos de cómo comparar cadenas de caracteres en Java:
```javascript
String cadena1 = "Hola";
String cadena2 = "hola";
String cadena3 = "Hola";

// Comparar dos cadenas con el método equals()
if (cadena1.equals(cadena2)) {
   System.out.println("cadena1 y cadena2 son iguales");
} else {
   System.out.println("cadena1 y cadena2 son diferentes");
}

if (cadena1.equals(cadena3)) {
   System.out.println("cadena1 y cadena3 son iguales");
} else {
   System.out.println("cadena1 y cadena3 son diferentes");
}

// Comparar dos cadenas con el método equalsIgnoreCase()
if (cadena1.equalsIgnoreCase(cadena2)) {
   System.out.println("cadena1 y cadena2 son iguales ignorando mayúsculas y minúsculas");
} else {
   System.out.println("cadena1 y cadena2 son diferentes incluso ignorando mayúsculas y minúsculas");
}
```
En el primer ejemplo, la primera cadena es "Hola" y la segunda es "hola". Como son cadenas de caracteres diferentes debido a las mayúsculas y minúsculas, la salida del programa será "cadena1 y cadena2 son diferentes".

En el segundo ejemplo, la primera cadena es "Hola" y la tercera también es "Hola". Como son cadenas de caracteres idénticas, la salida del programa será "cadena1 y cadena3 son iguales".
En el tercer ejemplo, la primera cadena es "Hola" y la segunda es "hola". Como son cadenas de caracteres diferentes debido a las mayúsculas y minúsculas, pero se utiliza el método equalsIgnoreCase(), que no tiene en cuenta las mayúsculas y minúsculas, la salida del programa será "cadena1 y cadena2 son iguales ignorando mayúsculas y minúsculas".

###### Tamaño de un String
Para conocer el tamaño de un String en Java se puede utilizar el método length(). Este método devuelve la cantidad de caracteres que tiene el String.
Aquí hay un ejemplo de cómo utilizarlo:
```javascript
String mensaje = "Hola, mundo!";
int tamaño = mensaje.length();
System.out.println("El tamaño del mensaje es: " + tamaño);
```
En este ejemplo, el método length() se utiliza para obtener el tamaño del String mensaje. Luego, se almacena el resultado en la variable tamaño y se muestra por consola el mensaje "El tamaño del mensaje es: " seguido del valor de tamaño. En este caso, el tamaño del mensaje es 12, ya que hay 12 caracteres en "Hola, mundo!".

###### Pasar un String a mayúscula o minúscula
En Java, para pasar un String a mayúscula o minúscula, podemos utilizar los métodos toUpperCase() y toLowerCase(), respectivamente.
```javascript
String mensaje = "Hola Mundo!";
String mensajeMayusculas = mensaje.toUpperCase(); // HOLA MUNDO!
String mensajeMinusculas = mensaje.toLowerCase(); // hola mundo!
```
El método toUpperCase() convierte todas las letras del String a mayúsculas, mientras que el método toLowerCase() convierte todas las letras a minúsculas.

También podemos utilizar los métodos toUpperCase(Locale) y toLowerCase(Locale) para especificar una localización específica en la que se aplicará la conversión de mayúsculas y minúsculas.
```javascript
String mensaje = "Hola Mundo!";
String mensajeMayusculas = mensaje.toUpperCase(Locale.ENGLISH); 
// HOLA MUNDO!
String mensajeMinusculas = mensaje.toLowerCase(Locale.ENGLISH); 
// hola mundo!
```
En este caso, se utiliza la localización Locale.ENGLISH, lo que significa que se aplicará la conversión de mayúsculas y minúsculas según las reglas de la lengua inglesa.

###### Indicar si contiene otro string
Puedes utilizar el método contains de la clase String para determinar si un String contiene otro String. Este método devuelve true si el String objetivo contiene el String especificado y false en caso contrario. Aquí hay un ejemplo:
```javascript
String frase = "El perro marrón salió corriendo";
if (frase.contains("perro")) {
    System.out.println("La frase contiene la palabra 'perro'");
} else {
    System.out.println("La frase no contiene la palabra 'perro'");
}
```
En este ejemplo, la salida será: "La frase contiene la palabra 'perro'".
También puedes utilizar el método indexOf de la clase String para buscar la posición de un String dentro de otro String. Si el String objetivo no contiene el String especificado, el método devuelve -1. Aquí hay un ejemplo:
```javascript
String frase = "El perro marrón salió corriendo";
int posicion = frase.indexOf("marrón");
if (posicion != -1) {
    System.out.println("La palabra 'marrón' comienza en la posición " + posicion);
} else {
    System.out.println("La palabra 'marrón' no está en la frase");
}
```
En este ejemplo, la salida será: "La palabra 'marrón' comienza en la posición 9".

###### Verificar si comienza o termina con otro String
Puedes usar los métodos startsWith() y endsWith() en un String para verificar si comienza o termina con otro String, respectivamente. Ambos métodos devuelven un valor booleano (true o false) según si el String cumple o no con la condición especificada.
Aquí te dejo algunos ejemplos de cómo utilizarlos:
```javascript
String miString = "Hola mundo";

// Comprobar si el String comienza con 'Hola'
System.out.println(miString.startsWith("Hola")); // Devuelve true

// Comprobar si el String termina con 'mundo'
System.out.println(miString.endsWith("mundo")); // Devuelve true
```
Ten en cuenta que ambos métodos son sensibles a mayúsculas y minúsculas, es decir, si especificas una letra en mayúscula cuando en realidad está en minúscula, el método devolverá false. Para evitar esto, puedes convertir todo el String a minúsculas o mayúsculas antes de usar los métodos.

###### Carácter de escape
El carácter especial \ en un String se utiliza como carácter de escape. Esto significa que se utiliza para indicar que el siguiente carácter en el String debe ser tratado de una manera especial. Algunas de las cosas que se pueden hacer con el carácter \ en un String son:

Incluir comillas dobles dentro de un String que está delimitado por comillas dobles:
```javascript
String ejemplo = "Este es un \"ejemplo\" de uso del caracter \\";
System.out.println(ejemplo);
// Salida: Este es un "ejemplo" de uso del caracter \
```
Incluir comillas simples dentro de un String que está delimitado por comillas simples:
```javascript
String ejemplo = "Este es un 'ejemplo' de uso del caracter \\";
System.out.println(ejemplo);
// Salida: Este es un 'ejemplo' de uso del caracter \
```
Incluir el carácter \ dentro de un String:
```javascript
String ejemplo = "Este es un ejemplo de uso del caracter \\";
System.out.println(ejemplo);
// Salida: Este es un ejemplo de uso del caracter \
```
Incluir caracteres especiales, como tabulaciones y saltos de línea, dentro de un String:
```javascript
String ejemplo = "Este es un ejemplo\tde uso del caracter \\n";
System.out.println(ejemplo);
// Salida: Este es un ejemplo    de uso del caracter 
//         (se imprime una tabulación y luego se salta de línea)
```
Incluir valores hexadecimales o Unicode dentro de un String utilizando la notación \uXXXX:
```javascript
String ejemplo = "\u00BFQu\u00E9 tal est\u00E1s?";
System.out.println(ejemplo);
// Salida: ¿Qué tal estás?
```

### ⚙️ Funciones (Métodos)

Una **función** (o **método** en terminología Java) es un bloque de código reutilizable que realiza una tarea específica. Puede recibir parámetros (datos de entrada) y devolver un valor (resultado).

**📂 Ubicación:** [`src/CursoJava/Funciones/`](src/CursoJava/Funciones/)

```javascript
// Definición de una función que suma dos enteros
public static int sumar(int num1, int num2) {
   int resultado = num1 + num2;
   return resultado;
}

// Cómo llamar a la función en main
public static void main(String[] args) {
   int total = sumar(5, 3); // total será 8
   System.out.println("El resultado es: " + total);
}
```

---

## 🏛️ Paradigma Orientado a Objetos (POO)

La POO es un modelo de programación que organiza el software en torno a **objetos**, que combinan datos (atributos) y comportamiento (métodos).

**📂 Ubicación Principal:** [`src/CursoJava/POO/`](src/CursoJava/POO/)

### Clases y Objetos

*   **Clase:** Es una plantilla o molde para crear objetos. Define los atributos y métodos que tendrán los objetos de ese tipo.
*   **Objeto:** Es una instancia de una clase. Es una entidad concreta con su propio estado (valores en sus atributos).

```javascript
// CLASE (plantilla)
public class Perro {
    // Atributos
    String nombre;
    String raza;

    // Método
    public void ladrar() {
        System.out.println("¡Guau, guau!");
    }
}

// CREACIÓN DE OBJETOS (instancias)
public static void main(String[] args) {
    Perro miPerro = new Perro(); // Creamos un objeto Perro
    miPerro.nombre = "Firulais"; // Asignamos valores a sus atributos
    miPerro.raza = "Labrador";

    miPerro.ladrar(); // Llamamos a su método
}
```

### Pilares de la POO

#### 1. Encapsulamiento

Consiste en ocultar los detalles internos de un objeto y exponer solo una interfaz pública para interactuar con él. Se logra declarando los atributos como `private` y proveyendo métodos públicos `getters` (para obtener el valor) y `setters` (para modificarlo).

**📂 Ubicación:** [`src/CursoJava/POO/AbstraccionYEncapsulamiento.java`](src/CursoJava/POO/AbstraccionYEncapsulamiento.java)

```javascript
public class Persona {
   private String nombre; // Atributo privado

   // Getter público
   public String getNombre() {
       return nombre;
   }

   // Setter público
   public void setNombre(String nombre) {
       this.nombre = nombre;
   }
}
```

#### 2. Herencia

Permite que una clase (subclase o hija) herede atributos y métodos de otra clase (superclase o padre). Fomenta la reutilización de código. Se usa la palabra clave `extends`.

**📂 Ubicación:** [`src/CursoJava/Herencia/`](src/CursoJava/Herencia/)

```javascript
// Superclase (Padre)
class Animal {
   public void comer() {
       System.out.println("Este animal come comida.");
   }
}

// Subclase (Hija) que hereda de Animal
class Perro extends Animal {
   public void ladrar() {
       System.out.println("¡Guau!");
   }
}
```

#### 3. Polimorfismo

Significa "muchas formas". Permite que objetos de diferentes clases respondan al mismo mensaje (llamada de método) de manera diferente. Se manifiesta principalmente a través de la **sobrescritura de métodos**.

**📂 Ubicación:** [`src/CursoJava/Polimorfismo/`](src/CursoJava/Polimorfismo/)

*   **Sobrescritura (`@Override`)**: Una subclase redefine un método heredado de su superclase para proporcionar un comportamiento específico.

```javascript
class Animal {
   public void hacerSonido() {
       System.out.println("El animal hace un sonido");
   }
}

class Gato extends Animal {
   @Override // Sobrescribiendo el método
   public void hacerSonido() {
       System.out.println("El gato maúlla: ¡Miau!");
   }
}
```

*   **Sobrecarga (`Overload`)**: Una clase puede tener múltiples métodos con el mismo nombre, siempre que sus parámetros sean diferentes (en tipo o cantidad).

```javascript
class Calculadora {
   public int sumar(int a, int b) { return a + b; }
   public double sumar(double a, double b) { return a + b; }
}
```

#### 4. Abstracción

Consiste en ocultar la complejidad y mostrar solo las características esenciales de un objeto. Se implementa mediante **clases abstractas** e **interfaces**.

*   **Clase Abstracta**: Una clase que no se puede instanciar. Sirve como una plantilla base para otras clases. Puede tener métodos abstractos (sin implementación) que las clases hijas están obligadas a implementar.
    **📂 Ubicación:** [`src/CursoJava/ClasesAbstractas/`](src/CursoJava/ClasesAbstractas/)

*   **Interfaz**: Es un contrato que define un conjunto de métodos abstractos. Una clase que `implements` una interfaz está obligada a implementar todos sus métodos.
    **📂 Ubicación:** [`src/CursoJava/Interfaces/`](src/CursoJava/Interfaces/)

```javascript
// INTERFAZ
interface Volador {
    void volar(); // Método abstracto por defecto
}

// CLASE QUE IMPLEMENTA LA INTERFAZ
class Pajaro implements Volador {
    @Override
    public void volar() {
        System.out.println("El pájaro vuela batiendo sus alas.");
    }
}
```

### Modificadores de Acceso

Controlan la visibilidad de clases, atributos y métodos.

**📂 Ubicación:** [`src/CursoJava/ModificadoresDeAcceso/`](src/CursoJava/ModificadoresDeAcceso/)

*   `public`: Accesible desde cualquier lugar.
*   `protected`: Accesible dentro del mismo paquete y por subclases (incluso en otros paquetes).
*   `default` (sin modificador): Accesible solo dentro del mismo paquete.
*   `private`: Accesible solo dentro de la misma clase.

---

## 🚀 Temas Avanzados

### 🗄️ Estructuras de Datos y Colecciones (Collections Framework)

Mientras que los arrays son útiles, tienen una gran limitación: su tamaño es fijo. El **Java Collections Framework** proporciona un conjunto de clases e interfaces de alto rendimiento para almacenar y manipular grupos de objetos de forma dinámica.

**📂 Ubicación:**
*   [`src/CursoJava/TAD/`](src/CursoJava/TAD/)
*   [`src/CursoJava/Colecciones/`](src/CursoJava/Colecciones/)
*   [`src/CursoJava/ColeccionesEquals/`](src/CursoJava/ColeccionesEquals/)
*   [`src/CursoJava/ColeccionesHashCode/`](src/CursoJava/ColeccionesHashCode/)
*   [`src/CursoJava/ColeccionesIteradores/`](src/CursoJava/ColeccionesIteradores/)

#### ¿Por qué usar Colecciones?
*   **Tamaño dinámico**: Crecen y se encogen según lo necesites.
*   **Alto rendimiento**: Implementaciones optimizadas para diferentes casos de uso.
*   **Algoritmos incluidos**: Vienen con métodos para ordenar, buscar, etc.

#### Colecciones Genéricas (`<T>`)
Siempre debes especificar el tipo de dato que una colección contendrá usando genéricos (`< >`). Esto proporciona **seguridad de tipos** en tiempo de compilación, evitando errores y la necesidad de hacer castings manuales.
`List<String> nombres = new ArrayList<>();` // Correcto
`List nombres = new ArrayList();` // Obsoleto y peligroso

---

#### Interfaz `List<E>`: Colecciones Ordenadas
Una lista es una colección **ordenada** que permite **elementos duplicados**. Los elementos se pueden acceder por su índice (posición).

*   **`ArrayList<E>`**: Usa un array internamente. Es muy rápida para acceder a elementos por su índice (`get(i)`). Las inserciones o eliminaciones en el medio de la lista son más lentas.
*   **`LinkedList<E>`**: Usa una lista doblemente enlazada. Es muy rápida para añadir o quitar elementos del principio o del final. El acceso por índice es más lento porque debe recorrer la lista.

```javascript
// Ejemplo con ArrayList
List<String> frutas = new ArrayList<>();
frutas.add("Manzana"); // Añade al final
frutas.add("Banana");
frutas.add(0, "Fresa"); // Añade en la posición 0
frutas.add("Manzana"); // Duplicado permitido

System.out.println(frutas); // [Fresa, Manzana, Banana, Manzana]
System.out.println("Elemento en índice 2: " + frutas.get(2)); // Banana
frutas.remove("Manzana"); // Elimina la primera ocurrencia
System.out.println("Después de eliminar: " + frutas); // [Fresa, Banana, Manzana]
```

---

#### Interfaz `Set<E>`: Colecciones sin Duplicados
Un conjunto es una colección que **no permite elementos duplicados**.

*   **`HashSet<E>`**: Almacena los elementos en una tabla hash. Es la implementación más rápida, pero **no garantiza ningún orden** en los elementos. Requiere que los objetos tengan implementados `hashCode()` y `equals()`.
*   **`TreeSet<E>`**: Almacena los elementos en una estructura de árbol. Mantiene los elementos en un **orden natural** (o según un `Comparator`). Es más lento que `HashSet`.

```javascript
Set<String> unicos = new HashSet<>();
unicos.add("Rojo");
unicos.add("Verde");
unicos.add("Azul");
boolean anadido = unicos.add("Rojo"); // Devuelve false, "Rojo" ya existe

System.out.println(unicos); // [Azul, Verde, Rojo] (el orden no está garantizado)
System.out.println("¿Se añadió el duplicado? " + anadido); // false
```

---

#### Interfaz `Queue<E>`: Colas (FIFO)
Una cola es una colección diseñada para procesar elementos en un orden **FIFO (First-In, First-Out)**, es decir, el primer elemento que entra es el primero que sale.

*   `offer(e)`: Añade un elemento al final de la cola.
*   `poll()`: Remueve y devuelve el elemento al frente de la cola (devuelve `null` si está vacía).
*   `peek()`: Devuelve el elemento al frente de la cola sin removerlo (devuelve `null` si está vacía).

```javascript
Queue<String> filaSupermercado = new LinkedList<>(); // LinkedList implementa Queue
filaSupermercado.offer("Cliente 1");
filaSupermercado.offer("Cliente 2");
filaSupermercado.offer("Cliente 3");

System.out.println("Siguiente en la fila: " + filaSupermercado.peek()); // Cliente 1
String atendido = filaSupermercado.poll();
System.out.println("Atendiendo a: " + atendido); // Cliente 1
System.out.println("Siguiente en la fila: " + filaSupermercado.peek()); // Cliente 2
```

**`PriorityQueue<E>`**: Es una cola especial que ordena los elementos según su "prioridad" (orden natural o un `Comparator`), no por orden de llegada. El elemento con mayor prioridad (a menudo el "menor") es el primero en salir.

```javascript
Queue<Integer> numerosPrioritarios = new PriorityQueue<>();
numerosPrioritarios.offer(50);
numerosPrioritarios.offer(10);
numerosPrioritarios.offer(30);

// Aunque 10 se añadió el segundo, tiene la mayor prioridad (es el menor)
System.out.println("Elemento con mayor prioridad: " + numerosPrioritarios.peek()); // 10
```

---

#### Interfaz `Map<K, V>`: Pares Clave-Valor
Un mapa es una colección que almacena pares **clave-valor**. Cada clave debe ser única. Es como un diccionario.

*   **`HashMap<K, V>`**: Almacena las claves en una tabla hash. Es la implementación más rápida, pero **no garantiza ningún orden**.
*   **`TreeMap<K, V>`**: Almacena las claves en una estructura de árbol, manteniéndolas **ordenadas**.

```javascript
Map<String, Integer> edades = new HashMap<>();
edades.put("Juan", 25);
edades.put("Ana", 30);
edades.put("Luis", 28);
edades.put("Juan", 26); // Sobrescribe el valor anterior para la clave "Juan"

System.out.println("La edad de Ana es: " + edades.get("Ana")); // 30
System.out.println("Mapa completo: " + edades); // {Ana=30, Juan=26, Luis=28}

// Recorrer un mapa
for (String clave : edades.keySet()) {
    System.out.println("Clave: " + clave + ", Valor: " + edades.get(clave));
}
```

---

#### Iteradores (`Iterator`)
Un `Iterator` es un objeto que permite recorrer una colección y eliminar elementos de forma segura.

```javascript
List<String> animales = new ArrayList<>();
animales.add("Perro");
animales.add("Gato");
animales.add("Ratón");

Iterator<String> it = animales.iterator();
while (it.hasNext()) {
    String animal = it.next();
    if (animal.equals("Gato")) {
        it.remove(); // Forma segura de eliminar durante la iteración
    }
}
System.out.println(animales); // [Perro, Ratón]
```
El bucle `for-each` es una forma más simple de recorrer una colección, pero no permite eliminar elementos durante la iteración.

---

#### Comparación y Ordenamiento

**`equals()` y `hashCode()`**

Para que las colecciones basadas en hash (`HashSet`, `HashMap`) funcionen correctamente, los objetos que uses como elementos o claves deben sobrescribir estos dos métodos:

*   `equals(Object o)`: Define la "igualdad lógica". Por defecto, compara referencias de memoria (`==`). Debes sobrescribirlo para comparar los atributos.
*   `hashCode()`: Devuelve un número entero que representa al objeto.

**Contrato:** Si dos objetos son iguales según `equals()`, entonces sus `hashCode()` **deben** ser iguales.

```javascript
class Persona {
    String dni;
    String nombre;
    // Constructor...

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni.equals(persona.dni); // Dos personas son iguales si su DNI es igual
    }

    @Override
    public int hashCode() {
        return dni.hashCode(); // El hashCode se basa en el DNI
    }
}
```

**`Comparable` y `Comparator`**

Para ordenar elementos (en `TreeSet`, `TreeMap` o con `Collections.sort()`), Java necesita saber cómo compararlos.

*   **`Comparable<T>`**: Para un **orden natural**. La propia clase del objeto implementa esta interfaz y el método `compareTo()`.

    ```javascript
    class Producto implements Comparable<Producto> {
        String nombre;
        double precio;
        // ...
        @Override
        public int compareTo(Producto otro) {
            return Double.compare(this.precio, otro.precio); // Ordena por precio
        }
    }
    ```

*   **`Comparator<T>`**: Para un **orden personalizado** o cuando no puedes modificar la clase. Se crea una clase aparte o se usa una lambda.

    ```javascript
    List<Producto> lista = new ArrayList<>();
    // ... añadir productos
    
    // Ordenar por nombre usando una lambda
    Comparator<Producto> porNombre = (p1, p2) -> p1.nombre.compareTo(p2.nombre);
    lista.sort(porNombre);
    ```


### 🚨 Control de Excepciones y Errores

En Java, el manejo de situaciones inesperadas es crucial para crear aplicaciones robustas. Esto se gestiona a través de un sistema de errores y excepciones.

**📂 Ubicación:** [`src/CursoJava/Excepciones/`](src/CursoJava/Excepciones/)

#### Diferencia entre Errores y Excepciones

Aunque a menudo se usan indistintamente, en Java tienen significados distintos:

*   **`Error`**: Representa problemas graves y anormales que están fuera del control del programador y de la aplicación. Generalmente, no se deben intentar capturar. Ejemplos:
    *   `OutOfMemoryError`: La JVM se queda sin memoria.
    *   `StackOverflowError`: La pila de llamadas a métodos es demasiado profunda (generalmente por una recursión infinita).

*   **`Exception`**: Representa condiciones que una aplicación podría querer capturar y manejar. Son problemas que, aunque inesperados, son recuperables. Ejemplos:
    *   `IOException`: Falla una operación de entrada/salida (ej: leer un archivo que no existe).
    *   `NullPointerException`: Se intenta usar un objeto que es `null`.

#### Jerarquía de Excepciones en Java

Toda clase de error o excepción en Java hereda de la clase `Throwable`. La jerarquía es la siguiente:

```
          Throwable
          /       \
       Error     Exception
                   /       \
      IOException   RuntimeException
      (Checked)     (Unchecked)
                       /         \
      NullPointerException   ArrayIndexOutOfBoundsException
```

*   **`Throwable`**: La clase raíz para todo lo que puede ser "lanzado".
*   **`Exception`**: La clase base para las excepciones recuperables. Se dividen en dos grandes grupos:
    1.  **Checked Exceptions (Excepciones Verificadas)**: Son subclases de `Exception` pero **no** de `RuntimeException`. El compilador de Java te **obliga** a manejarlas, ya sea con un bloque `try-catch` o declarando que tu método las propaga con `throws`. Son condiciones que el programa debe anticipar (ej: `FileNotFoundException`).
    2.  **Unchecked Exceptions (Excepciones No Verificadas)**: Son las clases que heredan de `RuntimeException`. El compilador **no** te obliga a manejarlas. Generalmente, indican errores de lógica en la programación (ej: `NullPointerException`, `ArrayIndexOutOfBoundsException`).

#### Uso de `try`, `catch` y `finally`

Esta es la estructura fundamental para manejar excepciones.

*   **`try`**: Envuelve el código que podría generar una excepción.
*   **`catch`**: Captura y maneja una excepción específica. Puedes tener múltiples bloques `catch` para diferentes tipos de excepciones.
*   **`finally`**: Contiene código que se ejecutará **siempre**, sin importar si se lanzó una excepción o no. Es el lugar ideal para liberar recursos (como cerrar archivos o conexiones de red).

```javascript
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class ManejoExcepciones {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            // Código propenso a errores
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Lanzará ArrayIndexOutOfBoundsException

            File archivo = new File("archivo_inexistente.txt");
            fr = new FileReader(archivo); // Podría lanzar FileNotFoundException

        } catch (FileNotFoundException e) {
            // Manejo específico para archivo no encontrado
            System.out.println("Error: El archivo no fue encontrado.");
            System.out.println("Detalle: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            // Manejo específico para índice de array fuera de rango
            System.out.println("Error: Intentaste acceder a una posición inválida del array.");

        } catch (Exception e) {
            // Un bloque genérico al final para capturar cualquier otra excepción
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());

        } finally {
            // Este bloque se ejecuta siempre
            System.out.println("El bloque 'finally' siempre se ejecuta.");
            try {
                if (fr != null) {
                    fr.close(); // Cerramos el recurso para evitar fugas de memoria
                    System.out.println("Recurso cerrado correctamente.");
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el recurso: " + e.getMessage());
            }
        }
    }
}
```

#### Generación de Excepciones con `throw`

A veces, necesitas lanzar una excepción de forma manual en tu código para señalar una condición de error. Para esto se utiliza la palabra clave `throw`.

```javascript
public static void verificarEdad(int edad) {
    if (edad < 18) {
        // Lanzamos una excepción si la condición de error se cumple
        throw new IllegalArgumentException("El usuario debe ser mayor de 18 años.");
    }
    System.out.println("Edad verificada correctamente.");
}

public static void main(String[] args) {
    try {
        verificarEdad(15);
    } catch (IllegalArgumentException e) {
        System.out.println("Error de validación: " + e.getMessage());
    }
}
```

#### Propagación de Excepciones con `throws`

Cuando un método puede lanzar una *checked exception* (excepción verificada) pero no la maneja con `try-catch`, debe declararlo en su firma usando la palabra clave `throws`. Esto informa a quien llame al método que debe estar preparado para manejar esa excepción.

```javascript
import java.io.IOException;

// Este método declara que PUEDE lanzar una IOException
public static void miMetodoQueLanzaExcepcion() throws IOException {
    // Imaginemos que aquí hay código que podría fallar, como leer un archivo
    throw new IOException("Fallo en la operación de E/S");
}

public static void main(String[] args) {
    try {
        // Como el método puede lanzar una excepción, debemos manejarla
        miMetodoQueLanzaExcepcion();
    } catch (IOException e) {
        System.out.println("Se capturó la excepción propagada: " + e.getMessage());
    }
}
```

#### Creación de Excepciones Personalizadas

Puedes crear tus propios tipos de excepción para representar problemas específicos de tu aplicación. Esto hace que tu código sea más legible y fácil de depurar.

Para ello, simplemente crea una clase que herede de `Exception` (para una checked exception) o de `RuntimeException` (para una unchecked exception).

```javascript
// 1. Crear nuestra clase de excepción personalizada
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje); // Llama al constructor de la clase padre (Exception)
    }
}

// 2. Usar nuestra excepción en la lógica de negocio
class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            // Lanzamos nuestra excepción personalizada
            throw new SaldoInsuficienteException("Saldo insuficiente. Tienes " + saldo + " pero intentas retirar " + monto);
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Saldo restante: " + saldo);
    }
}

// 3. Manejar la excepción personalizada
public static void main(String[] args) {
    CuentaBancaria miCuenta = new CuentaBancaria(1000);
    try {
        miCuenta.retirar(500);  // Funciona
        miCuenta.retirar(600);  // Lanza la excepción
    } catch (SaldoInsuficienteException e) {
        System.out.println("Error en la transacción: " + e.getMessage());
    }
}
```

### 📁 Manejo de Archivos y Persistencia

La persistencia de datos es la capacidad de un programa para guardar su estado o información para que pueda ser recuperada más tarde. La forma más fundamental de persistencia es a través de archivos.

**📂 Ubicación:** [`src/CursoJava/ArchivosYDirectorios/`](src/CursoJava/ArchivosYDirectorios/)

#### Lectura y Escritura con Java I/O

Java I/O (Input/Output) se basa en el concepto de **streams** (flujos), que son secuencias de datos.

*   **Byte Streams** (`InputStream`, `OutputStream`): Leen y escriben datos binarios (bytes). Útiles para archivos de imagen, ejecutables, etc.
*   **Character Streams** (`Reader`, `Writer`): Leen y escriben datos de texto (caracteres). Automáticamente manejan la conversión entre bytes y caracteres según una codificación (como UTF-8).

#### Uso de `File`, `FileReader`, `BufferedReader`, `PrintWriter`

Estas son algunas de las clases más comunes para trabajar con archivos de texto.

*   `File`: Representa una ruta de archivo o directorio en el sistema de archivos, pero no su contenido.
*   `FileWriter` / `PrintWriter`: Para escribir texto en un archivo. `PrintWriter` es generalmente más conveniente.
*   `FileReader` / `BufferedReader`: Para leer texto de un archivo. `BufferedReader` es más eficiente porque lee el archivo en bloques grandes (un buffer), reduciendo el número de accesos al disco.

El siguiente ejemplo utiliza el bloque **`try-with-resources`**, que cierra automáticamente los recursos (`reader`, `writer`) al finalizar, evitando fugas de memoria. Es la forma moderna y recomendada de manejar archivos.

```javascript
import java.io.*;

public class EjemploArchivos {
    public static void main(String[] args) {
        String nombreArchivo = "mi_archivo.txt";

        // --- Escribir en el archivo ---
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            writer.println("Hola, este es mi primer archivo en Java.");
            writer.println("Esta es la segunda línea.");
            writer.printf("Podemos escribir con formato, por ejemplo, el número %d.", 123);
            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }

        // --- Leer desde el archivo ---
        System.out.println("\nContenido del archivo:");
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
```

#### Serialización de Objetos

La **serialización** es el proceso de convertir el estado de un objeto en una secuencia de bytes. La **deserialización** es el proceso inverso. Esto es útil para:

*   Guardar objetos en un archivo.
*   Enviar objetos a través de una red.
*   Guardar el estado de una sesión.

**📂 Ubicación:** [`src/CursoJava/Serializacion/`](src/CursoJava/Serializacion/)

Para que un objeto sea serializable, su clase debe implementar la interfaz `Serializable` (que es una interfaz "marcador", no tiene métodos para implementar).

```javascript
import java.io.*;

// 1. La clase debe implementar Serializable
class Usuario implements Serializable {
    private String nombre;
    private int edad;
    // Los campos 'transient' no se serializan
    private transient String password;

    public Usuario(String nombre, int edad, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', edad=" + edad + ", password='" + password + "'}";
    }
}

public class EjemploSerializacion {
    public static void main(String[] args) {
        Usuario usuarioParaGuardar = new Usuario("Juan", 30, "secreto123");

        // --- Serializar (Guardar objeto en archivo) ---
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("usuario.ser"))) {
            oos.writeObject(usuarioParaGuardar);
            System.out.println("Usuario guardado: " + usuarioParaGuardar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // --- Deserializar (Leer objeto desde archivo) ---
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("usuario.ser"))) {
            Usuario usuarioLeido = (Usuario) ois.readObject();
            System.out.println("Usuario leído: " + usuarioLeido);
            // Notar que el password será null porque era 'transient'
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

#### Empaquetado y Ejecución de `.jar`

Un archivo **`.jar` (Java Archive)** es un paquete que contiene las clases compiladas (`.class`), metadatos y recursos (como imágenes o archivos de texto) de una aplicación. Es la forma estándar de distribuir aplicaciones Java.

Para crear un `.jar` ejecutable, necesitas un **manifiesto**, un archivo especial (`MANIFEST.MF`) que le dice a Java cuál es la clase principal que debe ejecutar.

**Pasos desde la línea de comandos:**

1.  **Compilar tus archivos `.java` a `.class`:**
    ```bash
    # Suponiendo que estás en la carpeta 'src'
    javac com/miempresa/MiApp.java
    ```

2.  **Crear el archivo de manifiesto (`manifest.txt`):**
    Crea un archivo de texto con el siguiente contenido. **¡Es crucial que el archivo termine con una línea nueva!**
    ```
    Main-Class: com.miempresa.MiApp

    ```

3.  **Crear el archivo `.jar`:**
    El comando `jar` empaqueta todo.
    ```bash
    # c: crear, v: verboso, f: archivo, m: manifiesto
    # Desde la carpeta raíz del proyecto (fuera de 'src')
    jar cvfm MiApp.jar manifest.txt -C src .
    ```
    *   `-C src .` le dice al comando que cambie al directorio `src` para encontrar los archivos `.class`.

4.  **Ejecutar el `.jar`:**
    ```bash
    java -jar MiApp.jar
    ```

#### Conversión a `.exe` y Otras Opciones de Despliegue

Si bien los `.jar` son portátiles, requieren que el usuario tenga Java instalado. Para una mejor experiencia de usuario, puedes empaquetar tu aplicación como un ejecutable nativo (ej: `.exe` en Windows, `.app` en macOS).

*   **`jpackage`**: Herramienta incluida en el JDK (desde la versión 14) que crea instaladores nativos para Windows, macOS y Linux. Puede incluir un JRE reducido, por lo que el usuario no necesita instalar Java.

*   **GraalVM `native-image`**: Una tecnología más avanzada que compila tu código Java *ahead-of-time* (AOT) a un binario nativo autónomo. El resultado es un ejecutable que arranca casi instantáneamente y consume mucha menos memoria, pero tiene algunas limitaciones.

*   **Launch4j / JWrapper**: Herramientas de terceros que envuelven tu `.jar` en un `.exe`, permitiendo personalizar el ícono, la pantalla de bienvenida y verificar si Java está instalado.

### 🗄️ Bases de Datos y Conectividad (JDBC)

**JDBC (Java Database Connectivity)** es la API estándar de Java que permite a las aplicaciones Java conectarse e interactuar con bases de datos relacionales.

**📂 Ubicación:** [`src/CursoJava/BasesDeDatos/`](src/CursoJava/BasesDeDatos/)
**Driver Necesario:** [`mysql-connector-j-8.1.0.jar`](./mysql-connector-j-8.1.0.jar)

#### Arquitectura y Componentes Clave

1.  **`Driver`**: Un componente de software (generalmente un archivo `.jar`) que permite a Java comunicarse con una base de datos específica (MySQL, PostgreSQL, etc.).
2.  **`DriverManager`**: Gestiona los drivers disponibles y establece la conexión con la base de datos.
3.  **`Connection`**: Representa la sesión de comunicación con la base de datos. Todas las operaciones SQL se realizan en el contexto de una `Connection`.
4.  **`Statement`**: Objeto utilizado para ejecutar una consulta SQL estática y devolver los resultados que produce. Es vulnerable a inyección SQL.
5.  **`PreparedStatement`**: Una versión precompilada de un `Statement`. Es más seguro y, a menudo, más rápido, ya que permite el uso de parámetros (`?`) para evitar la inyección SQL.
6.  **`ResultSet`**: Una tabla de datos que representa el resultado de una consulta. Se puede iterar sobre sus filas para obtener los datos.

#### Conexión a una Base de Datos (MySQL)

Para conectarse, necesitas la URL de la base de datos, un usuario y una contraseña.

```javascript
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mi_base_de_datos";
        String usuario = "root";
        String contrasena = "tu_contrasena";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contrasena)) {
            if (conexion != null) {
                System.out.println("¡Conexión exitosa a la base de datos!");
            }
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
```

#### Ejecución de Consultas

**Consulta `SELECT` con `Statement`**

```javascript
try (Statement stmt = conexion.createStatement();
     ResultSet rs = stmt.executeQuery("SELECT id, nombre, email FROM usuarios")) {

    while (rs.next()) {
        int id = rs.getInt("id");
        String nombre = rs.getString("nombre");
        String email = rs.getString("email");
        System.out.printf("ID: %d, Nombre: %s, Email: %s\n", id, nombre, email);
    }
}
```

**Consulta `INSERT` con `Statement`**

```javascript
try (Statement stmt = conexion.createStatement()) {
    String sql = "INSERT INTO usuarios (nombre, email) VALUES ('Carlos', 'carlos@ejemplo.com')";
    int filasAfectadas = stmt.executeUpdate(sql);
    System.out.println(filasAfectadas + " fila(s) insertada(s).");
}
```

#### Uso de `PreparedStatement` (Método Recomendado)

`PreparedStatement` es más seguro porque trata los parámetros como datos literales, no como parte del comando SQL, evitando así la **inyección SQL**.

```javascript
String sql = "UPDATE usuarios SET email = ? WHERE nombre = ?";

try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
    // Asignar valores a los parámetros (el primer '?' es el índice 1)
    pstmt.setString(1, "nuevo_email@ejemplo.com");
    pstmt.setString(2, "Carlos");

    int filasAfectadas = pstmt.executeUpdate();
    System.out.println(filasAfectadas + " fila(s) actualizada(s).");
}
```

#### Manejo de Transacciones

Una **transacción** es un grupo de operaciones que deben ejecutarse como una sola unidad: o todas tienen éxito, o ninguna lo tiene.

1.  **Desactivar Auto-Commit**: Por defecto, cada instrucción SQL se ejecuta en su propia transacción. Debemos desactivarlo.
2.  **Ejecutar Operaciones**: Realizar todas las consultas (INSERT, UPDATE, etc.).
3.  **Commit**: Si todo sale bien, confirmar los cambios con `commit()`.
4.  **Rollback**: Si algo falla, revertir todos los cambios hechos desde el último commit con `rollback()`.

```javascript
Connection conexion = null;
try {
    conexion = DriverManager.getConnection(url, usuario, contrasena);
    // 1. Desactivar auto-commit
    conexion.setAutoCommit(false);

    // Operación 1: Insertar un nuevo producto
    try (PreparedStatement pstmt1 = conexion.prepareStatement("INSERT INTO productos...")) {
        // ...
        pstmt1.executeUpdate();
    }

    // Operación 2: Actualizar el stock
    try (PreparedStatement pstmt2 = conexion.prepareStatement("UPDATE inventario...")) {
        // ...
        pstmt2.executeUpdate();
    }

    // 3. Si todo fue bien, confirmar la transacción
    conexion.commit();
    System.out.println("Transacción completada exitosamente.");

} catch (SQLException e) {
    System.err.println("Error en la transacción: " + e.getMessage());
    if (conexion != null) {
        try {
            // 4. Si hubo un error, revertir los cambios
            System.err.println("Revirtiendo cambios (rollback)...");
            conexion.rollback();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
} finally {
    if (conexion != null) {
        try {
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

### ⚡ Programación Funcional

Java 8 introdujo características de programación funcional, principalmente a través de interfaces funcionales y expresiones lambda.

**📂 Ubicación:**
*   [`src/CursoJava/interfazFuncional/`](src/CursoJava/interfazFuncional/)
*   [`src/CursoJava/ExpresionesLambda/`](src/CursoJava/ExpresionesLambda/)

#### Interfaces Funcionales

Una interfaz con **un solo método abstracto**. Se marcan con la anotación `@FunctionalInterface`.

```javascript
@FunctionalInterface
interface Operacion {
   int ejecutar(int a, int b);
}
```

#### Expresiones Lambda

Son una forma concisa de implementar una interfaz funcional sin necesidad de crear una clase anónima completa. Son funciones anónimas.

**Sintaxis:** `(parámetros) -> cuerpo`

```javascript
// Usando la interfaz Operacion de arriba
Operacion suma = (a, b) -> a + b;
Operacion resta = (a, b) -> a - b;

System.out.println(suma.ejecutar(5, 3)); // Imprime 8
System.out.println(resta.ejecutar(10, 4)); // Imprime 6
```

Las lambdas son muy potentes para trabajar con colecciones (filtrar, mapear, reducir datos).

### 🔄 Programación Concurrente (Multihilos)

La programación concurrente permite que diferentes partes de un programa se ejecuten de forma simultánea (o aparentemente simultánea), mejorando el rendimiento y la capacidad de respuesta de la aplicación.

**Threads y Runnables**

Un **Thread** (hilo) es la unidad de ejecución más pequeña. Hay dos formas principales de crear un hilo:

1.  **Extendiendo la clase `Thread`**:
    ```javascript
    class MiHilo extends Thread {
        public void run() {
            System.out.println("El hilo " + Thread.currentThread().getName() + " está corriendo.");
        }
    }
    // Para ejecutarlo: new MiHilo().start();
    ```

2.  **Implementando la interfaz `Runnable` (preferido)**:
    ```javascript
    class MiTarea implements Runnable {
        public void run() {
            System.out.println("La tarea está corriendo en el hilo " + Thread.currentThread().getName());
        }
    }
    // Para ejecutarlo: new Thread(new MiTarea()).start();
    // Con Lambda (más conciso):
    // new Thread(() -> System.out.println("Tarea con Lambda")).start();
    ```

**Sincronización (`synchronized`, `locks`)**

Cuando varios hilos acceden a un recurso compartido (como una variable o un objeto), pueden ocurrir inconsistencias de datos. La sincronización previene esto.

*   **`synchronized`**: Es un modificador que se puede aplicar a métodos o bloques de código. Solo un hilo puede ejecutar un bloque `synchronized` sobre el mismo objeto a la vez.

    ```javascript
    public synchronized void miMetodoSincronizado() {
        // Código seguro para la concurrencia
    }
    ```

*   **`Locks`**: Ofrecen un mecanismo de bloqueo más flexible y potente que `synchronized`.

**Problemas Comunes**

*   **Race Condition (Condición de Carrera)**: Ocurre cuando el resultado de una operación depende del orden impredecible en que los hilos acceden a un recurso compartido.
*   **Deadlock (Bloqueo Mutuo)**: Dos o más hilos se bloquean entre sí, cada uno esperando un recurso que el otro tiene.

### 🎨 Patrones de Diseño (Revisión)

Los patrones de diseño son soluciones probadas a problemas comunes de diseño de software.

**📂 Ubicación:** [`src/CursoJava/PatronesDeDisenio/`](src/CursoJava/PatronesDeDisenio/)

*   **Singleton**: Asegura que una clase solo tenga una única instancia y proporciona un punto de acceso global a ella. Útil para gestionar recursos compartidos como conexiones a bases de datos o configuraciones.

    ```javascript
    public class Configuracion {
        private static final Configuracion instancia = new Configuracion();
        private Configuracion() {} // Constructor privado para evitar instanciación externa

        public static Configuracion getInstancia() {
            return instancia;
        }
    }
    ```

*   **Factory (Fábrica)**: Define una interfaz para crear un objeto, pero deja que las subclases decidan qué clase concreta instanciar. Oculta la lógica de creación de objetos.

    ```javascript
    // Interfaz del producto
    interface Vehiculo {}
    class Coche implements Vehiculo {}
    class Moto implements Vehiculo {}

    // Fábrica
    class VehiculoFactory {
        public Vehiculo crearVehiculo(String tipo) {
            if (tipo.equalsIgnoreCase("coche")) return new Coche();
            if (tipo.equalsIgnoreCase("moto")) return new Moto();
            return null;
        }
    }
    ```

*   **Observer (Observador)**: Define una dependencia uno-a-muchos entre objetos. Cuando un objeto (el "sujeto") cambia de estado, todos sus dependientes (los "observadores") son notificados y actualizados automáticamente. Es la base de la programación reactiva y los sistemas de eventos.

### 🧪 Pruebas Unitarias con JUnit

Las pruebas unitarias son esenciales para garantizar la calidad y el correcto funcionamiento del código. JUnit es el framework de testing más popular en Java.

**Conceptos de Testing**

*   **TDD (Test-Driven Development)**: Desarrollo Guiado por Pruebas. Consiste en escribir primero una prueba que falla, luego escribir el código mínimo para que la prueba pase, y finalmente refactorizar.
*   **BDD (Behavior-Driven Development)**: Desarrollo Guiado por Comportamiento. Es una evolución de TDD que se enfoca en describir el comportamiento del sistema en un lenguaje natural.

**Anotaciones Básicas de JUnit 5**

*   `@Test`: Marca un método como un caso de prueba.
*   `@BeforeEach` (antes `@Before`): Se ejecuta antes de cada método `@Test`. Ideal para inicializar objetos.
*   `@AfterEach` (antes `@After`): Se ejecuta después de cada método `@Test`. Ideal para limpiar recursos.
*   `@DisplayName("Un nombre descriptivo")`: Da un nombre legible a la prueba.

**Assertions (Afirmaciones)**

Las assertions verifican que una condición sea verdadera. Si no lo es, la prueba falla.

```javascript
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
}

@DisplayName("Pruebas para la clase Calculadora")
class CalculadoraTest {

    @Test
    @DisplayName("Debería sumar dos números positivos correctamente")
    void testSumar() {
        // Preparación
        Calculadora calc = new Calculadora();
        int a = 2;
        int b = 3;

        // Ejecución
        int resultado = calc.sumar(a, b);

        // Verificación (Assertion)
        assertEquals(5, resultado, "La suma de 2 y 3 debería ser 5");
    }

    @Test
    @DisplayName("Debería lanzar una excepción al dividir por cero")
    void testDivisionPorCero() {
        // Verifica que se lance la excepción esperada
        assertThrows(ArithmeticException.class, () -> {
            int resultado = 10 / 0;
        });
    }
}
```

### 🖼️ Interfaces Gráficas de Usuario (GUI)

Java proporciona potentes herramientas para crear aplicaciones de escritorio con interfaces gráficas interactivas.

**📂 Ubicación:** [`src/CursoJava/InterfaceEscritorio/`](src/CursoJava/InterfaceEscritorio/)

#### Introducción a Swing y AWT

*   **AWT (Abstract Window Toolkit)**: Es la librería de GUI original de Java. Depende en gran medida de los componentes nativos del sistema operativo.
*   **Swing**: Es una mejora sobre AWT que proporciona un conjunto más rico y flexible de componentes "ligeros" (dibujados completamente en Java), lo que garantiza una apariencia y comportamiento consistentes en todas las plataformas.

**Contenedores y Componentes**

*   **Contenedores**: Son componentes que pueden albergar a otros.
    *   `JFrame`: La ventana principal de una aplicación.
    *   `JPanel`: Un panel genérico usado para agrupar y organizar otros componentes.
*   **Componentes**: Son los elementos interactivos de la GUI.
    *   `JButton`: Un botón que el usuario puede presionar.
    *   `JLabel`: Una etiqueta para mostrar texto no editable.
    *   `JTextField`: Un campo para que el usuario ingrese una línea de texto.

**Layout Managers**

Controlan cómo se posicionan y redimensionan los componentes dentro de un contenedor.

*   `FlowLayout`: Coloca los componentes uno tras otro, en filas.
*   `BorderLayout`: Divide el contenedor en cinco regiones: `NORTH`, `SOUTH`, `EAST`, `WEST` y `CENTER`.
*   `GridLayout`: Organiza los componentes en una cuadrícula (matriz) de filas y columnas.

**Manejo de Eventos (`ActionListener`)**

La programación GUI es **dirigida por eventos**. Tu código responde a acciones del usuario, como clics de botón. El `ActionListener` es una interfaz que se usa para "escuchar" y reaccionar a estos eventos.

**Ejemplo Básico con Swing:**

```javascript
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaSimple {
    public static void main(String[] args) {
        // 1. Crear la ventana principal (JFrame)
        JFrame frame = new JFrame("Mi Ventana Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // 2. Crear un panel para organizar componentes
        JPanel panel = new JPanel();

        // 3. Crear componentes
        JLabel etiqueta = new JLabel("Presiona el botón");
        JButton boton = new JButton("¡Haz clic!");

        // 4. Añadir un ActionListener al botón (usando una lambda)
        boton.addActionListener(e -> etiqueta.setText("¡Botón presionado!"));

        // 5. Añadir componentes al panel
        panel.add(etiqueta);
        panel.add(boton);

        // 6. Añadir el panel a la ventana y hacerla visible
        frame.add(panel);
        frame.setVisible(true);
    }
}
```

#### JavaFX como Alternativa Moderna

**JavaFX** es el framework de GUI más moderno para Java, diseñado para reemplazar a Swing. Ofrece un conjunto de herramientas más rico y capacidades avanzadas.

**Breve Comparación con Swing**

*   **Arquitectura**: JavaFX utiliza un "grafo de escena" y es más adecuado para UIs dinámicas y ricas.
*   **Estilo**: JavaFX se puede estilizar con CSS, de forma similar al desarrollo web.
*   **Declarativo**: Permite definir UIs con FXML (un lenguaje de marcado basado en XML), separando el diseño de la lógica.
*   **Multimedia**: Incluye soporte integrado para gráficos 2D/3D, audio y video.

**Estructura de una Aplicación JavaFX**

*   `Stage`: La ventana principal de la aplicación.
*   `Scene`: El contenedor de todo el contenido dentro de un `Stage`.
*   `Node`: Cada elemento individual en la escena (un botón, una etiqueta, una forma, etc.).

**Ejemplo Básico con JavaFX:**

```javascript
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HolaJavaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("¡Hola JavaFX!");

        Button btn = new Button();
        btn.setText("Dime 'Hola Mundo'");
        btn.setOnAction(event -> System.out.println("¡Hola Mundo desde JavaFX!"));

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

### 🌐 Desarrollo Web con Java

Java es una de las plataformas más robustas y utilizadas para el desarrollo de aplicaciones web a gran escala, desde servicios RESTful hasta complejas aplicaciones empresariales.

#### Servlets y JSPs: Los Fundamentos

*   **Servlets**: Son clases de Java que se ejecutan en un servidor de aplicaciones (como Apache Tomcat) y procesan peticiones HTTP. Son la base de la programación web en Java.
*   **JSPs (JavaServer Pages)**: Permiten escribir páginas web dinámicas mezclando HTML con código Java. Internamente, los JSPs se compilan a Servlets.

**Ciclo de Vida de un Servlet**

1.  `init()`: Se llama una sola vez cuando el servlet se carga por primera vez.
2.  `service()`: Se llama para cada petición del cliente. Delega a `doGet()`, `doPost()`, etc.
3.  `destroy()`: Se llama una sola vez cuando el servlet se descarga.

**Ejemplo de un Servlet Simple:**

```javascript
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HolaMundoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>¡Hola Mundo desde un Servlet!</h1>");
        out.println("</body></html>");
    }
}
```

**Ejemplo de una Página JSP:**

```html
<%-- mi_pagina.jsp --%>
<html>
<head><title>Página JSP</title></head>
<body>
    <h2>¡Hola desde una página JSP!</h2>
    <p>La fecha y hora actual es: <%= new java.util.Date() %></p>
</body>
</html>
```

#### Frameworks Modernos: Spring Boot

Hoy en día, es raro desarrollar aplicaciones web usando solo Servlets y JSPs. Frameworks como **Spring Boot** simplifican enormemente el proceso.

**Introducción a Spring Boot**

Spring Boot es un framework que facilita la creación de aplicaciones Java autónomas y de grado de producción. Sus ventajas clave son:

*   **Autoconfiguración**: Configura automáticamente la aplicación basándose en las dependencias que añades.
*   **Servidor Embebido**: Incluye un servidor (como Tomcat) directamente en la aplicación, por lo que no necesitas desplegar un archivo `.war` externo.
*   **Ecosistema Enorme**: Se integra fácilmente con todo el ecosistema de Spring (Spring Data para bases de datos, Spring Security para seguridad, etc.).

**Creación de un Controlador REST Simple**

Un API REST es una forma común de exponer la funcionalidad de una aplicación a través de HTTP. Con Spring Boot, crear un endpoint REST es trivial.

```javascript
// Es necesario tener las dependencias de Spring Boot (spring-boot-starter-web)

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MiAplicacionWeb {

    public static void main(String[] args) {
        SpringApplication.run(MiAplicacionWeb.class, args);
    }

    // Este método manejará las peticiones GET a la ruta "/"
    @GetMapping("/")
    public String hola() {
        return "¡Hola desde Spring Boot!";
    }

    // Este método manejará las peticiones GET a la ruta "/api/saludo"
    @GetMapping("/api/saludo")
    public Saludo getSaludo() {
        return new Saludo("¡Bienvenido a la API REST con Spring Boot!");
    }

    // Una clase simple para representar un objeto JSON
    static class Saludo {
        private final String mensaje;

        public Saludo(String mensaje) {
            this.mensaje = mensaje;
        }

        public String getMensaje() {
            return mensaje;
        }
    }
}
```
Al ejecutar esta aplicación y acceder a `http://localhost:8080/api/saludo` en un navegador, recibirías una respuesta JSON como: `{"mensaje":"¡Bienvenido a la API REST con Spring Boot!"}`.

---

## 🗺️ Guía del Repositorio

### 📁 Estructura del Proyecto

```
CursoDeJava/
├── src/
│   ├── CursoJava/          # Ejemplos y teoría principal
│   ├── Parciales/          # Ejercicios de parciales
│   ├── Practica/           # Prácticas adicionales
│   └── ExamenesFinales/    # Ejercicios de exámenes finales
├── mysql-connector-j-8.1.0.jar    # Driver de MySQL
└── README.md
```

### 🚀 Configuración del Entorno

#### Prerrequisitos
- **Java Development Kit (JDK) 8 o superior**
- **IDE recomendado:** IntelliJ IDEA, Eclipse o NetBeans
- **MySQL** (opcional, para ejercicios de bases de datos)

#### Configuración Paso a Paso

1.  **Clonar el repositorio:**
    ```bash
    git clone https://github.com/facundouferer/CursoDeJava.git
    cd CursoDeJava
    ```

2.  **Importar en tu IDE:**
    *   **IntelliJ IDEA:** `File > Open` y selecciona la carpeta del proyecto.
    *   **Eclipse:** `File > Import > Existing Projects into Workspace`.
    *   **NetBeans:** `File > Open Project`.

3.  **Configurar el JDK:**
    *   Asegúrate de que tu IDE esté configurado para usar un JDK válido.
    *   En IntelliJ: `File > Project Structure > Project > Project SDK`.

### 🔧 Compilación y Ejecución

#### Desde IDE
1.  Abre el proyecto en tu IDE.
2.  Navega al archivo `.java` que deseas ejecutar.
3.  Haz clic derecho y selecciona "Run".

#### Desde Terminal
```bash
# Compilar un archivo específico
javac -cp ".:mysql-connector-j-8.1.0.jar" src/CursoJava/Funciones/Ejercicio01.java

# Ejecutar (desde la raíz del proyecto)
java -cp ".:mysql-connector-j-8.1.0.jar:src" CursoJava.Funciones.Ejercicio01
```

---

## 📞 Contacto y Contribuciones

**Autor:** Facundo Uferer
**Institución:** Universidad Tecnológica Nacional (UTN)

### 🤝 Cómo Contribuir
1.  Haz un **Fork** del repositorio.
2.  Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3.  Haz tus cambios y haz commit (`git commit -m 'Agrega nueva funcionalidad'`).
4.  Haz push a tu rama (`git push origin feature/nueva-funcionalidad`).
5.  Abre un **Pull Request**.

---

## 📄 Licencia

Este proyecto está destinado principalmente para fines educativos.

---

## 🔗 Enlaces Útiles

*   [Documentación oficial de Java](https://docs.oracle.com/javase/)
*   [Tutorial de Java - Oracle](https://docs.oracle.com/javase/tutorial/)
*   [IntelliJ IDEA](https://www.jetbrains.com/idea/)
*   [Eclipse IDE](https://www.eclipse.org/)
*   [MySQL](https://www.mysql.com/)

---

*Última actualización: Noviembre 2025*

---

¡Felicitaciones por llegar hasta aquí! Esta guía ha sido diseñada para ser un compañero robusto en tu viaje de aprendizaje con Java. Recuerda que la clave para ser un gran desarrollador es la práctica constante y la curiosidad sin fin. ¡Sigue construyendo, sigue aprendiendo y que el código te acompañe!