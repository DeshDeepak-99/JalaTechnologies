public class Program_2 {
    public static void main(String args[]){
        int[] array = {10, 20, 30, 40, 50, 10};
        int sum = 0;
        //Advanced for loop
        for( int num : array) {
            sum = sum+num;
        }
        int avg = sum / array.length ;
        System.out.println("Sum of array elements is:"+avg);
     }
}
