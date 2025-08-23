package _54_FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // create
        try {
            File fo = new File("newfile.txt");
            fo.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        // write in the file
        // try {
        //     FileWriter fw = new FileWriter("newfile.txt");
        //     fw.write("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज, अहं त्वां सर्वपापेभ्यो मोक्षयिष्यामि मा शुच:");
        //     fw.close();
        //     System.out.println("file updated");
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println(e.getMessage());
        // }
         try {
            // Use UTF-8 encoding
            BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("newfile.txt"), "UTF-8")
            );

            writer.write("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज, अहं त्वां सर्वपापेभ्यो मोक्षयिष्यामि मा शुच:");
            writer.close();

            System.out.println(" Sanskrit text written successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        //Read from a file
        try (BufferedReader br = new BufferedReader(new FileReader("newfile.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        //create
        try {
            File fo = new File("random.txt");
            fo.createNewFile();
            if(fo.delete()){
                System.out.println(fo.getName());
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
