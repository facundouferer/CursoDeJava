# Prompt: conectar las lecciones 15, 18 y 20 con sus programas

Copiar el bloque siguiente y dárselo al agente que desarrolla las lecciones (repositorio `facundouferer`).

---

Trabajás en el repositorio `facundouferer`, en `src/content/courses/java/`. El repositorio de programas `https://github.com/facundouferer/CursoDeJava` (rama `main`, carpeta `src/CursoJava/`) incorporó programas ejecutables para tres lecciones que antes no tenían código. Tu tarea es adaptar esas lecciones, en español (`*.es.md`) y en inglés (`*.en.md`), para que se conecten con los programas nuevos. Mantené el estilo, el voseo y la estructura de las lecciones ya existentes. No cambies el contenido conceptual salvo en los puntos indicados en "Correcciones obligatorias".

## 1. Antes de editar

1. Leé la lección 17 (`17-tad-arboles-binarios-y-busqueda.*.md`), sección "Profundizá con código real", como modelo del enlace y del párrafo descriptivo.
2. Abrí cada carpeta de programas (listada abajo) y leé el encabezado Javadoc de cada archivo (lección, objetivo, concepto). Describí solo lo que realmente hace cada programa.
3. No inventes nombres de archivo: usá exactamente los que figuran en este prompt y verificalos en el repositorio de programas.

## 2. Qué hacer en cada lección

En cada lección:

- Agregá o ampliá la sección final `## Profundizá con código real` con el enlace a la carpeta y un párrafo que nombre los programas más relevantes (`EjNN...`).
- Dentro del cuerpo, en la sección del concepto correspondiente, agregá una línea breve del tipo "Programa de práctica: `EjNN...`" para que el estudiante ejecute el ejemplo justo después de leer el concepto. No dupliques el código de la lección; el programa lo complementa.
- Si la lección tiene un ejercicio guiado, indicá qué programa es la solución de referencia y recomendá intentarlo antes de abrirla.
- Para la versión en inglés, traducí los textos nuevos con el mismo criterio que el resto de la lección.

### Lección 15 — Java Collections Framework y genéricos

Carpeta: `l15_java_collections_framework_y_genericos`. Ya existía la sección "Profundizá con código real" (menciona solo `List`, `Set`, `forEach`, `filter` y `map`). Ampliala con los programas nuevos y relacioná cada uno con su sección:

| Sección de la lección | Programa |
|---|---|
| 3. `Map` — asociar una clave a un valor | `Ej16MapBasico`, `Ej17RecorridoYComparacionDeMaps` |
| 3. `Queue` / `Deque` — orden de procesamiento | `Ej19QueueYDeque` |
| 4. Cómo funciona un `HashMap` por dentro | `Ej18HashMapPorDentro` |
| 5. Escribir tus propios genéricos | `Ej20ClaseGenericaPropia`, `Ej21MetodosGenericosYLimites` |
| 5. Type erasure: la letra chica | `Ej22TypeErasure` |
| 8. Desafío: contador de frecuencias de palabras | `Ej23ContadorDeFrecuenciasDePalabras` |

Correcciones obligatorias:

- En la sección 4 el diagrama indica `"gato".hashCode() = 3181970` y bucket 2. El valor real es `3165397`. Además `HashMap` calcula el bucket con `(h ^ (h >>> 16)) & (n - 1)`; con capacidad 16, `"gato"` cae en el bucket 5. Corregí el número y, si el diagrama o el texto omiten la mezcla de bits `h ^ (h >>> 16)`, agregala con una frase. Verificá la ejecución de `Ej18HashMapPorDentro` antes de escribir cifras.
- En el desafío (sección 8), el programa `Ej23` ordena la lista de palabras de 10 letras para que la salida sea determinista. Si la lección muestra esa salida sin orden, aclaralo.

### Lección 18 — Grafos: representación y algoritmos

Carpeta nueva: `l18_grafos_representacion_y_algoritmos`. La lección no tiene sección de código real; agregala al final, antes o después de "Para llevarte" según el patrón de las demás lecciones.

