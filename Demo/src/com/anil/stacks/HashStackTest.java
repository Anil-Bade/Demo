package com.anil.stacks;

public class HashStackTest {

	public static void main(String[] args) {
		HashStack s= new HashStack(51);
	
		for(Integer i = 0; i<51; i++){
			s.push(new Person("Anil"+i, i));
		}
		
		System.out.println(((Person)s.pop()).name);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	System.out.println(s.pop());
	}
}
