    import java.util.*;
public class Program_9   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int count = 2 ; 
        for(int i=2 ; i < x ; i++){
            if(x%i == 0){
                count++ ;
            }
        }
        if(count>2){
            System.out.println(x+" is not prime");
        }
        else{
            System.out.println(x+" is prime");
        }
    }
}
