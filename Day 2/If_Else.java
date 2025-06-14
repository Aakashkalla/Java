import java.util.*;
public class If_Else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = input.nextInt();
        if(salary>20000){
            salary+=2000;
        }
        else if(salary>10000){
            salary+=1000;
        }
        else{
            salary+=500;
        }
        System.out.println("Your salary with BONUS is: " + salary);
        input.close();
    }
}
