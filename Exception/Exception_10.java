class ClassNotFoundExample {
    public static void main(String args[]) {
       try {
          Class.forName("myPackage.exampl.Sample");
       }catch (ClassNotFoundException ex) {
          ex.printStackTrace();
       }
    }
 }