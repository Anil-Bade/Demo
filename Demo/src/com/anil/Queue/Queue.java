package com.anil.Queue;

public abstract class Queue {
 int capacity=0; 
 int front=0;
 int rear=-1; 
 int currentSize=0;
 int[] queueArr;
 public Queue() {
	// TODO Auto-generated constructor stub
	 this.capacity=50;
	 this.queueArr = new int[this.capacity];

 }
 public Queue(int queueSize) {
	// TODO Auto-generated constructor stub
this.capacity=queueSize;
this.queueArr = new int[this.capacity];
 }
abstract	boolean enqueue(int element);
abstract	int dequeue();
abstract	boolean isFull();
abstract	boolean isEmpty();
}
