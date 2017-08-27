package com.anil.stacks;

public interface Stack {

	Object pop() throws StackEmptyException;
	boolean push(Object o) throws StackOverflowException;
	boolean isFull();
	boolean isEmpty();
}
