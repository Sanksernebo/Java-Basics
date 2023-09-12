package week1;
import java.util.Scanner;
public class Ex9 {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
                System.out.print("Enter a number: ");
         double number = Integer.parseInt(reader.nextLine());

                System.out.print("Enter another number for division: ");
         double number2 = Integer.parseInt(reader.nextLine());

        double division = number / number2;
                System.out.print("The division of these numbers is: " + division);
        }
    }
