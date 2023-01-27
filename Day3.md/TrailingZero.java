//Trailing zero in factorial 

public class trailingZero 
{
    static int zero(int n)
    {
        int result=0;
        for (int i=5;i<=n;i=i*5){
            result= result + n/i ;
        }
        return result;
    }   
public static void main (String args[])
{
    int num=632;
    System.out.println(zero(num));
}
}

// Time Complexity : log n;


/* APPROACH: 
   A zero is formed with the combination of 2 and 5. In the factorial of any number no. of 2's > no. of 5's
   therefore ignoring 2 and selecting 5 to check the zeroes.
   floor(n/5)= it's only valid when digit have atleast one 5 prime factor.
   Now we need to consider the case of 25,125,625 etc.
   So, Trailing zero count=  ⌊n/5⌋ +  ⌊n/25⌋ +  ⌊n/125⌋.....   
*/
