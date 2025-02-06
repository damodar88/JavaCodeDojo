package org.hackerrank;

import java.util.Scanner;

import static java.lang.Character.FORMAT;

public class JavaOutputFormatting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            formatNumberManually(x, s1);
        }
        System.out.println("================================");
        sc.close();
    }

    private static void formatNumberManually(int x, String s1){
        while (s1.length() < 15) {
            s1 += " ";
        }

        String numStr = "";
        if(x < 10){
            numStr = "00" + x;
        } else if (x < 100) {
            numStr = "0" + x;
        }else {
            numStr = "" + x;
        }
        System.out.println(s1 + numStr);
    }
}


