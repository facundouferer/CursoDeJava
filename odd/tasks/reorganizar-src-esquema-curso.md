# reorganizar-src-esquema-curso
Objetivo: reordenar y reescribir los programas de `src/` para que sigan el esquema pedagógico del curso Java (27 lecciones).
Branch: refactor/src-esquema-curso · Delivery: ask-on-risk · Runner: `javac -encoding UTF-8 -cp mysql-connector-j-8.1.0.jar` (compilación completa, como CI)

## Specs
- S1: Fuente pedagógica = `/Users/facundouferer/Devs/facundouferer/src/content/courses/java/*.es.md` (+ `index.md` roadmap) y `src/content/activities/java/`. Nota: el usuario dijo `cursos/java/`; esa ruta no existe, la real es la anterior.
- S2: Cada programa de `src` se clasifica en una lección (01..27) y se reubica en `src/CursoJava/lNN_<slug>/` (package `CursoJava.lNN_<slug>`), numerado en orden didáctico dentro de la lección.
- S3: Cada programa se reescribe (opción 2 elegida por el usuario: "reordenar y reescribir") con la terminología, el orden de conceptos y el estilo de ejemplos de su lección. Mantiene su propósito; compila y corre.
- S4: Artefactos (código, comentarios, mensajes) en español neutro, idioma del proyecto existente.
- S5: Compilación completa de `src/` (como CI) sin errores nuevos. Baseline: 2 errores preexistentes en `excepciones09ExcepcionesPropias.java` (falta `NumeroPositivoInferiorA51Exception`).
- S6 (asumido): `exam/`, `ExamenesFinales/`, `Proyectos/` son evaluaciones/proyectos integradores; se clasifican pero NO se reescriben ni se mueven.

## Tasks
- [x] T1 Clasificación de los 389 archivos → `odd/mapping.md` — S2 — delegada (mapeo > 5 lookups, trigger Mapping) — commit: pendiente
- [ ] T2 Escritor A: L01,L02,L03 — S2,S3,S4 — delegada (writer: unidades paralelas) — commit: -
- [ ] T3 Escritor B: L04 — idem
- [ ] T4 Escritor C: L05,L06,L07 — idem
- [ ] T5 Escritor D: L08,L09,L10 — idem
- [ ] T6 Escritor E: L11 — idem
- [ ] T7 Escritor F: L12,L13 — idem
- [ ] T8 Escritor G: L14,L16,L17 — idem
- [ ] T9 Escritor H: L15 — idem
- [ ] T10 Escritor I: L19,L21,L23,L26 — idem
- [ ] T11 Integración: compilación completa vs baseline, limpieza de carpetas vacías, `src/CursoJava/README.md` (índice por lección) — S5 — inline
Notas de ruta: el mapa es `odd/mapping.md`. Lecciones 18, 20 y 27 no tienen programas en el repo (se reportan, no se inventan). Los escritores no usan git; el padre commitea por tarea.

## Log
L1 (2026-11-08): "quiero que estudies el curso cursos/java/ del reposotorio /Users/facundouferer/Devs/facundouferer y con ello analices todos los programas que tengo en src y los reformules y los reordenes para que coincidan con el esquema pedagógico del curso de java."
L2 (2026-11-08): "La opción 2, reordenar y reescribir"
