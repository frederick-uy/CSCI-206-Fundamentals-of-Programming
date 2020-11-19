/* 
Command Line Argument Homework
This program will accept  6 command line argument and will print the largest, smallest, and the sum of 6 numbers
Frederick Uy
CSCI 207
*/

import java.util.*;
public class lab4 {
    public static void main(String[] args) {
    
        //sets comamand line arguments to 6 and puts it in an array if more than 6 it will error
        int[] array = new int[6];
        for (int i = 0; i < args.length; i++) {
            //convert the command line arguments to int
            int currentnum = Integer.parseInt(args[i]);
            //if arguments more than six, it will error
            array[i] = currentnum;
        }

        //Finding the largest number on array
        int[] largestnum = new int[6];
        largestnum[0] = array[0];
        for (int j = 1; j < array.length; j++) {
            //check if num is largest
            if (largestnum[0] < array[j]) {
                largestnum[0] = array[j];
            }
        }
        //prints the largest num
        System.out.println(largestnum[0]);


        //finding smallest num on the array
        largestnum[0] = array[0];
        for (int smallestnum = 1; smallestnum < array.length; smallestnum++) {
            //checks if num is smallest
            if (largestnum[0] > array[smallestnum]) {
                //if true, then largest num = smallest num this time
                largestnum[0] = array[smallestnum];
            }
        }
        //print smallest num
        System.out.println(largestnum[0]);

        //this is for sum of all numbers on the array
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        //print the sum of all num
        System.out.println(sum);
    }
}