package labs;

import java.util.Scanner;

public class Fahrenheit2Celcius {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the Fahrenheit degree :");
        double fahrenheit = scanner.nextDouble();
        double celcius = (5.0/9)*(fahrenheit-32);

        System.out.printf("%.2f Fahrenheit = %.2f Celcius",fahrenheit, celcius);
    }
}
