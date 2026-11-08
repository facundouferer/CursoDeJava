# Mapping de src/ al esquema del curso (27 lecciones)

Generado para `odd/tasks/reorganizar-src-esquema-curso.md` (S1-S6). Solo clasificacion; ningun archivo fue movido.

Convenciones: paths repo-relativos. Dentro de cada fila la lista numerada es el orden de ensenanza sugerido dentro del grupo; la columna "Orden" es el orden del grupo dentro de la leccion. Lecciones sin archivos: 18, 20, 22 (no existe), 27.

## Leccion 01 - Conceptos basicos

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G01 Inicio-hola | 1. `src/CursoJava/Inicio/HolaMundo.java`<br>2. `src/CursoJava/Inicio/ProgramaDeEjemplo.java`<br>3. `src/CursoJava/Inicio/SalidaEstandar.java` | 1 | Hola mundo / salida estandar. |
| G02 Practica05 | 1. `src/Practica/Practica05.java` | 2 | Practica de escape de comillas en String; lo mas cercano a salida estandar. Candidata a quedar suelta. |

## Leccion 02 - Variables, tipos de datos y operadores

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G03 Inicio-tipos | 1. `src/CursoJava/Inicio/TiposDeDatos.java`<br>2. `src/CursoJava/Inicio/OperacionAritmetica.java`<br>3. `src/CursoJava/Inicio/Operadores.java`<br>4. `src/CursoJava/Inicio/operadoresTernarios.java` | 1 | Incluye operadoresTernarios (02, operadores) aunque 03 trata el ternario en Condicionales. |
| G04 Wrappers | 1. `src/CursoJava/Wrappers/WrappersBasico.java`<br>2. `src/CursoJava/Wrappers/AutoboxingUnboxing.java`<br>3. `src/CursoJava/Wrappers/ProbandoWrappers.java` | 2 | Sin leccion propia; asignado a 02 (primitivos vs referencia). Alternativa: 15 (genericos/autoboxing). |
| G05 Ej-conversion | 1. `src/CursoJava/EjerciciosResueltos/ej08Conversion.java` | 3 | Conversion de tipos -> 02 (casting). |

## Leccion 03 - Control de flujo y bucles

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G06 Condicionales | 1. `src/CursoJava/Condicionales/ej01OperadorTernario.java`<br>2. `src/CursoJava/Condicionales/ej02CondicionalIF.java`<br>3. `src/CursoJava/Condicionales/ej03IfElse.java`<br>4. `src/CursoJava/Condicionales/ej04ifAnidado.java`<br>5. `src/CursoJava/Condicionales/ej05CondicionalSwitch1.java`<br>6. `src/CursoJava/Condicionales/ordenar.java` | 1 | ej01OperadorTernario y ej04ifAnidado importan javax.swing (JOptionPane). Archivo `ordenar` en minuscula. |
| G07 EstructurasIterativas | 1. `src/CursoJava/EstructurasIterativas/ej01BucleFor1.java`<br>2. `src/CursoJava/EstructurasIterativas/ej02BucleFor2.java`<br>3. `src/CursoJava/EstructurasIterativas/ej03BucleWhile1.java`<br>4. `src/CursoJava/EstructurasIterativas/ej04BucleForAnidado.java`<br>5. `src/CursoJava/EstructurasIterativas/ej05BucleDoWhile1.java`<br>6. `src/CursoJava/EstructurasIterativas/ej06ForEach.java` | 2 |  |
| G08 EjResueltos-condicionales | 1. `src/CursoJava/EjerciciosResueltos/ej01PrecioBoleto.java`<br>2. `src/CursoJava/EjerciciosResueltos/ej02CalcularBoleto.java`<br>3. `src/CursoJava/EjerciciosResueltos/ej03Hospital.java`<br>4. `src/CursoJava/EjerciciosResueltos/ej04SueldoEmpleado.java`<br>5. `src/CursoJava/EjerciciosResueltos/ej05LosDosNumeros.java`<br>6. `src/CursoJava/EjerciciosResueltos/ej06TresDigitos.java`<br>7. `src/CursoJava/EjerciciosResueltos/ej07GrupoDeEstudiantes.java`<br>8. `src/CursoJava/EjerciciosResueltos/ej09CursantesUTN.java`<br>9. `src/CursoJava/EjerciciosResueltos/ej10Aprobacion.java`<br>10. `src/CursoJava/EjerciciosResueltos/ej11DescuentoPorCompras.java`<br>11. `src/CursoJava/EjerciciosResueltos/ej12DosHermanos.java`<br>12. `src/CursoJava/EjerciciosResueltos/ej13NumerosEnteros.java`<br>13. `src/CursoJava/EjerciciosResueltos/ej14Triangulos.java`<br>14. `src/CursoJava/EjerciciosResueltos/ej15NumerosRomanos1.java`<br>15. `src/CursoJava/EjerciciosResueltos/ej16Descuento.java`<br>16. `src/CursoJava/EjerciciosResueltos/ej17numerosMultiplicados.java`<br>17. `src/CursoJava/EjerciciosResueltos/ej18HorasExtras.java`<br>18. `src/CursoJava/EjerciciosResueltos/ej19CompaniaDeSeguros.java`<br>19. `src/CursoJava/EjerciciosResueltos/ej20PersonaDeALturaBaja.java`<br>20. `src/CursoJava/EjerciciosResueltos/ej21NumeroDeLaSemana.java`<br>21. `src/CursoJava/EjerciciosResueltos/ej22NumeroEntero.java` | 3 | Serie ej01..ej22 (sin ej08, que va a 02). Numeracion salta ej24 y ej48 (no existen). |
| G09 EjResueltos-bucles | 1. `src/CursoJava/EjerciciosResueltos/ej23SumaDigitos.java`<br>2. `src/CursoJava/EjerciciosResueltos/ej25TablaDeNumeros.java`<br>3. `src/CursoJava/EjerciciosResueltos/ej26NumerosPares.java`<br>4. `src/CursoJava/EjerciciosResueltos/ej27NumerosEnOrdenInverso.java`<br>5. `src/CursoJava/EjerciciosResueltos/ej28SumaPromedio.java`<br>6. `src/CursoJava/EjerciciosResueltos/ej29SumaDeNumero.java`<br>7. `src/CursoJava/EjerciciosResueltos/ej30NumeroPrimo.java`<br>8. `src/CursoJava/EjerciciosResueltos/ej31AlumnosUniversidad.java`<br>9. `src/CursoJava/EjerciciosResueltos/ej32CodigoEntrada.java`<br>10. `src/CursoJava/EjerciciosResueltos/ej33NumerosPares.java`<br>11. `src/CursoJava/EjerciciosResueltos/ej34NumerosImpares.java`<br>12. `src/CursoJava/EjerciciosResueltos/ej35OnceMil.java`<br>13. `src/CursoJava/EjerciciosResueltos/ej36SueldosDeEmpleados.java`<br>14. `src/CursoJava/EjerciciosResueltos/ej37NumerosPrimos.java` | 4 | Serie ej23..ej37; ej24 no existe. |

