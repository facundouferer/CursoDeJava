package CursoJava.Serializacion.SerializacionSimple;

import java.io.*;

class Escritura {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Personita personita = new Personita("Juan", 123);
    try {
      ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("miObjetoSerializado.txt"));
      // Escribe el objeto en un archivo
      flujoSalida.writeObject(personita);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    ;

  }

}