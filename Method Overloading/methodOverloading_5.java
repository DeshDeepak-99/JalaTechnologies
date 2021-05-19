class Adder4{  
    static int add(int a,int b){return a+b;}  
    static double add(int a,int b){return a+b;}  
    }  
    class TestOverloading5{  
    public static void main(String[] args){  
    System.out.println(Adder4.add(11,11));  
    System.out.println(Adder4.add(11.4,11.6));  
    }} 