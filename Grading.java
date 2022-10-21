package labs;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        System.out.println("Please enter the overall score:");

        Scanner score = new Scanner(System.in);

        double grade =score.nextDouble();
        if (grade<0.0 || grade>100.0){
            System.out.println("Invalid score, program terminates.");
            System.exit(0);
        }
        if (grade<50.0){
            System.out.println("You failed, FF");
        } else if (grade<60.0){
            System.out.println("You passed, DD");
        } else if (grade<65.0){
            System.out.println("You passed, DC");
        } else if (grade<70.0){
            System.out.println("You passed, CC");
        } else if (grade<75.0){
            System.out.println("You passed, CB");
        } else if (grade<80.0){
            System.out.println("You passed, BB");
        } else if (grade<85.0){
            System.out.println("You passed, BA");
        } else if (grade<90.0){
            System.out.println("You passed, AB");
        } else if (grade<=100.0){
            System.out.println("You passed, AA");
        }

    }
}
