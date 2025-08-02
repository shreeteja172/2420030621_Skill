package Myproject;

public class newmethodexample {
	public void A() {
		System.out.println("A");
	}
	public void B() {
		System.out.println("B");
	}
	public void C() {
		B();
		System.out.println("C");
	}
	public void D() {
		A();
		System.out.println("D");
	}
	
	public static void main(String args[]) {
		new_method_ex ob = new new_method_ex();
		ob.D();
		ob.C();
	}
}
