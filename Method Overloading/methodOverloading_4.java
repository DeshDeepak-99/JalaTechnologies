class Adder3{  
    static int add(int a,int b){return a+b;}  
    static double add(Double a,Double b){return a+b;}  
    }  
    class TestOverloading4{  
    public static void main(String[] args){  
    System.out.println(Adder3.add(11,11));  
    System.out.println(Adder3.add(11.4,11.6));  
    }} 