## Leccion 04 - Arrays y Strings

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G10 Secuencias-arreglos | 1. `src/CursoJava/Secuencias/CargarNombres.java`<br>2. `src/CursoJava/Secuencias/OrdenAlfabetico.java` | 1 | Tema "Secuencias" sin leccion; carga/ordenado de arreglos -> 04. |
| G11 ArreglosEstaticos | 1. `src/CursoJava/ArreglosEstaticos/DeclararYMostrar.java`<br>2. `src/CursoJava/ArreglosEstaticos/ListarElementos.java`<br>3. `src/CursoJava/ArreglosEstaticos/CrearArregloUsuario.java`<br>4. `src/CursoJava/ArreglosEstaticos/Arreglos01.java`<br>5. `src/CursoJava/ArreglosEstaticos/Arreglos02.java`<br>6. `src/CursoJava/ArreglosEstaticos/Arreglos03.java`<br>7. `src/CursoJava/ArreglosEstaticos/Arreglos04.java`<br>8. `src/CursoJava/ArreglosEstaticos/Arreglos05.java`<br>9. `src/CursoJava/ArreglosEstaticos/Arreglos06.java`<br>10. `src/CursoJava/ArreglosEstaticos/Arreglos07.java`<br>11. `src/CursoJava/ArreglosEstaticos/Arreglos08.java`<br>12. `src/CursoJava/ArreglosEstaticos/Arreglos09.java`<br>13. `src/CursoJava/ArreglosEstaticos/Arreglos10.java`<br>14. `src/CursoJava/ArreglosEstaticos/Arreglos11.java`<br>15. `src/CursoJava/ArreglosEstaticos/Arreglos12.java`<br>16. `src/CursoJava/ArreglosEstaticos/BuscarUnElementoYEliminar.java`<br>17. `src/CursoJava/ArreglosEstaticos/BuscarYEliminarImpares.java`<br>18. `src/CursoJava/ArreglosEstaticos/EliminarElementos.java` | 2 | Arreglos02.java NO es UTF-8 valido. Orden sugerido: basicos primero, luego Arreglos01..12, luego buscar/eliminar. |
| G12 ArreglosMultidimensionales | 1. `src/CursoJava/ArreglosMultidimensionales/ArregloBidimensional.java`<br>2. `src/CursoJava/ArreglosMultidimensionales/rellenarArregloConMath.java`<br>3. `src/CursoJava/ArreglosMultidimensionales/rellenarAregloBisConMath.java`<br>4. `src/CursoJava/ArreglosMultidimensionales/recorrerConForEach.java`<br>5. `src/CursoJava/ArreglosMultidimensionales/Estudiantes.java` | 3 | rellenarAregloBisConMath es importado por Practica/Unidad06/Abstraccion/Figura (dependencia cross-dir). Nombres de clase en minuscula (recorrerConForEach, rellenar*). |
| G13 EjResueltos-arrays | 1. `src/CursoJava/EjerciciosResueltos/ej38InversionDeUnArray.java`<br>2. `src/CursoJava/EjerciciosResueltos/ej39ConcatenacionDeArrays.java`<br>3. `src/CursoJava/EjerciciosResueltos/ej40EncontrarElElementoMaximo.java`<br>4. `src/CursoJava/EjerciciosResueltos/ej41FiltradoDeArray.java`<br>5. `src/CursoJava/EjerciciosResueltos/ej42RotacionDeArrays.java`<br>6. `src/CursoJava/EjerciciosResueltos/ej43SumaDeSubarrays.java`<br>7. `src/CursoJava/EjerciciosResueltos/ej44EliminacionDeDuplicados.java`<br>8. `src/CursoJava/EjerciciosResueltos/ej45MezclaDeArrays.java`<br>9. `src/CursoJava/EjerciciosResueltos/ej46ArrayDePares.java`<br>10. `src/CursoJava/EjerciciosResueltos/ej49ContarVocales.java` | 4 | Serie ej38..ej46 + ej49 (contar vocales/Strings). |
| G14 Practica-Unidad05-arrays | 1. `src/Practica/Unidad05/BorrarElementosCondicion.java`<br>2. `src/Practica/Unidad05/DeterminanteMatriz2x2.java`<br>3. `src/Practica/Unidad05/DiagonalPrincipalMatriz.java`<br>4. `src/Practica/Unidad05/EliminarDuplicados.java`<br>5. `src/Practica/Unidad05/EliminarElemento.java`<br>6. `src/Practica/Unidad05/EliminarElementosMayores.java`<br>7. `src/Practica/Unidad05/EliminarYReemplazarElemento.java`<br>8. `src/Practica/Unidad05/IntercalarArrays.java`<br>9. `src/Practica/Unidad05/InvertirArray.java`<br>10. `src/Practica/Unidad05/MatrizTranspuesta.java`<br>11. `src/Practica/Unidad05/MultiplicacionMatrices.java`<br>12. `src/Practica/Unidad05/RotacionMatriz.java`<br>13. `src/Practica/Unidad05/SumaElementosMatriz.java`<br>14. `src/Practica/Unidad05/SumaElementosParesMatriz.java` | 5 | Practica unidad 5: arrays y matrices. Ejercicios independientes. |
| G15 Practica-Unidad01-arrays-strings | 1. `src/Practica/Unidad01/Test02.java`<br>2. `src/Practica/Unidad01/Test05.java` | 6 | Test02 (arrays/Random), Test05 (String pool, ==). Unidad01 dividido entre 04, 05 y 12. |

