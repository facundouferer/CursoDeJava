package CursoJava.l01_conceptos_basicos;

/**
 * Lección 01 – Conceptos básicos
 * Objetivo: calcular un salario anual evitando duplicar valores mediante constantes.
 * Concepto: 6. Convenciones de estilo e indicadores de calidad.
 */
public class Ej03ConstantesYConvenciones {

    // Las constantes usan UPPER_SNAKE_CASE; las variables, camelCase.
    private static final int SALARIO_MENSUAL = 5000;
    private static final int MESES_EN_UN_ANIO = 12;

    public static void main(String[] args) {
        double salarioAnual = MESES_EN_UN_ANIO * SALARIO_MENSUAL;
        System.out.println("Salario anual: " + salarioAnual);
    }
}
