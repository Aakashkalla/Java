public class Student1 implements Comparable<Student1> {
    int rollno;
    float marks;

    public Student1(int rollno, float marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student1 o) {
        int diff = (int)(this.marks - o.marks);

        // if diff == 0 : means both are equal
        // if diff < 0 : means o is bigger else o is smaller
        return diff;
    }

    
}