## Leccion 05 - Metodos y funciones

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G16 Funciones | 1. `src/CursoJava/Funciones/Ejercicio01.java`<br>2. `src/CursoJava/Funciones/Ejercicio02.java`<br>3. `src/CursoJava/Funciones/Ejercicio03.java`<br>4. `src/CursoJava/Funciones/Ejercicio04.java`<br>5. `src/CursoJava/Funciones/Ejercicio05.java`<br>6. `src/CursoJava/Funciones/Ejercicio06.java`<br>7. `src/CursoJava/Funciones/Ejercicio07.java`<br>8. `src/CursoJava/Funciones/Ejercicio10.java`<br>9. `src/CursoJava/Funciones/MetodoArreglos.java` | 1 | Serie Ejercicio01..07, 10 y MetodoArreglos (faltan 08/09). |
| G17 Funciones-Matematicas | 1. `src/CursoJava/Funciones/Matematicas/OperadorMatematico.java`<br>2. `src/CursoJava/Funciones/Matematicas/Inicio.java` | 2 | Grupo: Inicio usa OperadorMatematico. |
| G18 Practica-Unidad05-metodos | 1. `src/Practica/Unidad05/ConfusionesDeParametros.java`<br>2. `src/Practica/Unidad05/ConfusionParametros.java`<br>3. `src/Practica/Unidad05/ConfusionVariables.java`<br>4. `src/Practica/Unidad05/FuncionAnidada.java`<br>5. `src/Practica/Unidad05/FuncionConfusa.java` | 3 | Paso de parametros / alcance de variables. |
| G19 Practica-Unidad06-MetodosEstaticos | 1. `src/Practica/Unidad06/MetodosEstaticos/Principal.java` | 4 | Tools + Principal en un archivo. |
| G20 Practica-Unidad06-Sobrecarga | 1. `src/Practica/Unidad06/SobrecargaDeMetodos/Calculadora.java` | 5 | Sobrecarga de metodos -> 05 (leccion 05 seccion 3). |
| G21 Recursion | 1. `src/CursoJava/Recursion/Factorial.java`<br>2. `src/CursoJava/Recursion/Fibonacci.java`<br>3. `src/CursoJava/Recursion/ContadorDeOvejas.java`<br>4. `src/CursoJava/Recursion/StackOverflowExample.java` | 6 | Recursion sin leccion propia -> 05 (seccion 5). |
| G22 Practica-Unidad01-recursion | 1. `src/Practica/Unidad01/Test01.java`<br>2. `src/Practica/Unidad01/Test03.java`<br>3. `src/Practica/Unidad01/Test04.java` | 7 | Test01/03/04 son recursion (suma, multiplicar). |

## Leccion 06 - Introduccion y pilares POO

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G23 POO-intro | 1. `src/CursoJava/POO/ConceptosFundamentales.java`<br>2. `src/CursoJava/POO/AbstraccionYEncapsulamiento.java` | 1 | Intro a pilares. |
| G24 Practica-Unidad06-Abstraccion | 1. `src/Practica/Unidad06/Abstraccion/Figura.java` | 2 | DEPENDENCIA CROSS-DIR: importa CursoJava.ArreglosMultidimensionales.rellenarAregloBisConMath. Resolver al mover (copiar helper o reemplazar). |

## Leccion 07 - Fundamentos POO: clases y objetos

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G25 POO-Ejercicios | 1. `src/CursoJava/POO/Ejercicios/Ejercicio01.java`<br>2. `src/CursoJava/POO/Ejercicios/Ejercicio02.java`<br>3. `src/CursoJava/POO/Ejercicios/Ejercicio03.java`<br>4. `src/CursoJava/POO/Ejercicios/Ejercicio04.java`<br>5. `src/CursoJava/POO/Ejercicios/Ejercicio05.java`<br>6. `src/CursoJava/POO/Ejercicios/Ejercicio07.java` | 1 | Ejercicio01..07 (falta 06); cada archivo con su clase interna. |
| G26 Practica01 | 1. `src/Practica/Practica01.java` | 2 | Menu + Calculadora + main en un archivo. |
| G27 Practica03 | 1. `src/Practica/Practica03.java` | 3 | Auto, Garage. |
| G28 Practica-Unidad06-ClasesyObjetos | 1. `src/Practica/Unidad06/ClasesyObjetos/Coche.java`<br>2. `src/Practica/Unidad06/ClasesyObjetos/Persona.java` | 4 | Persona incluye Main interno. |
| G29 Practica-Unidad06-UsoDeThis | 1. `src/Practica/Unidad06/UsoDeThis/Rectangulo.java` | 5 | this. |
| G30 Practica-Unidad06-Relaciones | 1. `src/Practica/Unidad06/RelacionesEntreClases/Cliente.java` | 6 | Cliente-Pedido (composicion/asociacion). |

## Leccion 08 - Constructores y encapsulamiento

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G31 ModificadoresDeAcceso | 1. `src/CursoJava/ModificadoresDeAcceso/EmpresaDeModificadores.java` | 1 | Sin leccion propia -> 08 (seccion 5 "Los cuatro modificadores de acceso"). |
| G32 Practica02 | 1. `src/Practica/Practica02.java` | 2 | Matematica con constructor. |
| G33 Practica-Unidad06-Encapsulamiento | 1. `src/Practica/Unidad06/Encapsulamiento/CuentaBancaria.java` | 3 | CuentaBancaria. |

## Leccion 09 - Arrays de objetos

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G34 PlantelDeportivo | 1. `src/CursoJava/ArraydeObjetos/PlantelDeportivo/Jugador.java`<br>2. `src/CursoJava/ArraydeObjetos/PlantelDeportivo/Plantel.java`<br>3. `src/CursoJava/ArraydeObjetos/PlantelDeportivo/MainPlantel.java` | 1 | Grupo Jugador+Plantel+MainPlantel. Array de Jugador. |
| G35 POO-Universidad | 1. `src/CursoJava/POO/Universidad.java` | 2 | DUPLICADO conceptual de Universidad (ver Anomalias). Usa Estudiante[] como atributo (09 sec. 9). |

