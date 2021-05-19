 class Animal{  
    void dog(){System.out.println("eating...");} 
    void cow(){System.out.println("eating...");} 
    String name="seru";
    }  
    class sound extends Animal{  
    void bark(){System.out.println("barking...");}  
    void moo(){System.out.println("moo....");}
    void name(){System.out.println(name);}
    }
    class eat extends sound{
        void meat()
        {
            System.out.println("eat meat");
        }
        void grass()
        {
            System.out.println("eat grass");
        }
        void name()
        {
            System.out.println(name);
        }
    }
    class seven1{  
        public static void main(String args[]){  
        sound d=new sound();  
        eat e = new eat();
        d.dog();
        d.cow();  
        d.bark(); 
        d.moo();
        d.name();
        e.meat();
        e.grass(); 
        e.name();
        }} 
   