abstract class Base {
	abstract void fun();
    void nonabstactMethod()
    {
        System.out.println("Non Abstract Method");
    }
}

class nine1 {
	public static void main(String args[])
	{

		// Uncommenting the following line will cause
		// compiler error as the line tries to create an
		// instance of abstract class. Base b = new Base();

		// We can have references of Base type.
		Base b = new Derived();
		//b.fun();
        b.nonabstactMethod();
	}
}
