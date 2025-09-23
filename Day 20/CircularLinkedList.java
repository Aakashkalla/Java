public class CircularLinkedList {
    
    private Node head;
    private Node tail;

    public CircularLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node node = head;
        if(node==null){
            System.out.println("List is Empty");
        }
        if(head!=null){
            do{
                System.out.print( node.val + " -> ");
                node = node.next;
            }while(node!=head);
        }
        System.out.println("HEAD");
    }

    public void delete(int val){
        Node node = head;
        if(node==null){
            return;
        }
        if(node.val==val){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node del = node.next;
            if(del.val==val){
                node.next = del.next;
                break;
            }
            node = node.next;
        }while(node!=head);
    }

    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }
}