## Leccion 10 - Herencia, polimorfismo y sobrecarga

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G36 POO-HerenciaYPolimorfismo | 1. `src/CursoJava/POO/HerenciaYPolimorfismo.java` | 1 | Animal/Perro/Gato; asignado a 10 aunque vive en POO. |
| G37 Herencia | 1. `src/CursoJava/Herencia/Fabrica.java`<br>2. `src/CursoJava/Herencia/Zoo.java`<br>3. `src/CursoJava/Herencia/Transporte.java` | 2 | Cada archivo con jerarquia propia (Empleado/Jefe, Animal, Vehiculo). Duplica nombres Empleado/Jefe con Polimorfismo. |
| G38 Polimorfismo | 1. `src/CursoJava/Polimorfismo/Polimorfismo.java` | 3 | Empleado/Jefe duplicado respecto de Herencia/Fabrica. |
| G39 Practica-Unidad06-Herencia | 1. `src/Practica/Unidad06/Herencia/Persona.java` | 4 | Persona+Empleado. |
| G40 Practica-Unidad06-Polimorfismo | 1. `src/Practica/Unidad06/Polimorfismo/Polimorfismo.java` | 5 | Animal/Perro/Gato duplicado de POO/HerenciaYPolimorfismo y Practica07Interface. |
| G41 Practica06 | 1. `src/Practica/Practica06.java` | 6 | Persona, Estudiantes, Materia: herencia/polimorfismo/sobrecarga. |

## Leccion 11 - Clases abstractas, interfaces y modelado (incl. namespaces/packages)

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G42 ClasesAbstractas-Figuras | 1. `src/CursoJava/ClasesAbstractas/FigurasAbstractas/Figura.java`<br>2. `src/CursoJava/ClasesAbstractas/FigurasAbstractas/Circulo.java`<br>3. `src/CursoJava/ClasesAbstractas/FigurasAbstractas/Rectangulo.java`<br>4. `src/CursoJava/ClasesAbstractas/FigurasAbstractas/Main.java` | 1 | Grupo. DUPLICADO: Interfaces/FigurasAbstractas (mismo dominio, interfaz vs abstracta); ambos paquetes tienen clase Main. |
| G43 ClasesAbstractas-Transportes | 1. `src/CursoJava/ClasesAbstractas/Transportes/Vehiculo.java`<br>2. `src/CursoJava/ClasesAbstractas/Transportes/Terrestre.java`<br>3. `src/CursoJava/ClasesAbstractas/Transportes/Acuatico.java`<br>4. `src/CursoJava/ClasesAbstractas/Transportes/Main.java` | 2 | Grupo con Main propio. |
| G44 ClasesAbstractas-Veterinaria | 1. `src/CursoJava/ClasesAbstractas/Veterinaria.java` | 3 | Mascota/Gato dentro de un archivo. |
| G45 Practica-ClaseAbstracta | 1. `src/Practica/ClaseAbstracta/Practica07.java` | 4 | Figura/Circulo/Rectangulo (otro duplicado de Figuras). |
| G46 Practica04 | 1. `src/Practica/Practica04.java` | 5 | FiguraGeometrica/Cuadrado/Triangulo (abstract/interface). |
| G47 Interfaces-Figuras | 1. `src/CursoJava/Interfaces/FigurasAbstractas/ParaMostrar.java`<br>2. `src/CursoJava/Interfaces/FigurasAbstractas/Figura.java`<br>3. `src/CursoJava/Interfaces/FigurasAbstractas/Circulo.java`<br>4. `src/CursoJava/Interfaces/FigurasAbstractas/Rectangulo.java`<br>5. `src/CursoJava/Interfaces/FigurasAbstractas/Main.java` | 6 | Grupo (ParaMostrar interfaz). Duplicado de ClasesAbstractas-Figuras. |
| G48 Interfaces-Empresa | 1. `src/CursoJava/Interfaces/Empresa/Persona.java`<br>2. `src/CursoJava/Interfaces/Empresa/Empleado.java`<br>3. `src/CursoJava/Interfaces/Empresa/ParaJefes.java`<br>4. `src/CursoJava/Interfaces/Empresa/Jefe.java`<br>5. `src/CursoJava/Interfaces/Empresa/Main.java` | 7 | Grupo Persona/Empleado/Jefe/ParaJefes/Main. |
| G49 Practica07-Interface | 1. `src/Practica/Practica07/Practica07Interface.java` | 8 | Animal/Perro/Gato con interfaz. Vive en Practica/Practica07/ (paquete Practica.Practica07). |
| G50 Practica-Universidad | 1. `src/Practica/Universidad/Persona.java`<br>2. `src/Practica/Universidad/Empleado.java`<br>3. `src/Practica/Universidad/Estudiante.java`<br>4. `src/Practica/Universidad/Docente.java`<br>5. `src/Practica/Universidad/NoDocente.java`<br>6. `src/Practica/Universidad/Jefe.java`<br>7. `src/Practica/Universidad/Informe.java`<br>8. `src/Practica/Universidad/Aula.java`<br>9. `src/Practica/Universidad/Principal.java` | 9 | Grupo de 9 archivos (herencia + interfaz Informe). Todos sin Main salvo Principal. |
| G51 InterfaceEscritorio | 1. `src/CursoJava/InterfaceEscritorio/ClasesAdaptadoras/EventosDeVentana.java`<br>2. `src/CursoJava/InterfaceEscritorio/ClasesAdaptadoras/MarcoEventoVentana.java`<br>3. `src/CursoJava/InterfaceEscritorio/ClasesAdaptadoras/EventoVentana01.java` | 10 | Sin leccion propia -> 11 (seccion "Clases adaptadoras"). Usa Swing/AWT; requiere entorno grafico. |
| G52 NameSpaces | 1. `src/CursoJava/NameSpaces/modelos/Persona.java`<br>2. `src/CursoJava/NameSpaces/modelos/Estudiante.java`<br>3. `src/CursoJava/NameSpaces/servicios/Registro.java`<br>4. `src/CursoJava/NameSpaces/AppPrincipal.java` | 11 | Namespaces -> 11 (seccion 5). Grupo modelos/servicios/AppPrincipal con imports internos. DUPLICADO de Practica/UTN. |
| G53 Practica-UTN | 1. `src/Practica/UTN/modelos/Persona.java`<br>2. `src/Practica/UTN/modelos/Estudiante.java`<br>3. `src/Practica/UTN/servicios/Administracion.java`<br>4. `src/Practica/UTN/Principal.java` | 12 | DUPLICADO de NameSpaces (mismo dominio modelos/servicios). Consolidar. |
| G54 PatronesDeDisenio | 1. `src/CursoJava/PatronesDeDisenio/PatronState.java`<br>2. `src/CursoJava/PatronesDeDisenio/PatronTemplateMethod.java` | 13 | State y Template Method (abstract/interface) -> 11; sin leccion de patrones. |

