import java.util.*;

public class Program_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int temp ,sum =0 ;
        int N = x ;
        while(x>0){
            temp = x % 10 ;
            x = x/10 ;
            sum = sum + (temp*temp*temp);
        }
        if(sum == N){
            System.out.println(N+" is palindrome");
        }
        else{
            System.out.println(N+" is not palindrome");
        }
    }
}
