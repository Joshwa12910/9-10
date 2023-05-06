import java.util.Random;
import java.util.Scanner;

public class ESPTest {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < 10; i++) {
            int color = rand.nextInt(5);
            System.out.print("Guess the color (green, blue, orange, red, yellow): ");
            String guess = sc.nextLine();

            System.out.print("The color was: ");
            switch (color) {
                case 0:
                    System.out.println("red");
                    if (guess.equalsIgnoreCase("red")) {
                        score++;
                    }
                    break;
                case 1:
                    System.out.println("green");
                    if (guess.equalsIgnoreCase("green")) {
                        score++;
                    }
                    break;
                case 2:
                    System.out.println("blue");
                    if (guess.equalsIgnoreCase("blue")) {
                        score++;
                    }
                    break;
                case 3:
                    System.out.println("orange");
                    if (guess.equalsIgnoreCase("orange")) {
                        score++;
                    }
                    break;
                case 4:
                    System.out.println("yellow");
                    if (guess.equalsIgnoreCase("yellow")) {
                        score++;
                    }
                    break;
            }
        }

        System.out.println("You got " + score + " out of 10 Is the conditional statement ¬(p → q) → p a tautology?\n" +
                "\n" +
                "\n" +
                "Group startsYes or No.");
    }
}