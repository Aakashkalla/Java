public class PrimeNumber {
    public static void main(String[] args){
        int n = 20;
        boolean[] primes = new boolean[n+1];
        // System.out.println(isPrime(n));
        sieve(n, primes);
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c * c <=n){
            if(n % c==0){
                return false;
            }
            c++;
        }
        return true;
    }
    static void sieve(int n , boolean[] primes){
        for(int i = 2;i*i<=n;i++){
            if(!primes[i]){
                for(int j = i*2;j<=n;j+=i){
                    primes[i] = true;
                }
            }
        }

        for(int i = 2; i<=n;i++){
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
