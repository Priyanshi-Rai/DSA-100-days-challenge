public class prime {
    static boolean ifPrime(int n){
        if(n==1)
            return false;
        for(int i=2;i*i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    } 
    public static void main(String args[]){
        int num = 4;
        System.out.println(ifPrime(num));

    }
}
