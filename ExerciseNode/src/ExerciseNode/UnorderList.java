package ExerciseNode;

public class UnorderList {
	
	private ExerciseNode head;

	public UnorderList() {
		this.head = null;
	}
	
	public Boolean isEmpty() {
		if(this.head != null) {
			return false;
		} else {
			return true;
		}
	}
	
	public Boolean insert(int data) {
		ExerciseNode newNode = new ExerciseNode(data);
		
		if(isEmpty()) {
			this.head = newNode;
		} else {
			ExerciseNode current = this.head;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
		}
		
		return true;
	}

}
