public class OOP3 {
    public static void main(String[] args) {
        BoxWeight box = new BoxWeight(2.1, 23.2, 2.332, 1.34);
        BoxWeight box1 = new BoxWeight();
        System.out.println(box.h + " " + box.w + " " + box.weight +  " " + box.l);
        System.out.println(box1.h + " " + box1.w + " " + box1.weight +  " " + box1.l);
        box.information();
        box1.information();

        BoxCost box2 = new BoxCost(1.2, 2.3, 43.5, 345, 3433);
        BoxCost box3 = new BoxCost();
        System.out.println(box2.h + " " + box2.cost + " " + box2.l + " " + box2.w + " " + box2.weight);
        System.out.println(box3.h + " " + box3.cost + " " + box3.l + " " + box3.w + " " + box3.weight);
        
        box2.information();
        box3.information();
    }    
}
