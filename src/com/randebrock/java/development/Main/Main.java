package com.randebrock.java.development.Main;

public class Main {
    public static void main(String[] args) {

        int[] numbersArray = { 5,2,56,6,3,7,8,9, 50, 45};

        difference(numbersArray);
        smallestAndSecondSmallest(numbersArray);
        double result = weirdMathMethod(2, 2);
        System.out.println(result);

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
            System.out.println("the max number is: "+  max + "  and the min is: " + min);
        }
    }

    public static void smallestAndSecondSmallest(int[] array) {
        int min = array[0];
        int secondMin = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (secondMin > min && array[i] != min && array[i] < secondMin) {
                secondMin = array[i];
            }
        }
        System.out.println(min + " " + secondMin);
    }

    public static double weirdMathMethod(double numbX, double numbY){
        return Math.pow(numbX,2) + Math.pow(((4*numbY)/5)-numbX,2);
    }

}
/*

Write a method in Java to find the smallest and second smallest elements of a given array and print it in the console.
Write a method in Java that resolves this mathematical expression where x and y are two variables pre-set in your code.
 */