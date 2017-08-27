package anil.demo.java.inheritance;

class Box{
	double width;
	double height;
	double depth;
	
public	Box(double width,double height,double depth){
	this.width=width;
	this.height=height;
	this.depth=depth;
	
	}
public Box() {
	// TODO Auto-generated constructor stub
}	
public void show(){
	System.out.println("A's Show");
}
}
class BoxWeight extends Box{
	double weight;
	public BoxWeight(double w,double h,double d, double wt){
		super(w,h,d);
		this.weight=wt;
		
	}
	public void show(){
		System.out.println("B's Show");
	}
}
public class ParentAsRefernce {
public static void main(String[] args) {
	BoxWeight boxWeight = new BoxWeight(4, 8.2, 7, 9.5);
	Box plainBox = new Box();
	System.out.println(boxWeight.weight);
	plainBox=boxWeight;
	plainBox.show();
//	System.out.println(plainBox.weight); // compile time error
}
	
	
	
	
}
