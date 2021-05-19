import java.util.*;

public class Program_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int N ;
        if(x%2==0){
            N =1 ;
        }
        else{
            N = 2 ;
        }
        switch(N){

            case 1 :
            System.out.println(x+" is even");
            break ;
            case 2 :
            System.out.println(x+" is not even");
            break ;
        }
    }
}
