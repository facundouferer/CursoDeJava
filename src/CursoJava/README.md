# Programas del curso de Java

Cada carpeta `lNN_<tema>` corresponde a la lección `NN` del curso (`src/content/courses/java/NN-<tema>.es.md` en el repositorio `facundouferer`). El package de cada programa coincide con su carpeta: `CursoJava.lNN_<tema>`.

## Convenciones

- `EjNN<Tema>.java`: programa de un solo archivo. `NN` indica el orden didáctico dentro de la lección y sigue el orden de las secciones del curso.
- `ejNN_<tema>/`: programa de varias clases (modelo + `Main`) en su propio sub-package, para que los nombres de clase no colisionen.
- Los programas que usan Swing (`l03` operador ternario e if anidado con `JOptionPane`, `l11` clases adaptadoras) necesitan entorno gráfico. Los de `l21` necesitan MySQL y el conector `mysql-connector-j-8.1.0.jar`.

## Lecciones

| Lección | Carpeta | Programas |
|---|---|---|
| 01 Conceptos básicos | `l01_conceptos_basicos` | 3 |
| 02 Variables, tipos de datos y operadores | `l02_variables_tipos_datos_y_operadores` | 8 |
| 03 Control de flujo y bucles | `l03_control_de_flujo_y_bucles` | 43 |
| 04 Arrays y Strings | `l04_arrays_y_strings` | 33 |
| 05 Métodos y funciones (incluye recursión) | `l05_metodos_y_funciones` | 24 |
| 06 Introducción y pilares de la POO | `l06_introduccion_y_pilares_poo` | 11 |
| 07 Fundamentos de POO: clases y objetos | `l07_fundamentos_poo_clases_y_objetos` | 26 |
| 08 Constructores y encapsulamiento | `l08_constructores_y_encapsulamiento` | 3 |
| 09 Arrays de objetos | `l09_arrays_de_objetos` | 9 |
| 10 Herencia, polimorfismo y sobrecarga | `l10_herencia_polimorfismo_y_sobrecarga` | 24 |
| 11 Clases abstractas, interfaces y modelado | `l11_clases_abstractas_interfaces_y_modelado` | 40 |
| 12 Excepciones y manejo de errores | `l12_excepciones_y_manejo_de_errores` | 20 |
| 13 TAD: listas estáticas y dinámicas | `l13_tad_listas_estaticas_y_dinamicas` | 8 |
| 14 TAD: pilas y colas | `l14_tad_pilas_y_colas` | 4 |
| 15 Java Collections Framework y genéricos | `l15_java_collections_framework_y_genericos` | 25 |
| 16 Iteradores, ordenamiento, equals y hashCode (incluye lambdas y referencias a métodos) | `l16_iteradores_ordenamiento_equals_hashcode` | 16 |
| 17 TAD: árboles binarios y búsqueda | `l17_tad_arboles_binarios_y_busqueda` | 1 |
| 19 Archivos, persistencia y empaquetado JAR (incluye serialización) | `l19_archivos_persistencia_y_empaquetado_jar` | 20 |
| 21 Acceso a bases de datos con JDBC | `l21_acceso_a_bases_de_datos_jdbc` | 15 |
| 23 Algoritmia, verificación y complejidad (incluye ordenamiento) | `l23_algoritmia_verificacion_y_complejidad` | 3 |
| 26 Árboles n-arios y representación con vectores | `l26_arboles_n_arios_y_representacion_con_vectores` | 1 |

## Lecciones del curso sin programas

No hay código en el repositorio para las lecciones 18 (grafos), 20 (concurrencia) y 27 (depuración, código limpio y refactorización). Tampoco hay programas para varias secciones puntuales: Map y funcionamiento interno de `HashMap`, genéricos propios y `Queue`/`Deque` en la lección 15.

## Fuera del esquema

`src/exam/`, `src/ExamenesFinales/` y `src/Proyectos/` son evaluaciones y proyectos integradores. Se conservan tal como estaban.
