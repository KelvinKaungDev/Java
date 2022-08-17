package Node;

public class UnorderList {

    private Node head;

    public UnorderList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean insert(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        return true;
    }

    public boolean delete() {
        if (isEmpty()) {
            return false;
        } else {
            head = head.getNext();
            return true;
        }
    }

    public int count() {
        int counter = 0;
        Node current = head;
        while (current != null) {
            counter += 1;
            current = current.getNext();
        }
        return counter;
    }

    /**
     *
     * @Check f the item is in the list
     * @param item
     * @return the index of the item, -1 is returned if the item is not there
     */

    public int find(int item) {
        int i = 0;
        Node current = head;
        while (current.getData() != item) {
            if (current.getNext() == null) {
                return -1;
            } else {
                current = current.getNext();
                i++;
            }
        }
        return i;
    }

    /**
     *
     * @return the value of the first item, -1 is returned if the list is empty.
     */
    public int getFirstItem() {
        if (isEmpty()) {
            return -1;
        } else {
            return head.getData();
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[ ");
        Node current = head;
        while (current != null) {
            result.append(current.getData());
            result.append(" ");
            current = current.getNext();
        }
        result.append("]");
        return result.toString();
    }
}
