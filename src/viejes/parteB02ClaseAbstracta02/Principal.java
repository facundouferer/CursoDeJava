package viejes.parteB02ClaseAbstracta02;

public class Principal {
    public static void main(String[] args) {
        Profesor[] profesores = new Profesor[3];

        profesores[0] = new Profesor(12332123, "Carlos", "TUP");

        Persona empleadoParaCastear = new Profesor(25147789, "Sabrina", "TUP"); // DOWNCASTING o casting expl�cito 1)
                                                                                // hago Upcasting
        profesores[1] = (Profesor) empleadoParaCastear; // DOWNCASTING o casting expl�cito 2) logro el DownCasting

        profesores[2] = new Profesor(12951478, "Rita", "IQ");

        for (Persona profesor : profesores) {
            System.out.println(profesor.toString());
        }
    }
}
