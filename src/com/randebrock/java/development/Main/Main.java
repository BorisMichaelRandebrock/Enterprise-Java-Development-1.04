package com.randebrock.java.development.Main;

public class Main {
    public static void main(String[] args) {

        int[] numbersArray = { 5,20,5,6,7,8,9};

        difference(numbersArray);

    }
    public static void difference(int[] array){
        if (array.length < 1 ){
            System.out.println("please enter a longer array");
        } else {
            int max = array[0];
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }
            System.out.println("the max number is:" max + "  and the min is:" + min);
        }
    }

}
/*
Write a method in Java to get the difference between the largest and smallest values in an array of integers.
 The length of the array must be 1 and above.
Write a method in Java to find the smallest and second smallest elements of a given array and print it in the console.
Write a method in Java that resolves this mathematical expression where x and y are two variables pre-set in your code.
 */