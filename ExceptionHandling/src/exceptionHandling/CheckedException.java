package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

    /*
        @ Checked exceptions: These are the exceptions that Java compiler forces
                              you to handle explicitly using try-catch blocks. or
                              by declaring them in the method signature using the throws keyword.
            1. Pass the exception using throws keyword from the source method.
            2. Identify the actual caller method, that calls the method with the throws keyword.
               Only there handle the exception with try-catch block and appropriate action.
            - ClassNotFoundException
            - FileNotFoundException
            - SQLException
            - IOException
            - InterruptedException
    */

    public static void main(String[] args) {
        try {
            anotherMethod();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage() + " " + ex.getClass());
        }
        System.out.println("file open successful");
    }

    public static void anotherMethod() throws FileNotFoundException {
        openFile();
    }

    public static void openFile() throws FileNotFoundException {

        // give current directory
        String curdir = System.getProperty("user.dir");

        //specify the file name
        String fileName = "my-file.txt";

        // constructing the filepath
        String filePath = curdir + "/src/exceptionHandling/" + fileName;

        //create a file object representing the file
        File file = new File(filePath);

        //create a FileInputStream to read the file
        FileInputStream fileInputStream = new FileInputStream(file);
    }
}
