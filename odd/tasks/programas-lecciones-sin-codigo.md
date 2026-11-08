# programas-lecciones-sin-codigo
Objetivo: crear programas para las lecciones sin código (18 grafos, 20 concurrencia) y las secciones faltantes de la 15 (Map, HashMap por dentro, genéricos propios, Queue/Deque); luego un prompt para el agente que desarrolla las lecciones.
Branch: feat/lecciones-sin-codigo · Delivery: ask-on-risk · Runner: `javac -Xlint:-options -encoding UTF-8 -cp mysql-connector-j-8.1.0.jar -d out @sources` sobre todo `src`

## Specs
- S1: Fuente = lecciones `/Users/facundouferer/Devs/facundouferer/src/content/courses/java/{15,18,20}-*.es.md`. Cada programa sigue el orden de secciones y la terminología de su lección.
- S2: Convención del repo (ver `src/CursoJava/README.md`): `src/CursoJava/lNN_<slug>/EjNN<Tema>.java`, package `CursoJava.lNN_<slug>`; `ejNN_<tema>/` para varias clases. En l15 la numeración continúa desde Ej16.
- S3: Español neutro, sin voseo; cada programa con encabezado Javadoc (lección, objetivo, concepto) y `main` ejecutable de forma determinista.
- S4: Lección 27 (depuración y código limpio) se eliminó del curso (commit 524cca5 de facundouferer); NO se crean programas para ella.
- S5: Compilación completa de `src/` sin errores; los programas se ejecutan con `timeout 10`.
- S6: Entregable final: un prompt (`odd/prompts/conectar-lecciones-con-programas.md`) para el agente que desarrolla las lecciones, para que enlace/adapte las lecciones 15, 18 y 20 con los nuevos programas.

## Tasks
- [ ] T1 Escritor A: l18 grafos (carpeta nueva `l18_grafos_representacion_y_algoritmos`) — S1-S3,S5 — delegada (paralelo)
- [ ] T2 Escritor B: l20 concurrencia (carpeta nueva `l20_programacion_concurrente_hilos_y_pools`) — S1-S3,S5 — delegada (paralelo)
- [ ] T3 Escritor C: l15 Map, HashMap por dentro, genéricos propios, Queue/Deque (Ej16+) — S1-S3,S5 — delegada (paralelo)
- [ ] T4 Integración: compilación completa, README, commits — S5 — inline
- [ ] T5 Prompt para el agente de lecciones — S6 — inline

## Log
L1 (2026-11-08): "Resuleve esto: Lecciones del curso sin programas — No hay código en el repositorio para las lecciones 18 (grafos), 20 (concurrencia) y 27 (depuración, código limpio y refactorización). Tampoco hay programas para varias secciones puntuales: Map y funcionamiento interno de HashMap, genéricos propios y Queue/Deque en la lección 15. y una vez que hayas creado todos lps programas para esas lecciones, crea un prompt para decirle al agente que desarrolla las lecciones para que adapte las lecciones que no tenían código para que las conecte."
