import java.util.*;

class fibonacci
{
    static int fib(int n)
    {
        //base case
        if(n==0 || n==1)
            return n;
 //recursive call
        return fib(n-1)+fib(n-2);    
    }


//driver code

public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of series to print :- ");
    int num= sc.nextInt();
    for(int i=0;i<num;i++)
    {
        System.out.println(fib(i) + " "); 
    }
}
}

/*Time Complexity: O(2^N)  
Auxiliary Space: O(1) or theta(n)*/

//hiii baby