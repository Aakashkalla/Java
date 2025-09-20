public class Guys {
    public static void main(String[] args) throws CloneNotSupportedException {
        Guy aakash = new Guy(21, "Aakash");
        Guy twin = (Guy)aakash.clone();
        System.out.println(twin.age);
        System.out.println(twin.name);
        System.out.println(aakash.name);
        System.out.println(aakash.age);
    }

}
