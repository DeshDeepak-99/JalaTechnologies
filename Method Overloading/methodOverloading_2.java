class Adder1{  
    static int add(int a,int b){return a+b;}  
    static float add(float a,float b,float c){return a+b+c;}  
    }  
    class TestOverloading2{  
    public static void main(String[] args){  
    System.out.println(Adder1.add(11,11));  
    System.out.println(Adder1.add(11.1f,11f,11.3f));  
    }} 