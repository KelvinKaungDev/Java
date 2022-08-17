package Node;

public class ListDriver {
    public static void main(String[] args) {

        UnorderList myList1 = new UnorderList();
        myList1.insert(1);
        myList1.insert(3);
        myList1.insert(7);

        System.out.println(myList1.toString());
        System.out.println(myList1.find(7));
        System.out.println(myList1.find(3));
        System.out.println(myList1.find(1));
        System.out.println(myList1.find(9));
        System.out.println(myList1.getFirstItem());

    }
}
