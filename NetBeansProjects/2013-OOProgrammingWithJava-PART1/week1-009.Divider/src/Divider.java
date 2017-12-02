
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        double a = Double.parseDouble(reader.nextLine());   // Reads a line from the users keyboard

        System.out.print("Type another number: ");
        double b = Double.parseDouble(reader.nextLine()); // Reads a string variable from the keyboard and transfers it to an integer
        double result = a / b;
        System.out.println("Division: " + a + " / " + b + " = " + result);

        // Implement your program here. Remember to ask the input from user.
    }
}
