class Data {

	public void foo() {
		System.out.println("foo");
    }
}

class Temp extends Data {

	public static void main(String[] args) {

		Data d = new Data();
		d.foo();
		d.bar();

	}

}