import java.io.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        File file = new File("myfilfdfe.txt");
        /*
         try with resources -> java 7
         -> automatically closes the resources
         -> any class that implements autocloseable can be used in this try-with-resources block
         -> autocloseable is an interface and can be extended by the class closeable
         -> its possible to create a class that implements autocloseable
         */
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            /*
            bufferedReader -> reads the file line by line
            fileReader -> reads all lines from file at once
             */
            String line = bufferedReader.readLine();
            while(line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem reading the file " + file.getName());
        }

    }


}