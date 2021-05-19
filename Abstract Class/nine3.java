abstract class Base {
	abstract void fun();
    void nonabstactMethod()
    {
        System.out.println("Non Abstract Method");
    }
}

class nine2 {
	public static void main(String args[])
	{
        Base b = new Derived();
        b.nonabstactMethod();
	}
}
