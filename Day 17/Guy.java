public class Guy implements Cloneable{
    int age;
    String name;

    public Guy(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
