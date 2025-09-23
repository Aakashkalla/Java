public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(8);
        list.insertFirst(6);
        list.insertFirst(4);
        list.insertFirst(2);
        list.display();
        list.reverse();
        list.insertLast(10);
        list.display();
        list.reverse();
        list.insert(10, 12);
        list.display();
        list.reverse();

        CircularLinkedList clist = new CircularLinkedList();
        clist.insertFirst(10);
        clist.insertFirst(9);
        clist.insertFirst(11);
        clist.display();
        clist.delete(9);
        clist.display();
    }
}
