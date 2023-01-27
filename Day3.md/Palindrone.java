public class palindrone 
{
    static boolean palin(int n)
    {
        int rev=0;
        int temp=n;
        while(temp>0)
       {
            int last=temp%10;
            temp=temp/10;
            rev=rev*10 + last;
        }
        return (rev==n);
    }
    public static void main(String args[]){
        int number=3243;
        System.out.println(palin(number));
    }
}
