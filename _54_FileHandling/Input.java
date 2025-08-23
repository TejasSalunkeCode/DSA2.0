package _54_FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Input {
    static void input(){
        try(InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.println("Enter some letters: ");
            int leters=isr.read();
            while (isr.ready()) {
                System.out.println((char)leters);
                leters=isr.read();
            }
            //isr.close()
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        try(FileReader fr = new FileReader("note.txt")) {
            int letters=fr.read();
            while (fr.ready()) {
                System.out.println((char)letters);
                letters=fr.read();
            }
            //fr.cloose();
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        //byte to char stream and then reading char stream
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("You typed :");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
