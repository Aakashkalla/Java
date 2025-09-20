public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 7;
        int b = 0;
        try{
            // int c = a/b;
            // System.out.println(c);
            divide(a, b);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Finally Block");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please Dont Divide By Zero");
        }
        return a/b;
    }
}
