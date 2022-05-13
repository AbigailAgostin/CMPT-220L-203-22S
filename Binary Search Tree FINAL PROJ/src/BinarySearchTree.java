class BinarySearchTree {
	
	Node root;
	
	public BinarySearchTree() {
		this.root = null;
	}
	
	public void postOrder(Node node) {
		if (node != null) {
			postOrder(node.leftChild);
			postOrder(node.rightChild);
			System.out.print(node.data + " ");
		}
	}
		
	void inOrder(Node node) {
		if (node == null)
			return;
		inOrder(node.leftChild);
		System.out.print(node.data + " ");
		inOrder(node.rightChild);
	}
	
	void preOrder(Node node) {
		if (node == null)
			return;
		System.out.print(node.data + " ");
		preOrder(node.leftChild);
		preOrder(node.rightChild);
	}	
	
	public int searchNthMax() {
		return 1;
	}
	
	public Node delete(Node node, int value) {
		if (node == null) {
			return node;
		}
		
		if(value < node.data) {
			node.leftChild = delete(node.leftChild, value);
			
		} else if(value > node.data) {
			node.rightChild = delete(node.rightChild, value);
			
		} else {
			if(node.leftChild == null) {
				return node.rightChild;
			}
			else if(node.rightChild == null) {
				return node.leftChild;
			}
			
			node.data = searchMin(node.rightChild);
			node.rightChild = delete(node.rightChild, node.data);
				
				}
		return node;
	}
				/*
			
			} else {
				Node successor = getSuccessor(node);
				node.data = successor.data;
				
				node.rightChild = delete(node.rightChild, 4);
				return node;
					
			}
		}
		return node;
	}
	/*get in order etc, the n call in main
	
	public Node getSuccessor(Node node) {
		if(node == null) {
			return null;
		}
		Node temp = node.rightChild;
		
		while(temp != null) {
			temp = temp.leftChild;
		}
		
		return temp;
	}
	*/
	
	public int searchMin(Node node) {
		int min = node.data;
		while(node.leftChild != null) {
			min = node.leftChild.data;
			node = node.leftChild;
		}
		return min;
	}
	
	public int searchMax(Node node) {
		int max = node.data;
		while(node.rightChild != null) {
			max = node.rightChild.data;
			node = node.rightChild;
		}
		return max;
	}

	
	
	public Node search4Node(Node node, int value) {
		if(node == null || node.data == value) {
			return node;
		}
		if (node.data > value) {
			return search4Node(node.leftChild, value);
		}
		return search4Node(node.rightChild, value);
	}
	
	public int calcHeight(Node node)
	{
		if (node == null)
			return -1;
		else
		{
			int left = calcHeight(node.leftChild);
			int right = calcHeight(node.rightChild);
			
			if (left > right)
				return (left + 1);
			else
				return (right + 1);
		}
	}
	
	public Node insert(Node root, Node n) {
		if(root == null) {
			root = n;
			return root;
		}
		
		if(n.data < root.data) {
			root.leftChild = insert(root.leftChild, n);
		} else if(n.data > root.data) {
			root.rightChild = insert(root.rightChild, n);
		}
		return root;
	}
	
}	