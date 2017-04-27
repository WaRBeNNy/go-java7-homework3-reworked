package com.gojava7.arrayapp;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHolder {
    int size;
    int[] array;
    boolean isFilled;

    public ArrayHolder(int size) {
        this.size = size;
        this.array = new int[this.size];
    }

    public void fillArray() {
        for(int i=0; i<this.array.length; i++) {
            System.out.println("Enter number " + (i+1) + ":");
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                this.array[i] = scanner.nextInt();
                isFilled = true;
            }
            else {
                System.out.println("Wrong input!");
                isFilled=false;
                break;
            }
        }
    }

    public void sortArray() {
        System.out.print("Initial Array: ");
        for(int i=0; i<this.array.length; i++)
            System.out.print(array[i] + " ");
        Arrays.sort(this.array);
        System.out.println();
        System.out.print("Sorted Array: ");
        for(int i=0; i<this.array.length; i++)
            System.out.print(array[i] + " ");
    }

    public void searchElement() {
        System.out.println("What element to search?");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            int element = scanner.nextInt();
            for(int i=0;i<this.array.length; i++) {
                if(this.array[i] == element)
                    System.out.println("Element found with index " + i);
            }
        }

        else {
            System.out.println("Wrong input!");
            searchElement();
        }
    }
}