## Leccion 12 - Excepciones

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G55 Excepciones-basicas | 1. `src/CursoJava/Excepciones/CapturarErroresDeTEclado.java`<br>2. `src/CursoJava/Excepciones/CapturarErroresDeTecladoBucle.java`<br>3. `src/CursoJava/Excepciones/DivisionPorCero.java`<br>4. `src/CursoJava/Excepciones/Ej01DividirPorZero.java`<br>5. `src/CursoJava/Excepciones/EjemploFinally.java`<br>6. `src/CursoJava/Excepciones/excepciones01RuntimeException.java`<br>7. `src/CursoJava/Excepciones/excepciones02RuntimeException.java`<br>8. `src/CursoJava/Excepciones/excepciones03RuntimeException.java`<br>9. `src/CursoJava/Excepciones/excepciones04IOExceptions.java`<br>10. `src/CursoJava/Excepciones/excepciones05Throw.java`<br>11. `src/CursoJava/Excepciones/excepciones06ThrowObligatorio.java`<br>12. `src/CursoJava/Excepciones/excepciones07Throws.java`<br>13. `src/CursoJava/Excepciones/excepciones08ExcepcionesPropias.java`<br>14. `src/CursoJava/Excepciones/excepciones09CapturarVariasExcepciones.java`<br>15. `src/CursoJava/Excepciones/excepciones09ExcepcionesPropias.java`<br>16. `src/CursoJava/Excepciones/excepciones10Finally.java`<br>17. `src/CursoJava/Excepciones/ManejoExcepciones.java` | 1 | Serie excepcionesNN + utilidades. excepciones04IOExceptions usa javax.imageio/java.awt. Ensenar por numero: excepciones01..10. |
| G56 Excepciones-BaseTres | 1. `src/CursoJava/Excepciones/BaseTres.java` | 2 | Excepciones propias + logica en un archivo. |
| G57 Excepciones-RegistroUsuario | 1. `src/CursoJava/Excepciones/RegistroUsuario.java` | 3 | MenorDeEdadException + registro. |
| G58 Excepciones-Microprocesadores | 1. `src/CursoJava/Excepciones/Microprocesadores/Micro.java`<br>2. `src/CursoJava/Excepciones/Microprocesadores/AdminMicro.java` | 4 | Grupo Micro + AdminMicro. |
| G59 Excepciones-ProductosDeLimpieza | 1. `src/CursoJava/Excepciones/ProductosDeLimpieza/Producto.java`<br>2. `src/CursoJava/Excepciones/ProductosDeLimpieza/AdminDeProductos.java` | 5 | DUPLICADO de EstructurasDinamicas/ProductosDeLimpieza (mismos nombres Producto/AdminDeProductos; esta version tiene excepciones). |
| G60 Practica-Unidad01-Main | 1. `src/Practica/Unidad01/Main.java` | 6 | Main provoca IndexOutOfBounds en LinkedList -> excepciones. |

## Leccion 13 - TAD listas estaticas y dinamicas

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G61 Nodo | 1. `src/CursoJava/Nodo/NodoSimple.java` | 1 | Un solo archivo NodoSimple; no lo usa nadie (TAD define su propio Node). Candidato a descartar o a unir con 13/TAD. |
| G62 TAD-listas | 1. `src/CursoJava/TAD/ListaEstatica.java`<br>2. `src/CursoJava/TAD/SinglyLinkedList.java`<br>3. `src/CursoJava/TAD/DoublyLinkedList.java`<br>4. `src/CursoJava/TAD/CircularList.java`<br>5. `src/CursoJava/TAD/DemoListas.java`<br>6. `src/CursoJava/TAD/AdministradorDePersonas.java` | 2 | Grupo: ListaEstatica, SinglyLinkedList, Doubly, Circular (cada una con Node anidado), DemoListas y AdministradorDePersonas los usan. DUPLICADO con Practica/TAD. |
| G63 Practica-TAD | 1. `src/Practica/TAD/ListaEstatica.java`<br>2. `src/Practica/TAD/SinglyLinkedList.java` | 3 | DUPLICADO de ListaEstatica y SinglyLinkedList en CursoJava/TAD (paquete distinto, Practica.TAD). Consolidar en una sola version. |

## Leccion 14 - TAD pilas y colas

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G64 Pila | 1. `src/CursoJava/Pila/PilasBasicas.java`<br>2. `src/CursoJava/Pila/PilaDinamica.java` | 1 | PilasBasicas + PilaDinamica (ArrayList). |
| G65 Cola | 1. `src/CursoJava/Cola/ColaDinamica.java` | 2 | ColaDinamica (ArrayList), gemela de PilaDinamica. |
| G66 EstructurasDinamicas-Pilas | 1. `src/CursoJava/EstructurasDinamicas/Pilas/PilasEjemplo.java` | 3 | java.util.Stack. |
| G67 EstructurasDinamicas-Colas | 1. `src/CursoJava/EstructurasDinamicas/Colas/ColasEjemplo.java` | 4 | java.util.Queue/LinkedList. |

