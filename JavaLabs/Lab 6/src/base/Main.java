package base;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {
    /**
     * # Lab Six
     * ---
     *
     * For this lab we're going to be messing around with our Linear Data Types,
     * as well as creating a plant Object!
     *
     * Our Goals are:
     * - Creating an Array
     * - Creating an ArrayList
     * - Creating an LinkedList
     * - Creating an Queue
     * - Creating an Stack
     * - Create a Plant
     *
     * Please show the ability to:
     * - Create these data types
     * - Populate the data types
     * - Print out the Linear Data Types
     */
    public static void main(String[] args) {
        // Create an Array, Populate it, and Print it out
        // Create an ArrayList, Populate it, and Print it out
        // Create an LinkedList, Populate it, and Print it out
        // Create an Queue, Populate it, and Print it out
        // Create an Stack, Populate it, and Print it out
        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        

        //Array Stuff
        int[] oddNums = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        System.out.println("Here are some odd numbers:");
        for (int i = 0; i < oddNums.length; i++){
            System.out.println(oddNums[i]);
        }
        

        //ArrayList Stuff
        ArrayList<String> iceCream = new ArrayList();
        ArrayList<String> flavors = new ArrayList(Arrays.asList("Mint Chocolate", "Vanilla", "Chocolate", "Cookie Dough", "Cookies&Cream"));

        for (int i = 0; i < flavors.size(); i++){
            System.out.println(flavors.get(i));
        }

        //LinkedList Stuff
        LinkedList<String> states = new LinkedList<String>();

        states.add("Alabama");
        states.add("Alaska");
        states.add("Arizona");
        states.add("California");
        states.add("Delaware");
        states.add("Hawaii");
        states.add("Idaho");
        states.add("Kansas");
        states.add("Ohio");

        System.out.println(states);


        //Queue Stuff

        Queue<String> myFriends = new LinkedList<String>();
        myFriends.add("Ava");
        myFriends.add("Gianna");
        myFriends.add("Andre");
        myFriends.add("Kai");
        myFriends.add("Kendall");
        myFriends.add("Mattie");

        System.out.println(myFriends);

        //Stack

        Stack<String> videoGames = new Stack<String>();

        videoGames.push("The Legend of Zelda");
        videoGames.push("Mario");
        videoGames.push("Mario Kart");
        videoGames.push("Fortnite");
        videoGames.push("Minecraft");
        videoGames.push("Smash Bros");

        System.out.println(videoGames);

        //Plant Stuff
        Plant daisy = new Plant(true, "flower", "daisy");
        daisy.wateringInstruction();
        daisy.sunlightRequirments();

    }
}