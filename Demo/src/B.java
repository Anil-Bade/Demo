
public class B  extends A{

	public static  void print(){
		
	System.out.println("B's print");
	
	}
	{
		System.out.println("Instance block B");
	}
	public B() {
		// TODO Auto-generated constructor stub
	System.out.println("Constructor B");
	
	}
	public static void main(String[] args) {
		A a = new B();
		
	}
	static {
		System.out.println("static block B");
	}
}