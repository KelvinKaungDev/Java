package ExerciseNode;

public class ExerciseNode {

	private int data;
	private ExerciseNode next;
	
	public ExerciseNode() {
		this.data = -1;
		this.setNext(null);
	}
	
	public ExerciseNode(int data) {
		this.data = data;
		this.setNext(null);
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

	public ExerciseNode getNext() {
		return next;
	}

	public void setNext(ExerciseNode next) {
		this.next = next;
	}
}
