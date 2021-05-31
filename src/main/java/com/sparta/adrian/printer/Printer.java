package com.sparta.adrian.printer;

public class Printer {

    public static void printMergeSortText(){
        System.out.println("Merge Sort Method:");
    }

    public static void printBubbleSortText() {
        System.out.println("Bubble Sort Method:");
    }

    public static void printAscendingTreeText() {
        System.out.println("Binary Tree Method (Ascending):");
    }

    public static void printDescendingTreeText() {
        System.out.println("Binary Tree Method (Descending):");
    }

    public static void printOriginalArray(int[] array){
        System.out.print("Original Array: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("");
    }

    public static void printSortedArray(int[] array){
        System.out.print("Sorted Array: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("");
    }


    public static void print(String message){
        System.out.println(message);
        System.out.println("-----------------------------------------");
    }
}
