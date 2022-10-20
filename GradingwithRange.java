package labs;

import java.time.temporal.ValueRange;
import java.util.Scanner;

public class Grading2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValueRange range = ValueRange.of(1, 100);

        System.out.println("Please enter the overall score:");
        int grade = scanner.nextInt();

        if (range.isValidIntValue(grade)) {
            if (grade<50.0)
                System.out.println("You failed, FF");
            else if (grade<60.0)
                System.out.println("You passed, DD");
            else if (grade<65.0)
                System.out.println("You passed, DC");
            else if (grade<70.0)
                System.out.println("You passed, CC");
            else if (grade<75.0)
                System.out.println("You passed, CB");
            else if (grade<80.0)
                System.out.println("You passed, BB");
            else if (grade<85.0)
                System.out.println("You passed, BA");
            else if (grade<90.0)
                System.out.println("You passed, AB");
            else
                System.out.println("You passed, AA");
        } else {
            System.out.println("Invalid score, program terminates.");
        }
 }
}
