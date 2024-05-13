import java.util.Scanner;
public class DailyPractice {

	//2
		int[] stackArray;
	int top;
	int size;


	public Stack(int maxS) {
		stackArray = new int[maxS];
		top = -1;
		size = 0;
		}



	public int size() {
	return size;
	}

	void push(int x) {
	if (!isFull()) {
		stackArray[++top] = x;
	size++;
	}
	else {
	System.out.println("the stack Full");
	}
	}
	public int pop() {
	if (!isEmpty()) {
	int data = stackArray[top--];
	size--;
	return data;
	}
	return -1;
	}


	public boolean isEmpty() {
	return size == 0;
	}
	public boolean isFull() {
	return size == stackArray.length;
	}
	public int peek() {
	if(top >= 0) {
	return stackArray[top];
	}
	return -1;
	}
	public static void main(String[] args) {
	Stack numStack = new Stack(5);
	numStack.push(10);
	numStack.push(20);
	numStack.push(30);
	numStack.push(40);
	numStack.push(50);
	numStack.pop();
	numStack.pop();
	for (int i = 0; i < numStack.size; i++) {
	System.out.println(numStack.stackArray[i]);



	}
	}
