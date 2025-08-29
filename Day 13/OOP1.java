public class OOP1 {
    public static void main(String[] args){
        Student aakash = new Student();
        Student anthony = new Student("Anthony", 19,86.5f);

        aakash.greet();
        anthony.greet();

        System.out.println(aakash.rollno);
        System.out.println(aakash.name);
        System.out.println(aakash.marks);

        System.out.println(anthony.rollno);
        System.out.println(anthony.marks);
        System.out.println(anthony.name);
    }    
}

class Student{
    String name;
    int rollno;
    float marks;

    void greet(){
        System.out.println("Hey! My name is " + this.name);
    }

    Student(){
        this.name = "Aakash";
        this.rollno = 21;
        this.marks = 90.54f;
    }

    Student(String name, int rollno, float marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
}
