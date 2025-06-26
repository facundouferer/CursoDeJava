package CursoJava.Serializacion.SerializacionSimple;

import java.io.*;

class Escritura {

  public static void main(String[] args) {


    Personita personita = new Personita("Juan", 123);
    try {
      ObjectOutputStream flujoSalida =
              new ObjectOutputStream(new FileOutputStream("miObjetoSerializado.txt"));
      flujoSalida.writeObject(personita);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}