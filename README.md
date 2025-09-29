# Curso de Java - UTN

Este repositorio contiene ejemplos y ejercicios prácticos para el curso de Java de la Universidad Tecnológica Nacional (UTN). El contenido está organizado por unidades temáticas que siguen el programa académico.

## 📁 Estructura del Proyecto

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

## 🚀 Configuración del Entorno

### Prerrequisitos
- **Java Development Kit (JDK) 8 o superior**
- **IDE recomendado:** IntelliJ IDEA, Eclipse o NetBeans
- **MySQL** (opcional, para ejercicios de bases de datos)

### Configuración Paso a Paso

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/facundouferer/CursoDeJava.git
   cd CursoDeJava
   ```

2. **Importar en tu IDE:**
   - **IntelliJ IDEA:** `File > Open` y selecciona la carpeta del proyecto
   - **Eclipse:** `File > Import > Existing Projects into Workspace`
   - **NetBeans:** `File > Open Project`

3. **Configurar el JDK:**
   - Asegúrate de que tu IDE esté configurado para usar JDK 8 o superior
   - En IntelliJ: `File > Project Structure > Project > Project SDK`

4. **Configurar MySQL (opcional):**
   - El driver `mysql-connector-j-8.1.0.jar` ya está incluido en el proyecto
   - Configurar conexión de base de datos según los ejercicios específicos

## 📚 UNIDAD 2 – INTRODUCCIÓN A LA PROGRAMACIÓN EN JAVA

### 🔧 Subprogramas y Estructura Básica

#### Funciones y Procedimientos
- **📂 Ubicación:** [`src/CursoJava/Funciones/`](src/CursoJava/Funciones/)
  - `Ejercicio01.java` - `Ejercicio07.java`: Ejemplos básicos de funciones
  - `Ejercicio10.java`: Funciones avanzadas
  - [`Matematicas/`](src/CursoJava/Funciones/Matematicas/): Funciones matemáticas
  - `MetodoArreglos.java`: Métodos para manipulación de arrays

#### Ámbito de Variables y Paso de Parámetros
- **📂 Ubicación:** [`src/CursoJava/Funciones/`](src/CursoJava/Funciones/)
  - Los ejercicios demuestran variables locales vs globales
  - Ejemplos de paso por valor y referencia

#### Introducción a la Recursividad
- **📂 Ubicación:** [`src/CursoJava/Recursion/`](src/CursoJava/Recursion/)
  - `Factorial.java`: Cálculo recursivo del factorial
  - `Fibonacci.java`: Secuencia de Fibonacci recursiva
  - `ContadorDeOvejas.java`: Ejemplo didáctico de recursión
  - `StackOverflowExample.java`: Demostración de límites de recursión

### 🎛️ Estructuras de Control de Flujo

#### Estructuras Condicionales
- **📂 Ubicación:** [`src/CursoJava/Condicionales/`](src/CursoJava/Condicionales/)
  - `ej01OperadorTernario.java`: Operador ternario (? :)
  - `ej02CondicionalIF.java`: Estructura if básica
  - `ej03IfElse.java`: Estructura if-else
  - `ej04ifAnidado.java`: Condicionales anidados
  - `ej05CondicionalSwitch1.java`: Estructura switch
  - `ordenar.java`: Aplicación práctica de condicionales

#### Estructuras Repetitivas
- **📂 Ubicación:** [`src/CursoJava/EstructurasIterativas/`](src/CursoJava/EstructurasIterativas/)
  - `ej01BucleFor1.java` y `ej02BucleFor2.java`: Bucles for básicos
  - `ej03BucleWhile1.java`: Bucle while
  - `ej04BucleForAnidado.java`: Bucles anidados
  - `ej05BucleDoWhile1.java`: Bucle do-while
  - `ej06ForEach.java`: Bucle for-each (enhanced for)

#### Control de Flujo con break y continue
- **📂 Ubicación:** [`src/CursoJava/EstructurasIterativas/`](src/CursoJava/EstructurasIterativas/)
  - Ejemplos integrados en los bucles anteriores

### 💻 Entrada y Salida de Datos

#### Ingreso por Teclado y Salida por Consola
- **📂 Ubicación:** [`src/CursoJava/Inicio/`](src/CursoJava/Inicio/)
  - Ejemplos de uso de `Scanner` para entrada de datos
  - Uso de `System.out.println()` y `printf()` para salida

### 📊 Arrays

#### Arrays Unidimensionales
- **📂 Ubicación:** [`src/CursoJava/ArreglosEstaticos/`](src/CursoJava/ArreglosEstaticos/)
  - `Arreglos01.java` - `Arreglos12.java`: Ejemplos progresivos
  - `DeclararYMostrar.java`: Declaración e inicialización
  - `CrearArregloUsuario.java`: Arrays con entrada del usuario
  - `ListarElementos.java`: Recorrido de arrays
  - `BuscarUnElementoYEliminar.java`: Búsqueda y eliminación
  - `BuscarYEliminarImpares.java`: Manipulación avanzada
  - `EliminarElementos.java`: Operaciones de eliminación

#### Operaciones Básicas con Arrays
- **📂 Ubicación:** [`src/CursoJava/Arreglos/`](src/CursoJava/Arreglos/)
  - `OperacionesBasicas.java`: Operaciones fundamentales

#### Arrays Multidimensionales
- **📂 Ubicación:** [`src/CursoJava/ArreglosMultidimensionales/`](src/CursoJava/ArreglosMultidimensionales/)
  - `ArregloBidimensional.java`: Arrays bidimensionales
  - `Estudiantes.java`: Ejemplo práctico con matriz de estudiantes
  - `recorrerConForEach.java`: Recorrido con for-each
  - `rellenarAregloBisConMath.java`: Inicialización con Math
  - `rellenarArregloConMath.java`: Relleno automático

### 📝 Strings

#### Manipulación de Cadenas
- **📂 Ubicación:** [`src/CursoJava/Secuencias/`](src/CursoJava/Secuencias/)
  - `CargarNombres.java`: Carga y manipulación de nombres
  - `OrdenAlfabetico.java`: Ordenamiento alfabético
  - `UnionListas.java`: Concatenación de cadenas

#### Métodos Esenciales de String
- Ejemplos distribuidos en varios ejercicios mostrando:
  - Concatenación, comparación, longitud
  - Cambio de mayúsculas/minúsculas
  - Búsqueda y verificación de subcadenas
  - Caracteres de escape y formato

---

## 🏗️ UNIDAD 3 – PARADIGMA ORIENTADO A OBJETOS (POO) EN JAVA

### 🎯 Fundamentos de la POO

#### Clases y Objetos
- **📂 Ubicación:** [`src/CursoJava/POO/`](src/CursoJava/POO/)
  - `ConceptosFundamentales.java`: Conceptos básicos de POO
  - `Universidad.java`: Ejemplo práctico de clase Universidad
  - [`Ejercicios/`](src/CursoJava/POO/Ejercicios/): Ejercicios prácticos (Ejercicio01-07)

#### Constructores y Métodos
- **📂 Ubicación:** [`src/CursoJava/POO/`](src/CursoJava/POO/)
  - Ejemplos de constructores por defecto y parametrizados
  - Definición de métodos de instancia

#### Modificadores de Acceso
- **📂 Ubicación:** [`src/CursoJava/ModificadoresDeAcceso/`](src/CursoJava/ModificadoresDeAcceso/)
  - `EmpresaDeModificadores.java`: Demostración de public, private, protected, default

#### Variables y Métodos Estáticos
- **📂 Ubicación:** Distribuido en varios ejemplos de [`src/CursoJava/POO/`](src/CursoJava/POO/)
  - Demostración de variables y métodos de clase (static)

#### Getters y Setters
- **📂 Ubicación:** [`src/CursoJava/POO/`](src/CursoJava/POO/)
  - `AbstraccionYEncapsulamiento.java`: Implementación de getters y setters

### 🏛️ Pilares de la POO

#### Encapsulamiento
- **📂 Ubicación:** [`src/CursoJava/POO/`](src/CursoJava/POO/)
  - `AbstraccionYEncapsulamiento.java`: Principios de encapsulamiento

#### Herencia
- **📂 Ubicación:** [`src/CursoJava/Herencia/`](src/CursoJava/Herencia/)
  - `Fabrica.java`: Ejemplo de herencia con jerarquía de clases
- **📂 También en:** [`src/CursoJava/POO/`](src/CursoJava/POO/)
  - `HerenciaYPolimorfismo.java`: Conceptos combinados

#### Polimorfismo
- **📂 Ubicación:** [`src/CursoJava/Polimorfismo/`](src/CursoJava/Polimorfismo/)
  - `Polimorfismo.java`: Implementación de polimorfismo
- **📂 También en:** [`src/CursoJava/POO/`](src/CursoJava/POO/)
  - `HerenciaYPolimorfismo.java`: Ejemplos combinados

#### Sobreescritura y Sobrecarga de Métodos
- **📂 Ubicación:** Ejemplos distribuidos en:
  - [`src/CursoJava/Herencia/`](src/CursoJava/Herencia/)
  - [`src/CursoJava/Polimorfismo/`](src/CursoJava/Polimorfismo/)

#### Clases Abstractas
- **📂 Ubicación:** [`src/CursoJava/ClasesAbstractas/`](src/CursoJava/ClasesAbstractas/)
  - `FigurasAbstractas.java`: Jerarquía de figuras geométricas
  - `Transportes.java`: Sistema de transportes
  - `Veterinaria.java`: Sistema veterinario

#### Interfaces
- **📂 Ubicación:** [`src/CursoJava/Interfaces/`](src/CursoJava/Interfaces/)
  - `Empresa.java`: Implementación de interfaces
- **📂 También:** [`src/CursoJava/interfazFuncional/`](src/CursoJava/interfazFuncional/)
  - Interfaces funcionales y expresiones lambda

---

## 📚 Contenido Adicional

### 🧮 Estructuras de Datos
- **📂 Pilas:** [`src/CursoJava/Pila/`](src/CursoJava/Pila/)
- **📂 Colas:** [`src/CursoJava/Cola/`](src/CursoJava/Cola/)
- **📂 Árboles:** [`src/CursoJava/Arbol/`](src/CursoJava/Arbol/)
- **📂 Nodos:** [`src/CursoJava/Nodo/`](src/CursoJava/Nodo/)

### 🗂️ Colecciones Java
- **📂 Ubicación:** [`src/CursoJava/Colecciones/`](src/CursoJava/Colecciones/)
- **📂 Equals:** [`src/CursoJava/ColeccionesEquals/`](src/CursoJava/ColeccionesEquals/)
- **📂 HashCode:** [`src/CursoJava/ColeccionesHashCode/`](src/CursoJava/ColeccionesHashCode/)
- **📂 Iteradores:** [`src/CursoJava/ColeccionesIteradores/`](src/CursoJava/ColeccionesIteradores/)

### 🚨 Manejo de Excepciones
- **📂 Ubicación:** [`src/CursoJava/Excepciones/`](src/CursoJava/Excepciones/)

### 📁 Archivos y Directorios
- **📂 Ubicación:** [`src/CursoJava/ArchivosYDirectorios/`](src/CursoJava/ArchivosYDirectorios/)

### 💾 Bases de Datos
- **📂 Ubicación:** [`src/CursoJava/BasesDeDatos/`](src/CursoJava/BasesDeDatos/)

### ⚡ Expresiones Lambda
- **📂 Ubicación:** [`src/CursoJava/ExpresionesLambda/`](src/CursoJava/ExpresionesLambda/)
- **📂 Con Colecciones:** [`src/CursoJava/ExpresionesLambdaColecciones/`](src/CursoJava/ExpresionesLambdaColecciones/)

---

## 📖 Material de Práctica

### 📝 Prácticas Adicionales
- **📂 Ubicación:** [`src/Practica/`](src/Practica/)
  - `Practica01.java` - `Practica06.java`: Ejercicios progresivos
  - [`Practica07/`](src/Practica/Practica07/): Ejercicios avanzados
  - [`Universidad/`](src/Practica/Universidad/): Sistema universitario completo
  - [`ClaseAbstracta/`](src/Practica/ClaseAbstracta/): Práctica de abstracci��n

### 📊 Evaluaciones
- **📂 Parciales:** [`src/Parciales/`](src/Parciales/)
  - Organizados por unidades (Unidad01-06)
  - `Parcial2ProgII/`: Segundo parcial de Programación II
  - `ExamenFinal/`: Preparación para examen final

- **📂 Exámenes Finales:** [`src/ExamenesFinales/`](src/ExamenesFinales/)
  - `Hoteleria.java`: Sistema de hotelería
  - `Libro.java`: Gestión de biblioteca
  - `RopaShop.java`: Tienda de ropa
  - [`BasesDeDatos/`](src/ExamenesFinales/BasesDeDatos/): Exámenes con BD
  - [`Hospital/`](src/ExamenesFinales/Hospital/): Sistema hospitalario

---

## 🔧 Compilación y Ejecución

### Desde IDE
1. Abrir el proyecto en tu IDE favorito
2. Navegar al archivo `.java` que deseas ejecutar
3. Hacer clic derecho y seleccionar "Run" o usar Ctrl+Shift+F10 (IntelliJ)

### Desde Terminal
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
1. Fork el repositorio
2. Crea una branch para tu feature (`git checkout -b feature/nueva-funcionalidad`)
3. Commit tus cambios (`git commit -m 'Agrega nueva funcionalidad'`)
4. Push a la branch (`git push origin feature/nueva-funcionalidad`)
5. Abre un Pull Request

---

## 📄 Licencia

Este proyecto está destinado únicamente para fines educativos en el marco del curso de Java de la UTN.

---

## 🔗 Enlaces Útiles

- [Documentación oficial de Java](https://docs.oracle.com/javase/)
- [Tutorial de Java - Oracle](https://docs.oracle.com/javase/tutorial/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- [Eclipse IDE](https://www.eclipse.org/)
- [MySQL](https://www.mysql.com/)

---

*Última actualización: Septiembre 2025*