//Factorial of a Number
// I/P : 4   O/P : 24

//Recursive method
public class factorial {
    static int fact(int n){
        if(n==1){
            return 1;
        }
      //recursive calling
        return n*fact(n-1);
    }
    public static void main(String args[]){
        int num= 10;
        System.out.println(fact(num));
    }
}

//Iterative method

public class factorial {
    static int fact(int n){
        int ans=1;
      //loop for each element less than n
        for(int i=1; i<=n ; i++){
            ans=ans*i;
        }
        return ans;
    }
    public static void main(String args[]){
        int num= 10;
        System.out.println(fact(num));
    }
}
