package com.abusair.training.codeforceexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Team231A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfProblems = Integer.valueOf(scanner.nextLine());
        String arr[] = new String[numberOfProblems];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            String[] split = arr[i].split(" ");
            for (int j = 0; j < split.length; j++) {
                if (split[j].equalsIgnoreCase("1")) {
                    count++;
                }

            }

            map.put(i + 1, count);
        }
        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }

        System.out.println(maxEntry.getKey());

    }

}
