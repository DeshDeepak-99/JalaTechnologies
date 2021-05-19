import java.util.*;

public class Program_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int temp , pal = 0 , N = x;
        while(x>0){
            temp = x%10 ;
            x= x/10 ;
            pal = pal *10 + temp ;
        }
        if(pal == N){
            System.out.print(N+" is palindrome");
        }
        else{
            System.out.print(N+" is not palindrome");
        }
    }
}