## Leccion 15 - Java Collections Framework y genericos

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G68 CollectionsFramework | 1. `src/CursoJava/CollectionsFramework/EjemploList.java`<br>2. `src/CursoJava/CollectionsFramework/EjemploSet.java`<br>3. `src/CursoJava/CollectionsFramework/EjemploLinkedHashSet.java`<br>4. `src/CursoJava/CollectionsFramework/EjemploTreeSet.java`<br>5. `src/CursoJava/CollectionsFramework/EjemploSetPersonas.java` | 1 | Set/List/TreeSet; EjemploSetPersonas define Persona. |
| G69 Colecciones-clasicas | 1. `src/CursoJava/Colecciones/ColeccionesList.java`<br>2. `src/CursoJava/Colecciones/ColeccionLinkedList.java`<br>3. `src/CursoJava/Colecciones/ColeccionesQueue.java`<br>4. `src/CursoJava/Colecciones/ColeccionesSet.java`<br>5. `src/CursoJava/Colecciones/ColeccionesTreeSet.java` | 2 | 5 archivos casi identicos (~178-200 lineas, cada uno con su Empleado*). Consolidar. |
| G70 Colecciones-ejemplos | 1. `src/CursoJava/Colecciones/EjemploColeccion.java`<br>2. `src/CursoJava/Colecciones/EjemploPersonas.java`<br>3. `src/CursoJava/Colecciones/EjemploForEach.java`<br>4. `src/CursoJava/Colecciones/EjemploMap.java`<br>5. `src/CursoJava/Colecciones/EjemploAllMatch.java`<br>6. `src/CursoJava/Colecciones/EjemploAnyMatch.java` | 3 | Streams/forEach/map/allMatch/anyMatch sobre colecciones. |
| G71 EstructurasDinamicas-Listas-GestionArrayList | 1. `src/CursoJava/EstructurasDinamicas/Listas/GestionArrayList.java` | 4 | ArrayList + Scanner. |
| G72 EstructurasDinamicas-Universidad | 1. `src/CursoJava/EstructurasDinamicas/Listas/Universidad.java`<br>2. `src/CursoJava/EstructurasDinamicas/Listas/Universidad2.java` | 5 | Universidad y Universidad2 (dos variantes en/ingles de lo mismo: Persona/Estudiante/Profesor vs People/Studient/Teacher). DUPLICADOS. Consolidar. |
| G73 EstructurasDinamicas-Productos | 1. `src/CursoJava/EstructurasDinamicas/ProductosDeLimpieza/Producto.java`<br>2. `src/CursoJava/EstructurasDinamicas/ProductosDeLimpieza/AdminDeProductos.java` | 6 | DUPLICADO de Excepciones/ProductosDeLimpieza (version sin excepciones, anterior). |
| G74 Arreglos-OperacionesBasicas | 1. `src/CursoJava/Arreglos/OperacionesBasicas.java` | 7 | Nombre dice Arreglos pero usa ArrayList<Persona> con Directorio/Menu; asignado a 15. Alternativa 09. |
| G75 Practica-Unidad05-ArrayList | 1. `src/Practica/Unidad05/AgregarElementos.java`<br>2. `src/Practica/Unidad05/ListaLibros.java`<br>3. `src/Practica/Unidad05/Automotores.java`<br>4. `src/Practica/Unidad05/Biblioteca.java` | 8 | Ejercicios con ArrayList (aunque viven en Unidad05). |
| G76 Secuencias-UnionListas | 1. `src/CursoJava/Secuencias/UnionListas.java` | 9 | Usa HashSet (union de listas). |
| G77 ExpresionesLambdaColecciones | 1. `src/CursoJava/ExpresionesLambdaColecciones/ForEachNumeros.java`<br>2. `src/CursoJava/ExpresionesLambdaColecciones/FilterNumeros.java`<br>3. `src/CursoJava/ExpresionesLambdaColecciones/MapNumeros.java`<br>4. `src/CursoJava/ExpresionesLambdaColecciones/MapPersonas.java`<br>5. `src/CursoJava/ExpresionesLambdaColecciones/MapToIntNumeros.java`<br>6. `src/CursoJava/ExpresionesLambdaColecciones/MapToDoubleNumeros.java`<br>7. `src/CursoJava/ExpresionesLambdaColecciones/AllMatchNumeros.java`<br>8. `src/CursoJava/ExpresionesLambdaColecciones/AnyMatchNumeros.java` | 10 | Streams filter/map/forEach/allMatch/anyMatch; sin leccion de streams -> 15. |

## Leccion 16 - Iteradores, ordenamiento, equals/hashCode

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G78 ColeccionesIteradores-Colecciones | 1. `src/CursoJava/Colecciones/ColeccionesIteradores.java` | 1 | Iterator sobre Empleado (archivo suelto en Colecciones/). |
| G79 ColeccionesIteradores-Banco | 1. `src/CursoJava/ColeccionesIteradores/Banco.java` | 2 | DUPLICADO conceptual de Banco (tres versiones: Iteradores, Equals, HashCode). |
| G80 ColeccionesEquals-Banco | 1. `src/CursoJava/ColeccionesEquals/Banco.java` | 3 | Banco+Cliente en un archivo. Version equals. |
| G81 ColeccionesHashCode-Banco | 1. `src/CursoJava/ColeccionesHashCode/Cliente.java`<br>2. `src/CursoJava/ColeccionesHashCode/Banco.java` | 4 | Grupo Banco+Cliente (hashCode). Version distinta de las otras Banco. |
| G82 ColeccionesHashCode-PersonasNoRepetidas | 1. `src/CursoJava/ColeccionesHashCode/PersonasNoRepetidas.java` | 5 | UNTRACKED en git (archivo nuevo). |
| G83 ColeccionesHashCode-SuperMercado | 1. `src/CursoJava/ColeccionesHashCode/SuperMercado.java` | 6 | HashSet/HashMap con Producto. |
| G84 interfazFuncional | 1. `src/CursoJava/interfazFuncional/Principal.java` | 7 | Sin leccion de lambdas -> 16 (Comparator/lambdas). Directorio en minuscula. |
| G85 ExpresionesLambda | 1. `src/CursoJava/ExpresionesLambda/ExpresionesLambdaSinArgumentos.java`<br>2. `src/CursoJava/ExpresionesLambda/Operaciones.java`<br>3. `src/CursoJava/ExpresionesLambda/GestionPersonas.java` | 8 | Lambdas; Runnable en ExpresionesLambdaSinArgumentos. Operaciones define BiFunction propio. |
| G86 MetodosReferencia | 1. `src/MetodosReferencia/EjemploMetodoEstatico.java`<br>2. `src/MetodosReferencia/EjemploMetodoInstancia.java`<br>3. `src/MetodosReferencia/EjemploMetodoArbitrario.java`<br>4. `src/MetodosReferencia/EjemploConstructorRef.java` | 9 | Fuera de src/CursoJava, paquete MetodosReferencia; sin leccion -> 16. |

## Leccion 17 - Arboles binarios y busqueda

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G87 ArbolBinario | 1. `src/CursoJava/Arbol/ArbolBinario.java` | 1 | Contiene Nodo propio (nombre colisiona en espiritu con Nodo/NodoSimple). |

