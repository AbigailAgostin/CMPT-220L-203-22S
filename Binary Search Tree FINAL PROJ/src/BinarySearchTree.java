//BST class creation finally
class BinarySearchTree {
	
	//Claim root as a Node
	Node root;
	
	//Sets root to null with constructor
	public BinarySearchTree() {
		this.root = null;
	}
	
	//All three of the order types have thier own function
	public void postOrder(Node node) {
		//If the node has any value, then go left right print
		if (node != null) {
			//Calls specific postOrder
			postOrder(node.leftChild);
			postOrder(node.rightChild);
			System.out.print(node.data + " ");
		}
	}
		
	void inOrder(Node node) {
		//If the node has any value, then go left print right
		if (node == null)
			return;
		//Calls specific inOrder
		inOrder(node.leftChild);
		System.out.print(node.data + " ");
		inOrder(node.rightChild);
	}
	
	void preOrder(Node node) {
		//If the node has any value, then go print left right
		if (node == null)
			return;
		//Calls specific preOrder
		System.out.print(node.data + " ");
		preOrder(node.leftChild);
		preOrder(node.rightChild);
	}	
	
	public int searchNthMax() {
		return 1;
	}
	
	//Delete Class, accepts node and value 
	public Node delete(Node node, int value) {
		//If it's equal to nothing, just straight return it
		if (node == null) {
			return node;
		}
		//If it's less than the data, delete left side
		if(value < node.data) {
			node.leftChild = delete(node.leftChild, value);
		//If it's greater than the data, delete right side
		} else if(value > node.data) {
			node.rightChild = delete(node.rightChild, value);

		//If anything else straight return the right and left nodes
		} else {
			if(node.leftChild == null) {
				return node.rightChild;
			}
			else if(node.rightChild == null) {
				return node.leftChild;
			}
			//Finding the smallest and deleting
			node.data = searchMin(node.rightChild);
			node.rightChild = delete(node.rightChild, node.data);
				
				}
			//Final return
		return node;
		}

	//Searching for smallest function 
	public int searchMin(Node node) {
		//Make variable and set to node
		int min = node.data;
		//For as long as left is not 0, set the smallest to the min value until there is nothing smaller
		while(node.leftChild != null) {
			min = node.leftChild.data;
			node = node.leftChild;
		}
		//Return what remains after loop
		return min;
	}
	//Searching for max function
	public int searchMax(Node node) {
		int max = node.data;
		//For as long as right is not 0, sets the largest to the max value until there is nothing larger
		while(node.rightChild != null) {
			max = node.rightChild.data;
			node = node.rightChild;
		}
		//Return what remains after loop
		return max;
	}

	
	//Searching function, accepts node and value
	public Node search4Node(Node node, int value) {
		if(node == null || node.data == value) {
			return node;
		}
		//Data bigger than value return RIGHT
		if (node.data > value) {
			return search4Node(node.leftChild, value);
		}//Otherwise return LEFT
		return search4Node(node.rightChild, value);
		//Main function will decide what message the user sees
	}
	
	//Height function, accepts only node
	public int calcHeight(Node node)
	{
		//If its just the root, there isn't a height
		if (node == null)
			return -1;
			//If there IS, then go forward to calculate the height
		else
		{
			//New variables for left and right children 
			int left = calcHeight(node.leftChild);
			int right = calcHeight(node.rightChild);
			
			//Acts as a counter, if the left is greater than the right then add to height etc.
			//Returns height
			if (left > right)
				return (left + 1);
			else
				return (right + 1);
		}
	}
	
	//Insert Node, accepts node and n
	public Node insert(Node root, Node n) {
		if(root == null) {
			root = n;
			return root;
		}
		
		//Adding everything into tree, if it's less than data send to the left of node
		if(n.data < root.data) {
			root.leftChild = insert(root.leftChild, n);
		//If it's greater, send it to the right of node in the tree
		} else if(n.data > root.data) {
			root.rightChild = insert(root.rightChild, n);
		}
		//Returns
		return root;
	}
	
}	