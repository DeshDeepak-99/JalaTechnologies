public class Program_5 {
    public static void main(String[] args) {
        int a = 3 , b=5 , c = 8 ;
    System.out.println((b > a) && (c > b)); 
    System.out.println((b > a) && (c < b));  

    // || operator
    
    System.out.println((b > a) || (c < b));  
    System.out.println((b < a) || (c < b));  

    // ! operator
    System.out.println(!(b == a));  
    System.out.println(!(b > a));  
    }
}
