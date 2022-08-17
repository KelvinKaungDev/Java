package ExerciseNode;

public class ExerciseNodeDriver {

	public static void main(String[] args) {
		
		ExerciseNode node1 = new ExerciseNode(1);
		ExerciseNode node2 = new ExerciseNode(4);
		
		node1.setNext(node2);
		
		ExerciseNode current = node1;
		
		while(current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}

	}

}
