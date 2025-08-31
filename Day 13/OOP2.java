public class OOP2 {
    static int a = 5;
    static int b = 6;
    public static void main(String[] args){
        Human aakash = new Human(20, "Aakash", 100000, false);
        Human aashish = new Human(21, "Aashish", 100000, false);
        Human shashi = new Human(22, "Shashi", 100000, false);

        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

        System.out.println(aakash.name + " " + aashish.name + " " + shashi.name);
        System.out.println(a+b);
        fun();  
    }

    static void fun(){
        OOP2 obj = new OOP2();
        System.out.println("HEY! LOL!");
        obj.greeting();
    }

    void greeting(){
        System.out.println("HEY LOL");
    }
}
