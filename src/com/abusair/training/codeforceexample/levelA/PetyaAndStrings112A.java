package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class PetyaAndStrings112A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        if (input1.compareToIgnoreCase(input2) < 0)
            System.out.println("-1");
        else if (input1.compareToIgnoreCase(input2) > 0)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
