package com.anil.Queue;

public class HashQueue extends Queue {


	public HashQueue() {
		// TODO Auto-generated constructor stub
	}
	public HashQueue(int queueSize) {
		super(queueSize);
	}

	@Override
	boolean enqueue(int element) {
		if(isFull())
		{
			System.out.println("Queue is full , can't add element ");
		}else{
		rear++;
		if(rear==capacity-1){
			rear=0;
		}
		queueArr[rear]=element;
		currentSize++;
		System.out.println(" element added at "+ rear +" element : "+ element);
		}

		
		
		return false;
	}

	@Override
	int dequeue() {
		int element=0;
if(isEmpty())
{
	System.out.println("queue is empty !");
element=0;
}else{
	front++;
	if(front==capacity-1)
	{
		
		element=queueArr[front-1];
		front=0;
	}else{
		element=queueArr[front-1];
	}	
	currentSize--;
}
		
		return element;
	}

	@Override
	boolean isFull() {
		// TODO Auto-generated method stub
boolean status=false;
if(currentSize==capacity-1)
{
	status=true;	
	}
		return status;
	}

	@Override
	boolean isEmpty() {
boolean status=false;
if(currentSize==0){
	status=true;
}
return status;
	}

	public static void main(String[] args) {
		HashQueue q= new HashQueue();

	for(int i = 0;i<51;i++)
		q.enqueue(i);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		System.out.println(q.dequeue());
		
		System.out.println(q.dequeue());
		
		System.out.println(q.dequeue());
		
		System.out.println(q.dequeue());
		
		
		
	}
}
