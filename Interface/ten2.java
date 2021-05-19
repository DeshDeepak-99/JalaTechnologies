interface printable{  
    void print(); 
    void boy(); 
    }  
    class ten2 implements printable{  
    public void print(){System.out.println("Hello");}  
    public void boy(){System.out.println("Boys");} 
    public static void main(String args[]){  
    ten1 obj = new ten1();  
    obj.print();
     }  
    } 