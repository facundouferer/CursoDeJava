package clases;

public class Operador {
    public String resolver(int num1, int num2, String operacion) {
        if (operacion.equals("sumar")) {
            return "Suma: " + num1+num2;
        }
        if(operacion.equals("restar")){
            return "Resta: " + (num1-num2);
        }
        if(operacion.equals("multiplicar")){
            return "Multi: " + num1*num2;
        }
        if(operacion.equals("dividir")){
            return "Divi: " + num1/num2;
        }
        return "algo salio mal";
    }

    public int resolver(int num1, int num2, int operacion) {
        if (operacion == 0) {
            return num1+num2;
        }
        if (operacion == 1) {
            return (num1-num2);
        }
        if (operacion == 2) {
            return num1*num2;
        }
        if (operacion == 3) {
            return num1/num2;
        }
        return 0;
    }
}
