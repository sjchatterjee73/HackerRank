//url: https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem
import java.util.*;

class Queue{
	String [] queue;
	int front, rear;
	
	public Queue(int size){
		queue = new String[size];
		front = 0;
		rear = -1;
	}
	
	
	void enqueue(int elem){
		if(isPrime(elem))
			queue[++rear] = "Prime";
		else
			queue[++rear] = "Not Prime";
	}
	String dequeue(){
		String temp = queue[front++];
		rear--;
		return temp;
	}
	boolean isEmpty(){
		if(rear == -1){
			front = 0;
		}
		
		return (rear == -1);
	}
	
	void displayResults(){
		while(!isEmpty()){
			System.out.println(dequeue());
		}
	}
	boolean isPrime(int n){
		if(n <2)
			return false;
		
		for(int i=2; i<=(n/2); i++){
			if(n % i == 0)
				return false;
		}
		
		return true;
	}
}
class CheckPrime{
	static Scanner inp = new Scanner(System.in);
	static int t;
	public static void main(String [] args){
		t = inp.nextInt();
		Queue obj = new Queue(t);
		while(t-- > 0){
			obj.enqueue(inp.nextInt());
		}
		
		obj.displayResults();
	}
}