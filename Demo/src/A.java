
public class A {

	
/*public  void print(){

	System.out.println("A's ss print");
	System.out.println("A's AA print");
}
*/	
	public A() {
	
		// TODO Auto-generated constructor stub
	System.out.println("constructor A");
	}
	{
		System.out.println("instance block A");
	}
	public static void main(String[] args) {
		A a = new A();
			}
	static {
		System.out.println("static block A");
	}
}
