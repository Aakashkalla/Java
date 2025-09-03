public class Main {
    public static void main(String[] args) {
        Child son = new Child();
        Child daughter = new Child();

        son.career("Coder");
        daughter.career("Doctor");

        Car car = new Car();
        car.start();
        car.stop();
        car.acc();
        car.brake();
    }
}
