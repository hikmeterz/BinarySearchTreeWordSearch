
public class Node {
	
	private String data;
	private Node left;
	private Node right;
	
	
	public Node(String data){
		
		this.right=null;
		this.left=null;
		this.data=data;
		
	}
	
	public String getValue(){
		
		return this.data;
	}
	
	public Node getLeft() {
		
		
		return this.left;
	}
	
	public Node getRight() {
		
		
		return this.right;
	}
	public void setRight(Node right) {
		this.right=right;
		
		
	}
	public void setLeft(Node left) {
		this.left=left;
		
		
	}
	
	public void setValue(String value) {
		this.data=value;
		
	}	
	

}
