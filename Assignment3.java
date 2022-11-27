package Assignments;

import java.util.Scanner;

public class OddCount {
    public static void loopBasedCount() {
        System.out.println("Please enter a number:");
        Scanner number = new Scanner(System.in);
        int low = number.nextInt();
        int high = number.nextInt();
        int temp;
        if (low > high) {
            temp = low;
            low = high;
            high = temp;
        }
        while (true) {
            if (low % 2 == 0 && high % 2 == 0) {
                int count = (high - low) / 2;
                System.out.printf("Loop Based Solution: In the interval [%d,%d], there are %d odd numbers ", low, high, count);
                break;
            } else {
                int count = (high - low) / 2 + 1;
                System.out.printf("Loop Based Solution: In the interval [%d,%d], there are %d odd numbers ", low, high, count);
                break;
            }
        }
    }

    public static void mathBasedCount() {
        System.out.println("Please enter a number:");
        Scanner number = new Scanner(System.in);
        int low = number.nextInt();
        int high = number.nextInt();
        int temp;
        if (low > high) {
            temp = low;
            low = high;
            high = temp;
        }  else {
            if (low % 2 == 0 && high % 2 == 0) {
                int count = (high - low) / 2;
                System.out.printf("Math Based Solution: In the interval [%d,%d], there are %d odd numbers", low, high, count);
           }else {
                int count = (high - low) / 2 + 1;
                System.out.printf("Math Based Solution: In the interval [%d,%d], there are %d odd numbers", low, high, count);
            }

        }
        }

    public static void main(String[] args) {
        loopBasedCount();
        mathBasedCount();
    }
    }
