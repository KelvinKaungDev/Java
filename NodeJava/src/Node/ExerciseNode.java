package Node;

public class ExerciseNode {

	private int data;
	private Node next;
	
	public ExerciseNode() {
		this.data = -1;
		this.next = null;
	}
	
	public ExerciseNode(int data) {
		this.data = data;
		this.next = null;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
