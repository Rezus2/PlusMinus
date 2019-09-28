package com.company;

import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if ((a == -b) || (a==-c) || (a==-d) || (b==-c) || (b==-d) || (c==-d))
            System.out.println(true);
         else
            System.out.println(false);
    }
}
