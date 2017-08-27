import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

abstract class  Person{
	
	String name; 
	int age;
	 
	public Person(String name , int age) {
		// TODO Auto-generated constructor stub
	
	this .name=name; 
	this.age=age;
	
	System.out.println( this instanceof Student);
	}
}
class Student extends Person {
int rollno;
public Student() {
	// TODO Auto-generated constructor stub
	super("Anil",10);
}
	public Student(String name,int age,int rollno) {
		super(name,age);
		this .rollno=rollno;
		System.out.println( this instanceof Student);
		
		System.out.println(this.hashCode());
		// TODO Auto-generated constructor stub
	}
public void showData(){
	
	System.out.println("Name :" + this.name +" Age : " + this.age +" RollNo : "+this.rollno);
}
}


public class ConstructorTest {

	public static void main(String[] args) throws IOException {
		
		Object s = null;
		try {
			s = Class.forName("Student").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Student s= new Student("Anil", 27, 6);
		System.out.println(s.hashCode());
	//	s.showData();
		File fout = new File("/home/anil/DATA/temp/temp.txt");
		FileInputStream fos = new FileInputStream(fout);
	 
		BufferedReader bw = new BufferedReader(new InputStreamReader(fos));
	String str;
		while((str = bw.readLine())!=null){
			
			String str1[] = str.split(" ");
			
			System.out.println(str1[0]);
			//bw.write("sdf sd fsd sdf sdf sdfs sdf asdf sdf sd sdf sfsd sdf sd fsddfs sdf sdfsddf sd f \n");
		}
	}
}