## Leccion 19 - Archivos, persistencia y JAR

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G88 ArchivosYDirectorios | 1. `src/CursoJava/ArchivosYDirectorios/AccesoRutas.java`<br>2. `src/CursoJava/ArchivosYDirectorios/CrearDirectorio.java`<br>3. `src/CursoJava/ArchivosYDirectorios/CrearArchivo.java`<br>4. `src/CursoJava/ArchivosYDirectorios/EscribirArchivo.java`<br>5. `src/CursoJava/ArchivosYDirectorios/LeerArchivo.java`<br>6. `src/CursoJava/ArchivosYDirectorios/LeerArchivoCaracterPorCaracter.java`<br>7. `src/CursoJava/ArchivosYDirectorios/ListarArchivos.java`<br>8. `src/CursoJava/ArchivosYDirectorios/ListadoRecursivoDeArchivos.java`<br>9. `src/CursoJava/ArchivosYDirectorios/CrearDirectoriosPorUsuario.java`<br>10. `src/CursoJava/ArchivosYDirectorios/EliminarArchivoDirectorio.java` | 1 | Java NIO/IO basico. Serie de ejercicios independientes. |
| G89 Ej-InvertirLineasArchivo | 1. `src/CursoJava/EjerciciosResueltos/ej47InvertirLineasArchivo.java` | 2 | Archivos -> 19. |
| G90 Serializacion-Simple | 1. `src/CursoJava/Serializacion/SerializacionSimple/Personita.java`<br>2. `src/CursoJava/Serializacion/SerializacionSimple/Escritura.java`<br>3. `src/CursoJava/Serializacion/SerializacionSimple/Lectura.java` | 3 | Personita+Escritura+Lectura (grupo). |
| G91 Serializacion-Productos | 1. `src/CursoJava/Serializacion/ProductosSerializables/Producto.java`<br>2. `src/CursoJava/Serializacion/ProductosSerializables/Inventario.java`<br>3. `src/CursoJava/Serializacion/ProductosSerializables/Main.java` | 4 | Grupo Producto+Inventario+Main. |
| G92 Serializacion-Universidad | 1. `src/CursoJava/Serializacion/Universidad.java` | 5 | Universidad+Serializador+Curso. DUPLICADO de Universidad. |

## Leccion 21 - JDBC

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G93 BasesDeDatos-JDBC | 1. `src/CursoJava/BasesDeDatos/BaseDatos.java`<br>2. `src/CursoJava/BasesDeDatos/BaseDeDatos2.java`<br>3. `src/CursoJava/BasesDeDatos/Estudiantes.java`<br>4. `src/CursoJava/BasesDeDatos/ConsultaSeleccionarTodos.java`<br>5. `src/CursoJava/BasesDeDatos/ConsultaSeleccionarPorNombre.java`<br>6. `src/CursoJava/BasesDeDatos/ConsultaSeleccionarMayoresDeEdad.java`<br>7. `src/CursoJava/BasesDeDatos/ConsultaEditarEstudiante.java`<br>8. `src/CursoJava/BasesDeDatos/ConsultaEliminarEstudiante.java`<br>9. `src/CursoJava/BasesDeDatos/Estudiantes2.java`<br>10. `src/CursoJava/BasesDeDatos/Tienda/TiendaAdmin.java` | 1 | DEPENDE de mysql-connector (java.sql) y de empresa.sql/BD local. TiendaAdmin importa CursoJava.BasesDeDatos.BaseDatos (cross-dir). Estudiantes2 (300 lineas). |
| G94 BasesDeDatos-Empresa | 1. `src/CursoJava/BasesDeDatos/Empresa/Empresa.java`<br>2. `src/CursoJava/BasesDeDatos/Empresa/NuevoEmpleado.java` | 2 | JDBC; usa empresa.sql (src/CursoJava/BasesDeDatos/Empresa/empresa.sql, no .java). |
| G95 BasesDeDatos-Pizseria | 1. `src/CursoJava/BasesDeDatos/Pizseria/DatosDB.java`<br>2. `src/CursoJava/BasesDeDatos/Pizseria/Pizseria.java` | 3 | JDBC. Typo en nombre (Pizseria). DatosDB sin main. |

## Leccion 23 - Algoritmia, verificacion y complejidad

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G96 Ordenamiento | 1. `src/CursoJava/Ordenamiento/BubbleSort.java`<br>2. `src/CursoJava/Ordenamiento/MergeSort.java`<br>3. `src/CursoJava/Ordenamiento/QuickSort.java` | 1 | Sorting -> 23 (sin leccion propia). |

## Leccion 26 - Arboles n-arios

| Grupo | Paths (en orden) | Orden | Nota |
|---|---|---|---|
| G97 ArbolNario | 1. `src/CursoJava/Arbol/ArbolNario.java`<br>2. `src/CursoJava/Arbol/ArbolNarioOperaciones.java` | 1 | ArbolNario y ArbolNarioOperaciones definen su propio nodo cada uno (NodoNarioArbol, NodoNario). |

## KEEP

Se quedan donde estan (fuera de la reorganizacion). Sin filas por archivo.

| Grupo | Directorio | Archivos .java |
|---|---|---|
| K01 | `src/exam/ExamenFinal/` | 1 |
| K02 | `src/exam/Parcial2025/` | 29 |
| K03 | `src/exam/Parcial2ProgII/` | 4 |
| K04 | `src/ExamenesFinales/` | 8 |
| K05 | `src/Proyectos/ArreglosDeObjetos/` | 8 |
| K06 | `src/Proyectos/Personas/` | 4 |

Total KEEP: 54

## Load estimate

| Leccion | Grupos | Archivos | Lineas (aprox, wc -l) |
|---|---|---|---|
| 01 | 2 | 4 | 61 |
| 02 | 3 | 8 | 201 |
| 03 | 4 | 47 | 1268 |
| 04 | 6 | 51 | 1929 |
| 05 | 7 | 25 | 610 |
| 06 | 2 | 3 | 146 |
| 07 | 6 | 12 | 850 |
| 08 | 3 | 3 | 114 |
| 09 | 2 | 4 | 323 |
| 10 | 6 | 8 | 605 |
| 11 | 13 | 44 | 1190 |
| 12 | 6 | 24 | 1044 |
| 13 | 3 | 9 | 533 |
| 14 | 4 | 5 | 414 |
| 15 | 10 | 35 | 2667 |
| 16 | 9 | 15 | 1063 |
| 17 | 1 | 1 | 69 |
| 19 | 5 | 18 | 618 |
| 21 | 3 | 14 | 759 |
| 23 | 1 | 3 | 227 |
| 26 | 1 | 2 | 169 |
| **Total reorganizable** | 97 | 335 | 14860 |

