import javax.naming.directory.SchemaViolationException;

class seven4{  
    void run(){System.out.println("running");}  
    public static void main(String args[]){  
        seven4 b = new seven4();//upcasting  
        Splendor sc = new Splendor();
        b.run();
        sc.run();
      }
  }  
  class Splendor extends seven4{  
    void run(){System.out.println("running safely with 60km");}  
    
      
  }