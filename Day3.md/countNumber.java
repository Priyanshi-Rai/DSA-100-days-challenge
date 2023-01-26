import java.util.Scanner;

public class countNumber {
    static int count(int x){
        int r=0;
        while(x>0){
            x=x/10;
            r++;
        }
        return r;
    }
//driver call
public static void main(String args[]){
    int num = 123456;
    System.out.println(count(num));
    }
}    
