# Finales de ejemplo

Tres ejercicios integradores que, en conjunto, cubren todas las unidades del curso.

| Ejercicio | Tema | Unidades |
|-----------|------|----------|
| `Final01Biblioteca` | POO completa, excepciones, colecciones, equals/hashCode, ordenamiento, archivos | l01, l02, l03, l04, l05, l06, l07, l08, l09, l10, l11, l12, l15, l16, l19 |
| `Final02EstructurasDeDatos` | Lista, pila, cola, ABB, árbol n-ario, ordenamientos y complejidad | l13, l14, l15, l16, l17, l23, l26 |
| `Final03RedDeRutas` | Grafos, concurrencia, JDBC, archivos | l11, l12, l15, l18, l19, l20, l21 |

Cobertura por unidad:

| Unidad | Ejercicio(s) |
|--------|--------------|
| l01 a l03 (básicos, tipos, control de flujo) | Final01 |
| l04 (arrays y strings) | Final01 |
| l05 (métodos y sobrecarga) | Final01 |
| l06 a l09 (POO, constructores, encapsulamiento, arrays de objetos) | Final01 |
| l10 (herencia y polimorfismo) | Final01 |
| l11 (abstractas e interfaces) | Final01, Final03 |
| l12 (excepciones) | Final01, Final03 |
| l13 (listas) | Final02 |
| l14 (pilas y colas) | Final02 |
| l15 (collections y genéricos) | Final01, Final02, Final03 |
| l16 (iteradores, orden, equals/hashCode) | Final01, Final02 |
| l17 (árboles binarios) | Final02 |
| l18 (grafos) | Final03 |
| l19 (archivos) | Final01, Final03 |
| l20 (concurrencia) | Final03 |
| l21 (JDBC) | Final03 |
| l23 (algoritmia y complejidad) | Final02 |
| l26 (árboles n-arios) | Final02 |

## Compilar y ejecutar

```bash
javac -encoding UTF-8 -d out src/CursoJava/finales_ejemplo/*.java
java -cp out CursoJava.finales_ejemplo.Final01Biblioteca
java -cp out CursoJava.finales_ejemplo.Final02EstructurasDeDatos
java -cp out CursoJava.finales_ejemplo.Final03RedDeRutas
```

`Final03RedDeRutas` usa un repositorio en memoria por defecto. Para usar JDBC, pasar `url usuario clave`
y crear antes la tabla `distancia(origen VARCHAR(50), destino VARCHAR(50), km INT)`.
