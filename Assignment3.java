package Assignments;

import java.util.Scanner;

public class OddCount {

    public static int loopBasedCount(int low, int high) {

        if (low > high) {
           int temp = low;
            low = high;
            high = temp;
        }
        int count = 0;

        for (int i=low; i<=high ; i++) {
            if (i % 2 !=0) {
                count++;
            }
        }
        return count;
    }
    public static int mathBasedCount(int low, int high) {
        if (low > high) {
            int temp = low;
            low = high;
            high = temp;
        }
        int count;
        if (low % 2 == 0 && high % 2 == 0) {
                 count = (high - low) / 2;
           }
        else {
                 count = (high - low) / 2 + 1;
            }
        return count;
        }
    public static void main(String[] args) {
        System.out.println("Please enter number:");
        Scanner number = new Scanner(System.in);
        int x = number.nextInt();
        int y = number.nextInt();
        if (x > y){
            int temp;
            temp = x;
            x = y;
            y = temp;
        }
        long start1= System.currentTimeMillis();
        int cl = loopBasedCount(x,y);
        long end1 = System.currentTimeMillis();
        System.out.printf("Loop Based Solution: In the range [%d,%d], there are %d odd numbers\n", x,y,cl);

        long start2 = System.currentTimeMillis();
        int c = mathBasedCount(x,y);
        long end2 = System.currentTimeMillis();
        System.out.printf("Math Based Solution: In the range [%d,%d], there are %d odd numbers\n",x,y,c);

        System.out.println(end1-start1);

        System.out.println(end2-start2);
    }
    }
