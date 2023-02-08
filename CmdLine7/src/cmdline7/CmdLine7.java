package cmdline7;

import java.io.*;


public class CmdLine7 {


    public static void main(String[] args) {

    File archivo = new File("/Users/jorge/Desktop/d1/f12.txt");
    
    if (archivo.canRead() && archivo.canExecute()) {
        archivo.setReadable(false);
        archivo.setExecutable(false);
        System.out.println("Se han denegado los permisos de lectura y ejecución");
    } else {
        System.out.println("El archivo no tiene permisos de lectura y ejecución");

    }

}
}
