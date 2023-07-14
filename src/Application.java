import java.io.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        File file = new File("myfilfdfe.txt");
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
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
        } finally {
            /*
            always runs
             */
            try {
                if (bufferedReader!= null)
                    bufferedReader.close();
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                System.out.println("unable to close file" + file.getName());
            }
        }

    }


}