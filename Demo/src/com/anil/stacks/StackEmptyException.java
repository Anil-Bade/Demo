package com.anil.stacks;

import java.util.EmptyStackException;

public class StackEmptyException extends EmptyStackException {

	public StackEmptyException(String msg) {
		System.out.println("Exception : "+msg);
	}
}
