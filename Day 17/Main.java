public class Main {
    public static void main(String[] args) {
        Student1 s1 = new Student1( 1, 22f);
        Student1 s2 = new Student1( 2, 23f);

        if(s1.compareTo(s2)<0){
            System.out.println("S2 has more marks");
        }
    }
}   
