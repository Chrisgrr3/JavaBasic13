import java.lang.reflect.Array;
import java.util.ArrayList;

public class Basics {
    public void printTo255() {
        for(int num = 1; num <=255; num++) {
            System.out.println(num);
        }
    }
    public void printOdds() {
        for(int num = 1; num <= 255; num++) {
            if(num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
    public void printSum() {
        int total = 0;
        for(int num = 1; num <= 255; num++) {
            total+=num;
            System.out.println("New Number: " + num + " Sum: " + total);
        }
    }
    public void iterate(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public void findMax(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public void getAvg(int[] arr) {
        float sum = 0;
        int count = 0;
        for(int i = 0; i< arr.length; i++) {
            sum+= arr[i];
            count+=1;
        }
        float avg = sum/count;
        System.out.println(avg);
    }
    public void oddArr() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int num = 1; num <= 255; num = num + 2) {
            y.add(num);
        }
        System.out.println(y);
    }
    public Integer greaterThanY(int[] arr, int y) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > y) {
                count+= 1;
            }
        }
        return count;
    }
    public int[] squareVals(int[] x) {
        for(int i = 0; i < x.length; i++) {
            x[i]*=x[i];
        }
        return x;
    }
    public int[] noNegatives(int[] x) {
        for(int i = 0; i< x.length; i++) {
            if(x[i] < 0) {
                x[i] = 0;
            }
        }
        return x;
    }
    public ArrayList MaxMinAvg(int[] x) {
        float max = x[0];
        float min = x[0];
        float sum = 0;
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if(x[i] > max) {
                max = x[i];
            }
            else if(x[i] < min) {
                min = x[i];
            }
            sum+=x[i];
            count+=1;
        }
        float avg = sum/count;
        ArrayList<Object> result = new ArrayList<Object>();
        result.add("MAXNUM: " + max);
        result.add("MINNUM: " + min);
        result.add("AVG: " + avg);
        return result;
    }
    public int[] shiftVals(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if(i == x.length-1) {
                x[i] = 0;
            }
            else if(i != x.length-1) {
                x[i] = x[i+1];
            }
        }
        return x;
    }
}