/*
    Bài 19. Viết chương trình tách các từ trong câu và in các từ theo thứ tự Alphabet.
    Áp dụng tách các từ cho trước trong file input.txt và ghi kết quả ra file output.txt
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class bai19_lab3 {
    public static void main(String[] args) throws IOException {
        Scanner inputFromFile = new Scanner(Paths.get("input19.txt"),
                "UTF-8");
        PrintWriter printWriter = new PrintWriter("output19.txt", "UTF-8");

        String ex;
        while (inputFromFile.hasNextLine()){
            ex = inputFromFile.nextLine();// read all line
            String [] exs = ex.split(" ");
            Arrays.sort(exs);
            for (String s: exs) {
                printWriter.print(s+" ");
            }
//            printWriter.print("\b");
            printWriter.println();
        }
        // dong ket noi voi file
        inputFromFile.close();
        printWriter.close();
    }
}