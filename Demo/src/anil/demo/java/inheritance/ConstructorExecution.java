package anil.demo.java.inheritance;
class A{
	public A() {
		// TODO Auto-generated constructor stub
System.out.println("A Constructor");
	}
}
class B extends A{
	public B() {
		super();
		System.out.println("B Constructor");
	}
}
public class ConstructorExecution {
public static void main(String[] args) {
	B b = new B();
}
	
}

/*
 * output
 *  A Constructor
 * 	B Constructor
 * */
 