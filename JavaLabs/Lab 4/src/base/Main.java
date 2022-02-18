package base;

import java.lang.Math;

public class Main {
    /**
     * # Lab Four
     * ---
     *
     * For this lab we're going to be making and using a bunch of functions.
     *
     * Our Goals are:
     * - Switch Case
     * - Looping
     * - Making our own functions
     * - Combining functions
     * - Structuring solutions
     */
    public static void main(String[] args) {
        // Give me an example of you using switch case.
        String steak = "Medium";

        switch(steak){
            case "Rare":
                System.out.println("Rare steak is too pink for my taste! And too chewy.");
                break;
            case "Medium Rare":
                System.out.println("Medium rare is okay-ish, I prefer it to be cooked a little more though!");
                break;
            case "Medium":
                System.out.println("Perfect! Medium is the perfect amount of pink imo :D");
                break;
            case "Well Done":
                System.out.println("Nope!!! Too cooked! Much too dry D:");
                break;
            default:
                System.out.println("Oh boy all this steak talk is making me hungry!");
        }

        // Give me an example of you using a for loop
        for (int x = 2022; x < 2041; x++){
            System.out.println("It's already " + x + "! Time sure flies!");
        }

        // Give me an example of you using a while loop
        int x = 0;
        while (x < 11) {
            System.out.println("Okay! The number is: " + x );
            x++;
        } System.out.println("Done!");

        powerUp(2, 3);
        int[] nums = {2,3,5,2,3,6,7,8,2};
        howManyTimes(nums, 2);
        int[] sumNums = {2,3,5,2,3,6,7,8,2};
        summation(sumNums);
        pythagAns(2, 4);
    }

    // For the following todos you'll probably want to define them below and then call them from the main function above.

    /**
     * I want you to write a function that will take in a number and raise it to the power given.
     * For example if given the numbers 2 and 3. The math that the function should do is 2^3
     * and should print out or return 8. Print the output.
     */
    
    static double powerUp(double baseNum, double powerNum) {
        double answer = Math.pow(baseNum, powerNum);
        System.out.println("The answer is: " + answer);
        return answer;
    } 

    /**
     * I want you to write a function that will take in a list and see how many times a given number is in the list.
     * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
     * or return 3. Print the output.
     */
    
    static int howManyTimes(int[] listNum, int goalNum){
        int count = 0;
        //for number in list
        for (int num: listNum) {
            if (num == goalNum)
                count++;
        }
        System.out.println("The number appears " + count + " times.");
        return count;
    }

    /**
     * Create a function named summation that will take in an int[ ] and return an int.
     * I want the function to then go through the given array and sum up digits in the array.
     * Once that’s done print or return the answer. Print the output
     */

    static int summation(int[] listOfNums){
        // initialize before loop
        int total = 0;
        for (int nums: listOfNums) {
            total = nums + total;
        }  System.out.println("The summation is: " + total);
        return total;
    }

    /**
     * Give me a function that gives the answer to the pythagorean theorem.
     * I'd like you to reuse the exponent function from above as well as the functions below to make your function.
     *
     * If you don't remember the pythagorean theorem the formula is (a^2 + b^2 = c^2).
     * Given a and b as parameters i'd like you to return c.
     *
     * If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
     *
     * Once that’s done print or return the answer. Print the output
     */

    static double pythagAns(double valueA, double valueB) {
        double numA = powerUp(valueA, 2);
        double numB = powerUp(valueB, 2);
        double numC = addition(numA, numB);
        double totalPyth = division(numC, 2);
        
        System.out.println("C will equal: " + totalPyth);
        return totalPyth;
    }


    static double addition(double a, double b) {
        double answer = a + b;
        return answer;
    }

    static double division(double a, double b) {
        double answer = a / b;
        return answer;
    }
}
