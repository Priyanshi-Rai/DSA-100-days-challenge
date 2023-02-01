public class countSetBit{
    static int count(int n){
        int count = 0;
        while(n>0)
        {
            if (n%2==1){
                count++;;
            }
           n=n/2;
        }
    return count;    
}
    public static void main(String args[]){
        int num=7;
        System.out.println(count(num));
    }
}
