package TUTORIAL;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriting {
    public static void main (String [] args){
        // How to write a file using java (4 popular option)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrinterWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio, files)



        try( FileWriter writer = new FileWriter("test.txt");){
            writer.write("I love Coding\n Coding is fun");
            System.out.println("File has been written");
        }
        catch (IOException e) {
            System.out.println("Could not write file");

        }

        try( FileWriter writer = new FileWriter("C:\\Users\\LANRE\\Desktop\\test.txt");){
            writer.write("I love Coding");
            System.out.println("File has been written");
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch (IOException e) {
            System.out.println("Could not write file");

        }

        // An organized way to do this is to pass the file path and text content into variables

        String filePath = "C:\\Users\\LANRE\\Desktop\\test2.txt";
        String textContent = """
                Roses are Red
                Violets are Blue
                I Love you, but 
                I love coding More !!!
                """;

        try(FileWriter writer = new FileWriter(filePath);){
            writer.write(textContent);
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch (IOException e) {
            System.out.println("Could not write file");
        }
    }
}
