public class Main {
    public static void main(String[] args) {
        CustomLL list = new CustomLL();
        list.insertFirst(9);
        list.insertFirst(7);
        list.insertFirst(5);
        list.insertFirst(3);
        list.insertLast(11);
        list.insertFirst(1);
        list.insertLast(13);
        list.insert(15,7);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(1));
        list.display();
    }
}
