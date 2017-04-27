package com.gojava7.arrayapp;

import java.util.Scanner;

public class ConsoleHelper {

    public ConsoleHelper() {
    }

    public void consoleStart() {
        int size=0;
        System.out.println("Hello!");
        System.out.println("Please enter array size:");
        Scanner scanner = new Scanner(System.in);

        if(!scanner.hasNextInt()) {
            System.out.println("Wrong input");
            consoleStart();
        }

        size = scanner.nextInt();

        ArrayHolder array = new ArrayHolder(size);

        do {
            array.fillArray();
        } while(!array.isFilled);

        menuStart(array);
    }

    public void menuStart(ArrayHolder array) {
        ArrayHolder menuArray = array;
        System.out.println();
        System.out.println("What to do next?");
        System.out.println("    1. Search element in array");
        System.out.println("    2. Sort array");
        System.out.println("    3. Exit");
        int choice=0;
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt())
            choice = scanner.nextInt();
        else {
            System.out.println("Wrong input!");
            menuStart(menuArray);
        }

        switch(choice) {
            case 1:
                menuArray.searchElement();
                menuStart(menuArray);
                break;
            case 2:
                menuArray.sortArray();
                menuStart(menuArray);
                break;
            case 3:
                System.out.println("Program terminated!");
                System.out.println("...");
                break;
            default:
                System.out.println("Wrong input");
                menuStart(menuArray);
        }
    }

}
