
import java.util.Scanner;

public class Main {
	
	
    public static void main(String[] args) {
    	
    	//How to make objects, creating instance of BST
    	BinarySearchTree BST = new BinarySearchTree();
    	//Node n = new Node(10);
    	
        Scanner answer = new Scanner(System.in);
        int userChoice = 0;
        
        System.out.println("BINARY TREE CENTER");
        while (userChoice != 9) {
        	
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
            System.out.println("Please enter a number option: ");
        	userChoice = answer.nextInt();
        	
            if (userChoice == 1) {
            	//Menu continues and calls the  function
            	System.out.println("Which kind of order would you like?");
            	System.out.println("1)Pre Order");
            	System.out.println("2)In Order");
            	System.out.println("3)Post Order");
            	int orderChioce = answer.nextInt();
            	
            	if (orderChioce == 1) {
	            	// PreOrder Traversal
	            	System.out.println("[PreOrder Traversal]"); 
	            	BST.preOrder(BST.root);             	}   
	            if (orderChioce == 2) {    
	                //InOrder Traversal
	                System.out.println("[InOrder Traversal]"); 
	                BST.inOrder(BST.root); 	            }
	            if (orderChioce == 3) {
	                //PostOrder Traversal
	                System.out.println("[PostOrder Traversal]"); 
	                BST.postOrder(BST.root); 
	            } 
            }
            else if (userChoice == 2) {
            	//Menu continues and calls the insert function
            	System.out.println("Please enter the number you want inserted: ");
            	int userInputNum = answer.nextInt();
            	Node n = new Node(userInputNum);
            	BST.root = BST.insert(BST.root, n);
            	System.out.println("Number has been inserted!");
            	System.out.println();
            	
            }
            else if (userChoice == 3) {
            	//Menu continues and calls the delete function
            	System.out.println("Please enter the number you want to delete: ");
            	int userDeleteNum = answer.nextInt();
            	BST.delete(BST.root, userDeleteNum);
            	System.out.println("Number has been deleted!");
          
            }
            else if (userChoice == 4) {
            	//Menu continues and calls the searching function
            	System.out.println("Please enter the number you want to search for: ");
            	int userSearchNum = answer.nextInt();
            	Node found = BST.search4Node(BST.root, userSearchNum);
            	
            	if (found != null) {
            		System.out.println("This value was found in the binary search tree!");
            	} else {
            		System.out.println("Unable to find in binary search tree.");            	}
            }
            else if (userChoice == 5) {
            	//Menu continues and calls the finding height function
            	System.out.println();
            	System.out.println(BST.calcHeight(BST.root));
            	System.out.println("^ This is the height of the binary search tree");
            	
            }
            else if (userChoice == 6) {
            	//Menu continues and calls the find smallest function
            	System.out.println(BST.searchMin(BST.root));
            	System.out.println("^ This is the smallest number in the tree");
            }
            else if (userChoice == 7) {
            	//Menu continues and calls the largest function
            	System.out.println(BST.searchMax(BST.root));
            	System.out.println("^ This is the largest number in the tree");
            }
            else if (userChoice == 8) {
            	//Menu continues and calls the search Nth largest function
            	
            	BST.searchNthMax();
            	
            }
            /*
            else {
            	System.out.println("Enter a number 1 through 8");
                userChoice = answer.nextInt();
            } */


    }
    }
}