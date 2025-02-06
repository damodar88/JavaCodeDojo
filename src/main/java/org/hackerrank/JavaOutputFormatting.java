package org.hackerrank;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            formatNumberWithLeadingZeros(x, s1);
        }
        System.out.println("================================");
        sc.close();
    }

    private static void formatNumberWithLeadingZeros(int x, String s1){
        String numByCero;
        if(x <= 99){
            if(String.valueOf(x).length() < 2){
                numByCero = "00"+x;
                System.out.println(String.format("%-15s%s", s1, numByCero));
            }else {

                String num = Integer.toString(x);
                numByCero = "0" + num;
                System.out.println(String.format("%-15s%s", s1, numByCero));
            }
        }else{
            System.out.println(String.format("%-15s%s", s1, x));
        }

    }

}


