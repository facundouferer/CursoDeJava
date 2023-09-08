package CursoJava.StreamsDeDatos;

import java.io.FileReader;

class parte01LecturaFichero {

   public static void main(String[]args) {

      LeerFichero accesoExternos = new LeerFichero();
      accesoExternos.leeDatos();
   }

}

class LeerFichero {

   public void leeDatos() {
      try {
         /*Entrada es el flujo de datos. El tunel por donde ir�n los datos.*/
         FileReader entrada = new FileReader("archivo.txt");

         int caracter = entrada.read(); /*nos devuelve el n�mero correspondeinte al caracter UNICODE o -1 si est� en el final*/
         char letra =(char)caracter; /*Parsea el n�mero correspondiente al caracter en un caracter*/

         while(caracter != -1){ /* Preguntamos por -1 para saber cuando termina. caracter tiene el nro equivalente al codigo UNICODE de cada letra. */
            System.out.print(letra); /*Escribir el caracter actual*/
            caracter = entrada.read(); /*avanzar un caracter*/
            letra =(char)caracter;
         }
         entrada.close(); /*Siempre hay que cerrar los bufers o accesos a ficheros externos.*/

      } catch (Exception e) {
         e.printStackTrace();
      }

   }

}
