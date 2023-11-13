package CursoJava.StreamsDeDatos;
import java.io.FileReader;

class parte01LecturaFichero {

   public static void main(String[]args) {
      LeerFichero accesoExternos = new LeerFichero();
      System.out.println(accesoExternos.leeDatos());
   }

}

class LeerFichero {

   public String leeDatos() {
      StringBuilder contenido = new StringBuilder();
      try {
         /*Entrada es el flujo de datos. El tunel por donde ir�n los datos.*/
         FileReader entrada = new FileReader("archivo.txt");

         int caracter = entrada.read(); /*nos devuelve el n�mero correspondeinte al caracter UNICODE o -1 si est� en el final*/

         while(caracter != -1){ /* Preguntamos por -1 para saber cuando termina. caracter tiene el nro equivalente al codigo UNICODE de cada letra. */
            char letra = (char) caracter;
            contenido.append(letra); // Agregar el caracter al contenido
            caracter = entrada.read(); //avanza al siguiente caracter
         }
         entrada.close(); /*Siempre hay que cerrar los bufers o accesos a ficheros externos.*/

      } catch (Exception e) {
         e.printStackTrace();
      }
      return contenido.toString();
   }

}
