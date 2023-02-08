package cmdline9;

import java.io.*;

public class cmdline9 {

  public static void main(String[] args) {

    File archivo = new File("/");
   // lists the contents of the archivo directory and the directories hanging from it, displaying name and type of each file or directory.
    if (archivo.isDirectory()) {
        System.out.println("Es un directorio");
        File[] lista = archivo.listFiles();
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i].getName() + " // " + (lista[i].isDirectory() ? "DIRECTORIO" : "ARCHIVO"));
        }
    } else {
        System.out.println("No es un directorio");
    }



  }
}
