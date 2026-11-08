# Programas del curso de Java

Cada carpeta `lNN_<tema>` corresponde a la lección `NN` del curso (`src/content/courses/java/NN-<tema>.es.md` en el repositorio `facundouferer`). El package de cada programa coincide con su carpeta: `CursoJava.lNN_<tema>`.

## Convenciones

- `EjNN<Tema>.java`: programa de un solo archivo. `NN` indica el orden didáctico dentro de la lección y sigue el orden de las secciones del curso.
- `ejNN_<tema>/`: programa de varias clases (modelo + `Main`) en su propio sub-package, para que los nombres de clase no colisionen.
- `integrador_<origen>_<tema>/`: examen, final o proyecto que integra varios temas. Se ubica en la lección más avanzada que necesita. Su clase de entrada lleva un encabezado con el enunciado y los conceptos que integra. Ver la sección "Integradores".
- Los programas que usan Swing (`l03` operador ternario e if anidado con `JOptionPane`, `l11` clases adaptadoras) necesitan entorno gráfico. Los de `l21` necesitan MySQL y el conector `mysql-connector-j-8.1.0.jar`.

## Lecciones

| Lección | Carpeta | Archivos `.java` |
|---|---|---|
| 01 Conceptos básicos | `l01_conceptos_basicos` | 3 |
| 02 Variables, tipos de datos y operadores | `l02_variables_tipos_datos_y_operadores` | 8 |
| 03 Control de flujo y bucles | `l03_control_de_flujo_y_bucles` | 43 |
| 04 Arrays y Strings | `l04_arrays_y_strings` | 33 |
| 05 Métodos y funciones (incluye recursión) | `l05_metodos_y_funciones` | 25 |
| 06 Introducción y pilares de la POO | `l06_introduccion_y_pilares_poo` | 11 |
| 07 Fundamentos de POO: clases y objetos | `l07_fundamentos_poo_clases_y_objetos` | 28 |
| 08 Constructores y encapsulamiento | `l08_constructores_y_encapsulamiento` | 3 |
| 09 Arrays de objetos | `l09_arrays_de_objetos` | 27 |
| 10 Herencia, polimorfismo y sobrecarga | `l10_herencia_polimorfismo_y_sobrecarga` | 29 |
| 11 Clases abstractas, interfaces y modelado | `l11_clases_abstractas_interfaces_y_modelado` | 48 |
| 12 Excepciones y manejo de errores | `l12_excepciones_y_manejo_de_errores` | 20 |
| 13 TAD: listas estáticas y dinámicas | `l13_tad_listas_estaticas_y_dinamicas` | 8 |
| 14 TAD: pilas y colas | `l14_tad_pilas_y_colas` | 4 |
| 15 Java Collections Framework y genéricos | `l15_java_collections_framework_y_genericos` | 46 |
| 16 Iteradores, ordenamiento, equals y hashCode (incluye lambdas y referencias a métodos) | `l16_iteradores_ordenamiento_equals_hashcode` | 37 |
| 17 TAD: árboles binarios y búsqueda | `l17_tad_arboles_binarios_y_busqueda` | 5 |
| 18 Grafos: representación y algoritmos | `l18_grafos_representacion_y_algoritmos` | 8 |
| 19 Archivos, persistencia y empaquetado JAR (incluye serialización) | `l19_archivos_persistencia_y_empaquetado_jar` | 33 |
| 20 Programación concurrente: hilos y pools | `l20_programacion_concurrente_hilos_y_pools` | 14 |
| 21 Acceso a bases de datos con JDBC | `l21_acceso_a_bases_de_datos_jdbc` | 32 |
| 23 Algoritmia, verificación y complejidad (incluye ordenamiento) | `l23_algoritmia_verificacion_y_complejidad` | 3 |
| 26 Árboles n-arios y representación con vectores | `l26_arboles_n_arios_y_representacion_con_vectores` | 1 |

Los totales incluyen los integradores.

## Integradores

Origen indica de dónde viene: `p1` primer parcial, recuperatorio y examen de Programación II; `p2` segundo parcial; `fin` exámenes finales; `bd` finales con base de datos; `proy` proyectos.

| Lección | Integrador |
|---|---|
| 05 | `integrador_fin_ropashop` |
| 07 | `integrador_fin_finales` |
| 09 | `integrador_p1_encuestadora`, `integrador_p1_calidad`, `integrador_proy_stock`, `integrador_proy_agenda` |
| 10 | `integrador_fin_biblioteca` |
| 11 | `integrador_p1_universidad` |
| 15 | `integrador_p1_encuestadora_avanzada`, `integrador_p1_calidad_avanzada`, `integrador_p1_heladera` |
| 16 | `integrador_p2_concesionario`, `integrador_p2_tecnologia`, `integrador_p2_veterinaria` |
| 17 | `integrador_p1_arbol_binario` |
| 19 | `integrador_fin_hoteleria`, `integrador_fin_hospital`, `integrador_p1_existencia_archivo` |
| 21 | `integrador_bd_concesionario`, `integrador_bd_hospital`, `integrador_bd_ventas` |

## Lecciones del curso sin programas

Las lecciones 22, 24, 25 y 27 no existen en el curso actual (el repositorio del curso eliminó las de testing con Spring Boot y de depuración y código limpio), por lo que no tienen programas.
