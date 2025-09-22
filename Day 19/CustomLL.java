public class CustomLL {
        private Node head;
        private Node tail;

        private int size;

        public CustomLL(){
            this.size = 0;
        }

        public void insertFirst(int val){
            Node node = new Node(val);
            node.next = head;
            head = node;

            if(tail==null){
                tail = head;
            }

            size +=1;
        }

        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }

            System.out.println("END");
        }

        public void insert(int value, int index){
            if(index==0){
                insertFirst(value);
                return;
            }
            if(index==size){
                insertLast(value);
                return;
            }
            
            Node temp = head;
            for(int i = 1;i<index;i++){
                temp = temp.next;
            }

            Node newNode = new Node(value, temp.next);
            temp.next = newNode;
            size++;
        }

        public void insertLast(int value){
            if(tail==null){
                insertFirst(value);
                return;
            }
            Node node = new Node(value);
            tail.next = node;
            tail = node;
            size++; 
            
        }

        public int deleteFirst(){
            int val = head.value;
            head = head.next;
            if(head==null){
                tail=null;
            }
            size--;
            return val;
        }

        public Node get(int index){
            Node node = head;
            for(int i = 0; i<index; i++){
                node = node.next;
            }
            return node;
        }

        public int deleteLast(){
            if(size<=1){
                return deleteFirst();
            }
            // Node secondLast = get(size-2);
            int value = tail.value;
            tail = get(size-2);
            tail.next = null;
            size--;
            return value;
        }

        public int delete(int index){
            if(index==0){
                return deleteFirst();
            }
            if(index==size-1){
                return deleteLast();
            }
            Node prev = get(index-1);
            int val = prev.next.value;
            prev.next = prev.next.next;
            return val;
        }

        public Node find(int value){
                Node node = head;
                while(node!=null){
                    if(node.value==value){
                        return node; 
                    }
                    node = node.next;
                }
                return null;
        }
    
        private class Node{
            private int value;
            private Node next;

            public Node(int value){
            this.value = value;
            }

            public Node(int value, Node next){
                this.value = value;
                this.next = next;
            }
    }

    
}
