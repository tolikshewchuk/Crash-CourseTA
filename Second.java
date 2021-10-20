package com.company;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Second {
    public static void main(String[] args)  {
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Hi, enter positive integer variable \n");
        boolean validInput = false;
        do {
            if (in.hasNextInt()){
                n = in.nextInt();
                if(n > 0)
                    validInput = true;
                else System.out.println("O-ops something went wrong, enter integer variable");
            } else
                System.out.println("O-ops something went wrong, enter integer variable");
                in.nextLine();
            } while (!validInput);

        int n1 = n*n;
        boolean x = false;
        String n2 = Integer.toString(n1);

        /* Task 1 */
        System.out.print("\nTask 1 \n");
        for(int i = 0; i<n2.length(); i++)
            if(n2.charAt(i)=='3'){
                System.out.print("3 is included in "+n2);
                x = true;
                break;}
        if(!x)
            System.out.print("3 isn`t included in "+ n1);

        /* Task 2 */
        System.out.print("\n\nTask 2 \n");
        int k = n;
        while(k > 0)
        {
            int x1 = k % 10;
            k = (k - x1) / 10;
            System.out.print(x1);
        }
        /* Task 3 */
        System.out.print("\n\nTask 3 \n");
        String ld = Integer.toString(n % 10); /* last digit */
        String new_n = Integer.toString(n);
        String fd = (new_n.substring(0, 1)); /* first digit */
        int center = Integer.parseInt(new_n.substring(1, new_n.length() - 1));/* digits */
        System.out.print(ld + (center) + fd);

        /* Task 4 */
        System.out.print("\n\nTask 4 \n");
        String y = "1" + (n) + "1";
        System.out.print(y);
    }
}
