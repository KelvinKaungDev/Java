package Node;

public class NodeDriver {
    public static void main(String[] args) {

        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(7);

        node1.setNext(node2);
        node2.setNext((node3));

        Node myList = node2;

        while(myList != null){
            System.out.print(myList.getData() + " ");
            myList = myList.getNext();
        }

    }
}

