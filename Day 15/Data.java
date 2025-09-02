public class Data {
    int[] arr;
    int age;
    String name;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Data(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[age];
    }
}
