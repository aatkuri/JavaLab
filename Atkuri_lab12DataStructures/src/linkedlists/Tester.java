package linkedlists;

/**
 * @author Ashok Atkuri
 */
public class Tester {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Atkuri_ALinkedList<Integer> intList = new Atkuri_ALinkedList<>();

        intList.addFirst(17);
        intList.addFirst(25);
        intList.addFirst(47);
        intList.removeFirst();
        intList.addFirst(55);

        System.out.println("Contents of linked list\n"
                + (intList.isEmpty() ? "list is empty" : intList));

        while (!intList.isEmpty()) {
            System.out.println("Deleting " + intList.removeFirst());
        }
        System.out.println();
        System.out.println("Contents of linked list\n"
                + (intList.isEmpty() ? "list is empty" : intList));
    }
}
