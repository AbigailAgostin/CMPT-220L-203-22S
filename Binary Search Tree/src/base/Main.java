import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        System.out.println("Enter one of the following options:");
        System.out.println("1) List Elements");
        System.out.println("2) Insert Nodes ");
        System.out.println("3) Remove Nodes");
        System.out.println("4) Search for Nodes");
        System.out.println("5) Find Height of Tree");
        System.out.println("6) Find Smallest Element ");
        System.out.println("7) Find Largest Element ");
        System.out.println("8) Find Nth Largest Element");

        Scanner answer = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter 122");
        int userChoice = answer.nextInt();

        while (userChoice != 8) {
            if (userChoice < 1 || userChoice > 9) {

                System.out.println("Enter a number 1 through 8");
                userChoice = answer.nextInt();

            }
            else if (userChoice == 1) {
            }
            else if (userChoice == 2) {
            }
            else if (userChoice == 3) {
            }
            else if (userChoice == 4) {
            }
            else if (userChoice == 5) {
            }
            else if (userChoice == 6) {
            }
            else if (userChoice == 7) {
            }
            else if (userChoice == 8) {
        }


    }

