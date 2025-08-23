package _54_FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Output {
    static void output() {

        // ✅ Writing to console
        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("Hello World\n"); // string
            osw.write(97);              // ASCII for 'a'
            osw.write(10);              // newline
            osw.write('A');             // char
            osw.write('\n');
            char[] arr = "hello world".toCharArray();
            osw.write(arr);
            osw.write('\n');
            osw.write("😍");            // emoji works as string
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // ✅ Append to file
        try (FileWriter fw = new FileWriter("note.txt", true)) {
            fw.write("\nThis should be appended");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // ✅ BufferedWriter (overwrites file unless you pass 'true')
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt", true))) {
            bw.write("\nHare Krishna");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