Lecciones sin archivos: 18 (grafos), 20 (concurrencia), 27 (depuracion/refactor). Contenido nuevo a futuro.

## Anomalies

### Verificacion de conteo

- Filas asignadas (archivos en tablas): 335 (CursoJava 269 + Practica 62 + MetodosReferencia 4 = 335)
- KEEP: 54
- Total: 389 (esperado 389). Archivos sin asignar: ninguno. Ademas existe 1 archivo no-java: `src/CursoJava/BasesDeDatos/Empresa/empresa.sql` (390 en total en src/), va con G de BasesDeDatos-Empresa.

### Paquetes

- Todos los 335 archivos tienen `package` igual a su directorio (CursoJava.X, Practica.X, MetodosReferencia). Sin desajustes. Oddities: directorios en minuscula (`interfazFuncional`), typo `Pizseria`, `src/Practica/Practica07/` vs `ClaseAbstracta/Practica07.java`; `Practica/Unidad06/ClasesyObjetos/Persona.java` contiene su propio `Main`.
- Al mover habra que reescribir `package` e `import` (ver dependencias).

### Codificacion

- No UTF-8: `src/CursoJava/ArreglosEstaticos/Arreglos02.java` (unico). Los 54 de KEEP son UTF-8.

### Dependencias cross-directorio

- `src/Practica/Unidad06/Abstraccion/Figura.java` -> `CursoJava.ArreglosMultidimensionales.rellenarAregloBisConMath` (Practica depende de CursoJava; leccion 06 -> 04).
- `src/CursoJava/BasesDeDatos/Tienda/TiendaAdmin.java` -> `CursoJava.BasesDeDatos.BaseDatos` (mismo grupo G de JDBC).
- Imports internos al grupo (ok si se mueven juntos): NameSpaces (modelos/servicios/AppPrincipal), Practica/UTN, Proyectos/* (KEEP).
- MySQL/JDBC (java.sql, mysql-connector): 14 archivos en `BasesDeDatos/*` (lec. 21). KEEP incluye 3 archivos con java.sql (ExamenesFinales/Proyectos/exam).
- Swing/AWT: `InterfaceEscritorio/*` (3), `Condicionales/ej01OperadorTernario`, `Condicionales/ej04ifAnidado`, `Excepciones/excepciones04IOExceptions`.
- Concurrencia: solo `ExpresionesLambda/ExpresionesLambdaSinArgumentos` usa Runnable; no hay material real para 20.

### Duplicados (propuesta de consolidacion)

| Nombre/proposito | Ubicaciones | Propuesta |
|---|---|---|
| ListaEstatica, SinglyLinkedList | `src/CursoJava/TAD/`, `src/Practica/TAD/` | Conservar CursoJava/TAD (completo: Doubly, Circular, Demo); mover Practica/TAD como ejercicio o descartar. |
| Banco (3 versiones) | `ColeccionesIteradores/`, `ColeccionesEquals/`, `ColeccionesHashCode/` | Mantener las tres como progresion en 16 (iterator -> equals -> hashCode) o fusionar en un unico Banco. |
| Universidad | `POO/`, `EstructurasDinamicas/Listas/` (Universidad, Universidad2), `Serializacion/`, `Practica/Universidad/` | Consolidar Universidad2 (clon ingles) en Universidad; el resto son variantes por tema; conservar una por leccion (09, 15, 19, 11). |
| ProductosDeLimpieza (Producto, AdminDeProductos) | `EstructurasDinamicas/ProductosDeLimpieza/`, `Excepciones/ProductosDeLimpieza/` | Excepciones es superset (100 vs 55 lineas); conservar como 12 y dejar la otra como paso previo en 15 o descartar. |
| Figuras (Figura/Circulo/Rectangulo/Main) | `ClasesAbstractas/FigurasAbstractas/`, `Interfaces/FigurasAbstractas/`, `Practica/ClaseAbstracta/`, `Practica/Practica04` | Mantener abstracta vs interfaz como par comparativo en 11; Practica copias -> ejercicio. |
| NameSpaces vs Practica/UTN (Persona/Estudiante/Registro|Administracion) | `NameSpaces/`, `Practica/UTN/` | Consolidar en uno (NameSpaces); UTN es la misma estructura. |
| Animal/Perro/Gato | `POO/HerenciaYPolimorfismo`, `Practica/Unidad06/Polimorfismo`, `Practica/Practica07/Practica07Interface` | Conservar uno en 10 y otro (interfaz) en 11. |
| Empleado/Jefe | `Herencia/Fabrica`, `Polimorfismo/`, `Interfaces/Empresa/`, `Practica/Universidad/` | Variantes por tema; ok si se mantienen separadas por leccion. |
| Pila/Cola dinamica | `Pila/PilaDinamica`, `Cola/ColaDinamica` (gemelos ArrayList) | Ok juntos en 14; vs `EstructurasDinamicas/Pilas|Colas` (java.util). |
| Colecciones* | `Colecciones/Colecciones{List,LinkedList,Queue,Set,TreeSet}` casi identicos | Consolidar en 1-2 archivos o separar el Empleado compartido. |
| Nodo | `Nodo/NodoSimple`, `TAD/*Node`, `Arbol/*Nodo*` | NodoSimple sin uso: descartar o integrar en 13. |

### Otros

- `src/CursoJava/ColeccionesHashCode/PersonasNoRepetidas.java` esta untracked en git.
- `src/Practica/Unidad01` se reparte en lecciones 04, 05 y 12; `EjerciciosResueltos` en 02, 03, 04 y 19 (ej08, ej01-37, ej38-46/49, ej47).
- Sin material para lecciones 18, 20, 27; leccion 22/24/25 no existen en el curso.
- Tabla Grupo<->origen: ver columnas; ids G01..G97.
