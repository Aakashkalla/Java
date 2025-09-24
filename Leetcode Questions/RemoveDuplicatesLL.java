class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveDuplicatesLL {
    public static void main(String[] args) {
        ListNode node = new ListNode();
        while(node.next!=null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }        
    }
}
