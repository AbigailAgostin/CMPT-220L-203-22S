package base;

public class Main {
    /**
     * # Lab Three
     *
     * Ok for this lab we're going to reiterate a lot of the things that we went over in class.
     *
     * Our Goals are:
     * - Conditionals
     *     - If
     *     - Else
     *     - Else If
     */
    public static void main(String[] args) {
        // Make an if statement that triggers a print or println statement
        boolean snowing = true;
        
        if (snowing) {
            System.out.println("Ooo! Chilly! Time for some hot chocolate!");
        }
        // Make an if, else statement where the else statement triggers a print or println statement
        int sleepHours = 9;
        if (sleepHours < 8) {
            System.out.println("You must so tired... Head to bed early tonight!");
        } else {
            System.out.println("Good job getting more than 8 hours! Keep it up!");
        }
        // Make an if, else if, else statement where the else if statement triggers a print or println statement
        String favoriteGame = "legendOfZelda";
        if (favoriteGame == "marioKart") {
            System.out.println("MarioKart is a great game, my favorite is MarioKart 8!");
        } else if (favoriteGame == "pokemon") {
            System.out.println("Oh nice! Pokemon is great! Water starters for life!");
        } else {
            System.out.println("Hmmm... No Mario or Pokemon? I hope your fav is Zelda because if not I am judging you >:(");
        }
        // Make 2 variables and use them in an if else conditional print from one of the sections
        int num1 = 100;
        int num2 = 500;
        if (num1 < num2) {
            System.out.println("Looks like your first number is smaller!");
        } else {
            System.out.println("Looks like your second number is bigger!");
        }
        // Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        int oddNumber = 3;
        int evenNumber = 8;

        if (oddNumber == 3 && evenNumber == 8){
            System.out.println("Oh nice! The numbers were right!");
        } else {
            System.out.println("Boooo! Wrong!");
        }
        
        // Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
        num1 = 5;
        num2 = 90;

        if (num1 == 5 || num2 == 5){
            System.out.println("Looks like one of these numbers equals 5!");
        } else {
            System.out.println("None of these numbers equal 5 :(");
        }
        
    }
}
