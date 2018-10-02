package com.abusair.training.codeforceexample;

import java.util.Scanner;

public class Team231A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfProblems = Integer.valueOf(scanner.nextLine());

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numberOfProblems; i++) {
            builder.append(scanner.nextLine());
        }
        System.out.println("s");
    }
}
