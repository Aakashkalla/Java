public class OOP4 {
    public static void main(String[] args) {
        Data obj = new Data(23, "Aakash");
        System.out.println(obj.name + " " + obj.age);
        System.out.println(obj.getAge());

        obj.setAge(21);
        System.out.println(obj.getAge());
    }
}
