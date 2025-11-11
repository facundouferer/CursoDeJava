# 🌟 Curso de Java Definitivo - De Cero a Héroe 🌟

¡Bienvenido al repositorio definitivo para aprender Java! Este proyecto, originalmente creado para el curso de la **Universidad Tecnológica Nacional (UTN)**, ha sido enriquecido para convertirse en una guía completa que te llevará desde los conceptos más básicos de la programación hasta temas avanzados de Java.

Aquí encontrarás no solo el código de los ejercicios prácticos, sino también una explicación detallada de cada concepto fundamental. ¡Prepárate para iniciar tu viaje en el fascinante mundo de Java!

## 📜 Tabla de Contenidos

1.  [Conceptos Básicos de Programación](#-conceptos-básicos-de-programación)
2.  [Introducción a Java](#-introducción-a-java)
3.  [Sintaxis y Fundamentos](#-sintaxis-y-fundamentos)
    *   [Variables y Tipos de Datos](#-variables-y-tipos-de-datos)
    *   [Operadores](#-operadores)
    *   [Estructuras de Control de Flujo](#-estructuras-de-control-de-flujo)
    *   [Arrays y Strings](#-arrays-y-strings)
    *   [Funciones (Métodos)](#-funciones-métodos)
4.  [Paradigma Orientado a Objetos (POO)](#-paradigma-orientado-a-objetos-poo)
    *   [Clases y Objetos](#clases-y-objetos)
    *   [Pilares de la POO (Encapsulamiento, Herencia, Polimorfismo, Abstracción)](#pilares-de-la-poo)
    *   [Modificadores de Acceso](#modificadores-de-acceso)
5.  [Temas Avanzados](#-temas-avanzados)
    *   [Estructuras de Datos (TAD)](#-estructuras-de-datos-tad)
    *   [Java Collections Framework](#-java-collections-framework)
    *   [Manejo de Excepciones](#-manejo-de-excepciones)
    *   [Programación Funcional (Interfaces Funcionales y Lambdas)](#-programación-funcional)
    *   [Patrones de Diseño](#-patrones-de-diseño)
6.  [Guía del Repositorio](#-guía-del-repositorio)
    *   [Estructura del Proyecto](#-estructura-del-proyecto)
    *   [Configuración del Entorno](#-configuración-del-entorno)
    *   [Compilación y Ejecución](#-compilación-y-ejecución)
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

**Métodos Esenciales:**

*   `length()`: Devuelve la longitud de la cadena.
*   `charAt(index)`: Devuelve el carácter en una posición específica.
*   `toUpperCase()` / `toLowerCase()`: Convierte a mayúsculas o minúsculas.
*   `equals(otroString)`: Compara si dos strings son idénticos (sensible a mayúsculas).
*   `equalsIgnoreCase(otroString)`: Compara ignorando mayúsculas/minúsculas.
*   `contains(subcadena)`: Verifica si contiene una subcadena.
*   `startsWith(prefijo)` / `endsWith(sufijo)`: Verifica si empieza o termina con un texto.
*   `+` (Concatenación): Une dos o más strings.

```javascript
String saludo = "Hola";
saludo = saludo + " mundo!"; // Crea un NUEVO string "Hola mundo!"
System.out.println(saludo.toUpperCase()); // Imprime "HOLA MUNDO!"
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

### 🔗 Estructuras de Datos (TAD)

Un **Tipo Abstracto de Dato (TAD)** define un conjunto de operaciones para una estructura de datos sin especificar cómo se implementan.

**📂 Ubicación:**
*   **Pilas:** [`src/CursoJava/Pila/`](src/CursoJava/Pila/)
*   **Colas:** [`src/CursoJava/Cola/`](src/CursoJava/Cola/)
*   **Árboles:** [`src/CursoJava/Arbol/`](src/CursoJava/Arbol/)
*   **Listas (TAD):** [`src/CursoJava/TAD/`](src/CursoJava/TAD/)

#### Listas Enlazadas

Una estructura de datos donde los elementos (nodos) no están en memoria contigua. Cada nodo contiene un valor y una referencia (un "enlace") al siguiente nodo.

*   **Ventajas:** Inserciones y eliminaciones eficientes, tamaño dinámico.
*   **Desventajas:** Acceso lento a elementos por índice (requiere recorrer la lista).

```javascript
// Ejemplo conceptual de un nodo
class Node<T> {
  T value;
  Node<T> next; // Referencia al siguiente nodo
}
```

### 📦 Java Collections Framework

Es un conjunto de clases e interfaces para almacenar y manipular grupos de objetos de manera eficiente. ¡No necesitas reinventar la rueda!

**📂 Ubicación:** [`src/CursoJava/Colecciones/`](src/CursoJava/Colecciones/)

*   **`List`**: Colección ordenada que permite duplicados.
    *   `ArrayList`: Rápida para acceso por índice.
    *   `LinkedList`: Rápida para inserciones y eliminaciones.
*   **`Set`**: Colección que **no** permite elementos duplicados.
    *   `HashSet`: No garantiza ningún orden.
    *   `TreeSet`: Mantiene los elementos ordenados.
*   **`Map`**: Colección de pares clave-valor. No permite claves duplicadas.
    *   `HashMap`: No garantiza orden.
    *   `TreeMap`: Mantiene las claves ordenadas.

```javascript
// Ejemplo de uso de List con ArrayList
List<String> nombres = new ArrayList<>();
nombres.add("Ana");
nombres.add("Luis");
nombres.add("Ana"); // Permite duplicados

System.out.println(nombres); // Imprime [Ana, Luis, Ana]
```

### 🚨 Manejo de Excepciones

Una **excepción** es un evento anómalo que ocurre durante la ejecución de un programa (ej: división por cero, archivo no encontrado). Java permite "capturar" y manejar estas excepciones para evitar que el programa se detenga bruscamente.

**📂 Ubicación:** [`src/CursoJava/Excepciones/`](src/CursoJava/Excepciones/)

Se usa el bloque `try-catch-finally`:

*   **`try`**: Contiene el código que podría lanzar una excepción.
*   **`catch`**: Contiene el código que se ejecuta si se produce una excepción específica.
*   **`finally`**: Contiene código que se ejecutará siempre, haya o no una excepción (ideal para liberar recursos como cerrar archivos).

```javascript
try {
    int resultado = 10 / 0; // Esto lanzará una ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Error: No se puede dividir por cero.");
} finally {
    System.out.println("Este bloque se ejecuta siempre.");
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

### 🎨 Patrones de Diseño

Son soluciones probadas y reutilizables para problemas comunes en el diseño de software.

**📂 Ubicación:** [`src/CursoJava/PatronesDeDisenio/`](src/CursoJava/PatronesDeDisenio/)

#### Patrón State

Permite que un objeto cambie su comportamiento cuando su estado interno cambia. El objeto parece cambiar de clase.

#### Patrón Template Method

Define el esqueleto de un algoritmo en una superclase, pero deja que las subclases anulen pasos específicos del algoritmo sin cambiar su estructura.

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