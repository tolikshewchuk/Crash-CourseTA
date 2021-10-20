package com.company;
import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        int x, y, a, b , c;
        Scanner in = new Scanner(System.in);
        System.out.print("Hi, let's find out if your brick will go into the hole");
        System.out.print("\nEnter first hole side x\n=>");
        x = in.nextInt();
        System.out.print("Enter second hole side - y\n=>");
        y = in.nextInt();
        System.out.print("Enter first brick side - a\n=>");
        a = in.nextInt();
        System.out.print("Enter second brick side - b\n=>");
        b = in.nextInt();
        System.out.print("Enter third brick side - c\n=>");
        c = in.nextInt();
        if((a <= x && (b <= y || c <= y)) || (b <= x && (a <= y || c <= y)) || (c <= x && (b <= y || a <= y)))
            System.out.print("Your brick entered successfully");
        else System.out.print("O-oh something went wrong, your brick too large ");
    }
}
