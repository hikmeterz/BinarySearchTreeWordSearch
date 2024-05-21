
public class BinarySearchTree {
	
	private Node root;
	private static int count;
	
	
	public BinarySearchTree(){
		
		root=null;
		
	}
	
	public Node getRoot() {
		return this.root;
	}
	
	private Node addRecursive(Node current, String value) {
	    if (current == null) {
	        return new Node(value);
	    }
	 
	    if (value.compareTo(current.getValue())<0){//value < current.getValue()) {
	        current.setLeft(addRecursive(current.getLeft(), value));
	    }else if (value.compareTo(current.getValue())>0) {//value > current.getValue() ) {
	        current.setRight(addRecursive(current.getRight(), value));
	    }else {
	        return current;
	    }
	 
	    return current;
	}
	public void add(String value) {
	    root = addRecursive(root, value);
	}

	public void traverseInOrderandPrintKthElement(Node node,int x) {//Normalde inorder seklinde bastirilinca sirali bir sekilde agaci gezmis oluyor.
	    
		if (node == null)  
	        return;  
	    
	    if (count <= x) {  
	        traverseInOrderandPrintKthElement(node.getLeft(), x);  
	        count++;  
	        if (count == x)  
	            System.out.println(node.getValue());  
	    
	        traverseInOrderandPrintKthElement(node.getRight(),x);  
	    } 
	    	
	}
	
	
	
	
	
}
