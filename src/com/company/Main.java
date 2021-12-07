package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tester example
        System.out.println("Choose how many items are needed in collections?");
        System.out.println("A. 10000 \nB. 50000 \nC. 100000");
        String flag = "";
        Scanner scanner = new Scanner(System.in);
        flag = scanner.next();
        switch (flag) {
            case "A": {
                example = new Tester(10000);
                break;
            }
            case "B": {
                example = new Tester(50000);
                break;
            }
            case "C": {
                example = new Tester(100000);
                break;
            }
            default: {
                System.out.println("Incorrect value.We took the option C");
                example = new Tester(100000);
            }
        }
        try {
            example.startTest();
            example.table();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
