}/** 
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
        int num = 1234543217;
        System.out.println(ifPrime(num));

    }
} 
*/

//OPTIMISED SOLUTION FOR CHECKING PRIME NUMBER

public class prime{
    static boolean ifPrime(int num){
        if(num==1)
            return false;
        if(num==2 || num==3)
            return true;    
        if(num%2==0 || num%3==0)
            return false;
        for(int i=5; i*i<num; i=i+6){
            if(num%1==0 || num%(i+2)==0)
                return false;
        }    
        return true;
    }
    public static void main(String args[]){
        int num = 1234543217;
        System.out.println(ifPrime(num));
    }
}
