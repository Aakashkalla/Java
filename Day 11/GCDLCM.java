public class GCDLCM {
    public static void main(String[] args){
        System.out.println(gcd(560,87650));
        System.out.println(lcm(67, 908));
    }
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
}
