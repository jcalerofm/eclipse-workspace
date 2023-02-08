
package cmdline6;
import java.io.*;
import java.util.*;

public class CmdLine6 {


    public static void main(String[] args) {

        File f = new File("/Users/jorge/Desktop/d1/f12.txt");
        //display the attributes of archivo
        //display file name
        System.out.println("File Name: " + f.getName());
        //display absolute path
        System.out.println("Absolute Path: " + f.getAbsolutePath());
        //display the size of the file in kb
        System.out.println("Size: " + f.length() + " bytes");
        //display if it is a file or directory
        System.out.println("Is it a file? " + f.isFile());
        // display the date of last modification in date format
        System.out.println("Last modified: " + new Date(f.lastModified()));
        // display if it has write permission
        System.out.println("Can it be written? " + f.canWrite());
        // display if it has read permission
        System.out.println("Can it be read? " + f.canRead());
        // display if it has executable permission
        System.out.println("Can it be executed? " + f.canExecute());

    }

}
