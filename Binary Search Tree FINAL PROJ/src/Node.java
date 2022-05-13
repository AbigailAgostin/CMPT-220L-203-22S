//creating node class and initailzing variables as thier respective data types etc.
class Node {
	int data;
	Node leftChild;
	Node rightChild;
	Node parent;

    //Constructor creation
    public Node(int data) {
        this.data = data;
        //parent and children should be null
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;

    }
    
}
