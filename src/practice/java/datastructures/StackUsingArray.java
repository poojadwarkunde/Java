package practice.java.datastructures;

public class StackUsingArray {
	int[] arr;
	int head = 0;

	StackUsingArray(int max) {
		arr = new int[max];
	}

	public void push(int element) {
		if (head >= arr.length) {
			System.out.println("Stack is Full : " + element);
		} else {
			arr[head++] = element;
		}
	}

	public int pop() {
		if (head <= 0) {
			System.out.println("Stack is Empty ");
			return -100;
		} else
			return arr[--head];
	}

	public void print() {
		for (int i = 0; i < head; i++) {
			System.out.println(arr[i]);
		}
	}

	public void pushAll(int array[]) {
		for (int i = 0; i < array.length; i++) {
			push(array[i]);
		}
	}

	public void empty() {
		head = -1;
	}

	public void printArr() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray(6);
		int[] array = { 4, 5, 3, 2, 8, 9 };
		stack.pushAll(array);
		// stack.push(34);
		// stack.push(76);
		// stack.push(7);
		// stack.push(98);
		// stack.push(45);
		System.out.println("Pushed Elements : ");
		stack.print();
		System.out.println("Pop Elements  :");
		stack.empty();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		stack.print();
		System.out.println("Array : ");
		stack.printArr();
	}
}