| Sección de la lección | Programa |
|---|---|
| 1. Vocabulario | `Ej01VocabularioDeGrafos` |
| 2. Las dos formas de representarlo | `Ej02MatrizDeAdyacencia`, `Ej03ListaDeAdyacencia` |
| 3. BFS y DFS | `Ej04RecorridoBFS`, `Ej05RecorridoDFS` (incluye la versión iterativa con pila explícita) |
| 4. Dijkstra | `Ej06DijkstraConPriorityQueue` |
| 6. Ejercicio guiado: grados de separación | `Ej07GradosDeSeparacionRedSocial` |
| 8. Floyd–Warshall | `Ej08FloydWarshall` (incluye detección de ciclos negativos y validación de entrada) |

Notas:

- Los programas reproducen los grafos y las salidas de las figuras de la lección: BFS desde A visita `A · B · D · C · E · F`; DFS visita `A · B · C · E · D · F`; Dijkstra da B=3, C=2, D=8, E=11.
- Si algún bloque de código de la lección usa nombres distintos a los del programa (por ejemplo, los métodos genéricos `bfs`, `dfs`, `dijkstra` viven dentro de clases anidadas `Grafo` / `GrafoPonderado` en los programas), aclará esa diferencia en una nota, sin reescribir la lección.
- Revisá que la numeración de secciones de la lección sea consecutiva (hoy salta de la 6 a la 8) y corregila si corresponde.

### Lección 20 — Programación concurrente: hilos y pools

Carpeta nueva: `l20_programacion_concurrente_hilos_y_pools`. Agregá la sección final de código real.

| Sección de la lección | Programa |
|---|---|
| 2. Creación y ciclo de vida de hilos | `Ej01ThreadConRunnable`, `Ej02CallableYFuture`, `Ej03CicloDeVidaDelHilo` |
| 3. Condiciones de carrera y sincronización | `Ej04CondicionDeCarrera` (el resultado varía entre ejecuciones; ejecutarlo varias veces es parte de la práctica), `Ej05ContadorSynchronized`, `Ej06ContadorAtomico`, `Ej07ContadorReentrantLock` |
| 4. Pools con `ExecutorService` | `Ej08ExecutorServiceYFuture`, `Ej09TiposDePools` |
| 5. Virtual Threads (Java 21+) | `Ej10HilosVirtuales` (requiere JDK 21 o superior) |
| 6. Ejercicio guiado: descargas concurrentes | `Ej11DescargadorConcurrente` |
| 7. `wait()` / `notify()`, buffer acotado | `Ej12BufferAcotado` |
| 7. Deadlocks y prevención | `Ej13DeadlockMinimo`, `Ej14PrevencionDeDeadlock` |

Notas:

- `Ej11` usa tiempos de 100–300 ms para ejecutarse rápido; la constante `ESCALA` en 10 reproduce los 1–3 s de la lección. Mencionalo en la sección del ejercicio.
- `Ej13` usa hilos daemon y `ThreadMXBean.findDeadlockedThreads()` en lugar de `jstack` para detectar el deadlock sin colgar el proceso. Relacionalo con la subsección "Diagnóstico".
- `ReentrantLock` no aparece como solución del contador en la lección; `Ej07` lo agrega. Si querés mantener la coherencia, sumá una mención breve en "Soluciones de sincronización en Java".

## 3. Lecciones que NO se tocan

- La lección 27 (depuración, código limpio y refactorización) y la 22 (testing) fueron eliminadas del curso. No las recrees y no enlaces programas para ellas.
- No modifiques las lecciones 1 a 14, 16, 17, 19, 21, 23 ni 26 en esta tarea.

## 4. Verificación antes de terminar

1. Cada enlace apunta a una carpeta que existe en `https://github.com/facundouferer/CursoDeJava/tree/main/src/CursoJava/` y cada `EjNN...` mencionado existe con ese nombre exacto.
2. Las versiones `es` y `en` de cada lección tienen las mismas secciones nuevas.
3. El sitio compila (`npm run build` o el comando que use el repositorio) sin errores de contenido.
4. Hacé un commit convencional por lección (por ejemplo `docs(java): link lesson 18 to graph programs`), sin atribución de IA.
5. Informá qué cifras o textos corregiste en la lección 15 y cualquier diferencia entre la lección y el código que hayas dejado como nota.

---
