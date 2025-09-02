public class ObjectDemo {
    int age;
    float gpa;

    public ObjectDemo(int age, float gpa){
        this.age = age;
        this.gpa = gpa;
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(12,58.98f);
        ObjectDemo obj2 = new ObjectDemo(12,58.98f);

        if(obj1.equals(obj2)){
            System.out.println("Yes Obj1 and Obj2 are same");
        }
        else{
            System.out.println("No they are not same");
        }

        System.out.println(obj1.getClass());
    }
}
