
public class MyIImpl  implements MyI{

	public void print() {
		// TODO Auto-generated method stub
	System.out.println("inside print");	
	}
	public static void main(String[] args) {
		MyIImpl i = new MyIImpl();
		System.out.println(i.getData());
	}
	public int getData(){
		return 4;  
	}
}
