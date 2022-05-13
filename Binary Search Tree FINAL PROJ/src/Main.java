//Abigail Agostin
//Prof. Kippins
//Software Dev 1
//5/13/22
//___________________________________________


//Gotta import that Scanner for user input
import java.util.Scanner;

public class Main {
	
	//Set up main public static void 
    public static void main(String[] args) {
    	
    	//How to make objects, creating instance of BST
    	BinarySearchTree BST = new BinarySearchTree();
    	//Node n = new Node(10);
    	
		//Menu allowing for new input & initializing userChioce variable
        Scanner answer = new Scanner(System.in);
        int userChoice = 0;
        
		//Fun little overall label for this program
        System.out.println("BINARY TREE CENTER");
		//Setting up loop to only allow user input for these specific numbers
        while (userChoice != 9) {
        	
			//List of all the possible chioces for the user in the menu
        	System.out.println();
        	System.out.println("Choose one of the following options:");
            System.out.println("1) List Elements");
            System.out.println("2) Insert Nodes ");
            System.out.println("3) Remove Nodes");
            System.out.println("4) Search for Nodes");
            System.out.println("5) Find Height of Tree");
            System.out.println("6) Find Smallest Element ");
            System.out.println("7) Find Largest Element ");
            System.out.println("8) Find Nth Largest Element");
        	System.out.println();
			//Actual prompt for user input
            System.out.println("Please enter a number option: ");
        	userChoice = answer.nextInt();
        	
			//Display Function, Allows user to see which elements are already in the binary search tree in whichever order they prefer
            if (userChoice == 1) {
            	//Menu continues and calls the  function
				//Prompt for user to choose which TYPE of search
            	System.out.println("Which kind of order would you like?");
            	System.out.println("1)Pre Order");
            	System.out.println("2)In Order");
            	System.out.println("3)Post Order");
            	int orderChioce = answer.nextInt();
            	
				//If statemnets for Pre/Post/In Order from user input
            	if (orderChioce == 1) {
	            	// PreOrder Traversal
	            	System.out.println("[PreOrder Traversal]"); 
					//Calls function from BST and returns the pre ordered numbers
	            	BST.preOrder(BST.root);             	}   
	            if (orderChioce == 2) {    
	                //InOrder Traversal
	                System.out.println("[InOrder Traversal]"); 
					//Calls function from BST and returns the in ordered numbers
	                BST.inOrder(BST.root); 	            }
	            if (orderChioce == 3) {
	                //PostOrder Traversal
	                System.out.println("[PostOrder Traversal]"); 
					//Calls function from BST and returns the post ordered numbers
	                BST.postOrder(BST.root); 
	            } 
            }
			//Insert Function, Allows user to choose which values are to be added to the binary tree
            else if (userChoice == 2) {
            	//Menu continues and calls the insert function
            	System.out.println("Please enter the number you want inserted: ");
            	int userInputNum = answer.nextInt();
				//Making user input into a node to then be passed to the insert function, and added to the BST
            	Node n = new Node(userInputNum);
            	BST.root = BST.insert(BST.root, n);
				//Confirmation message :)
            	System.out.println("Number has been inserted!");
            	System.out.println();
            	
            }
			//Delete Function, Allows user to specify and delete a specific value from the BST lineup
            else if (userChoice == 3) {
            	//Menu continues and calls the delete function
            	System.out.println("Please enter the number you want to delete: ");
				//Assigns the value that the user inputs and sends it to the delete function to delete from the BST
            	int userDeleteNum = answer.nextInt();
            	BST.delete(BST.root, userDeleteNum);
				//Confirmation message :)
            	System.out.println("Number has been deleted!");
          
            }
			//Search Function, Allows user to search for a user specified value to see if it's in the BST
            else if (userChoice == 4) {
            	//Menu continues and calls the searching function
            	System.out.println("Please enter the number you want to search for: ");
				//Assigns value inputed by user to a new variable, which sends it to the search function
				//If that number is found the messages below are displayed
            	int userSearchNum = answer.nextInt();
            	Node found = BST.search4Node(BST.root, userSearchNum);
            	
            	if (found != null) {
					//Positive confirmation message, if the value entered by user is NOT not in existance (aka in the tree) program will return affirmative message
            		System.out.println("This value was found in the binary search tree!");
            	} else {
					//Negative message, if the number IS null, (aka does not exist in tree), program returns negative message
            		System.out.println("Unable to find in binary search tree.");            	}
            }
			//Height Function, does NOT take user input, simply counts height of the BST
            else if (userChoice == 5) {
            	//Menu continues and calls the finding height function
            	System.out.println();
				//Calculating the height based off of that root node
            	System.out.println(BST.calcHeight(BST.root));
				//Display explaination message
            	System.out.println("^ This is the height of the binary search tree");
            	
            }
			//Min Function, no user input, searches through tree to find the smallest value
            else if (userChoice == 6) {
            	//Menu continues and calls the find smallest function
            	System.out.println(BST.searchMin(BST.root));
				//Displays explaination message
            	System.out.println("^ This is the smallest number in the tree");
            }
			//Max Function, no user input here, searches through BST to find the largest value
            else if (userChoice == 7) {
            	//Menu continues and calls the largest function
            	System.out.println(BST.searchMax(BST.root));
				//Explaination message
            	System.out.println("^ This is the largest number in the tree");
            }
            else if (userChoice == 8) {
            	//Menu continues and calls the search Nth largest function
            	
            	BST.searchNthMax();
            	
            }
            


    }
    }
}