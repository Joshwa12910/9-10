import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAppend {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("courses.txt", true))) {
            bw.newLine();
            bw.write("Course Code: ");
            bw.write(getInput());
            bw.newLine();
            bw.write("Course Name: ");
            bw.write(getInput());
            bw.newLine();
            bw.write("Instructor: ");
            bw.write(getInput());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("An error occurred while appending the file: " + e.getMessage());
        }
    }

    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        return scanner.nextLine();
    }
}
