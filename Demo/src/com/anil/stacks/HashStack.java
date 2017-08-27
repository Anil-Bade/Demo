package com.anil.stacks;

public class HashStack implements Stack {
	Object [] stack;
	int size;
	int top;
	
	public HashStack() {
		this.size=50;
		this.top=-1;
		this.stack=new Object[50];
	}
public 	HashStack(int size){
	this.size=size;
	this.top=-1;
	this.stack=new Object[this.size];
}
	
	@Override
	public Object pop() throws StackEmptyException {
		if(!isEmpty()){
		return stack[top--];
		}else{
			throw new  StackEmptyException("Stack is empty . Not able to pop element ");
		}
		
	}

	@Override
	public boolean push(Object o) throws StackOverflowException {
		// TODO Auto-generated method stub
		
		if(!isFull()){
			stack[++top] =o;
		return true;
		}else{
			throw new StackOverflowException("HashStack Overflow exception !");
		}

	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(top>=(size-1))
		{
			return true;
		}else{
			return false;
		}
		
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
	if(top==-1){
		return true;
	}else{
		return false;
	}
	}
}
