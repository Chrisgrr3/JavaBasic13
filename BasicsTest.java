import java.util.Arrays;

public class BasicsTest {
    public static void main(String[] args) {
        Basics basic = new Basics();
        System.out.println("Print to 255:");
        basic.printTo255();

        System.out.println("Print odds between 1-255:");
        basic.printOdds();

        System.out.println("Print Sum:");
        basic.printSum();

        System.out.println("Iterating through an array: ");
        int[] newArr = {2,4,6,8,4,10};
        basic.iterate(newArr);

        System.out.println("Find Max:");
        int[] maxArr = {2,6,3,7,1000,4,0,200};
        basic.findMax(maxArr);

        System.out.println("Get Average: ");
        int[] avgArr = {10,10,3,6,9,60};
        basic.getAvg(avgArr);

        System.out.println("Array with Odd Numbers:");
        basic.oddArr();

        System.out.println("Greater than Y:");
        int[] yArr = {3,5,7,1,2,5,2};
        System.out.println(basic.greaterThanY(yArr, 2));

        System.out.println("Square the values:");
        int[] squareArr = {1,2,5,6,8,9};
        System.out.println(Arrays.toString(basic.squareVals(squareArr)));

        System.out.println("Eliminate Negative Numbers:");
        int[] negativeArr = {1,5,-3,-1,-10,10};
        System.out.println(Arrays.toString(basic.noNegatives(negativeArr)));

        System.out.println("Max, min, and Average:");
        int[] myArr = {1,4,7,9,19,3};
        System.out.println(basic.MaxMinAvg(myArr));

        System.out.println("Shifting the Values in the Array: ");
        int[] shiftArr = {3,5,6,8,2,10};
        System.out.println(Arrays.toString(basic.shiftVals(shiftArr)));
    }
}