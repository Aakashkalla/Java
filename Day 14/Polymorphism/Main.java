package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes shape1 = new Circle();
        

        shape1.area();
        circle.area();
        square.area();
        shape.area();
    }
}
