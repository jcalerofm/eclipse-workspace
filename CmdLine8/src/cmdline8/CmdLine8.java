package cmdline8;

import java.io.*;

public class CmdLine8 {

  public static void main(String[] args) {

    File archivo = new File("/Users/jorge/Desktop/d1");

    if (archivo.isDirectory()) {
        System.out.println("Es un directorio");
        String[] lista = archivo.list();
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    } else {
        System.out.println("No es un directorio");
    }
  }
}
