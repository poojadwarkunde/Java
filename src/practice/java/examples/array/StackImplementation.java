package practice.java.examples.array;

public class StackImplementation {
	private int[] arr = null;
	private int head = -1;
	private int size = 0;

	public StackImplementation(int size) {
		arr = new int[size];
		this.size = size;
	}

	public void push(int element) throws Exception {
		if (head >= size - 1) {
			throw new Exception("Stack is Full");
		} else {
			arr[++head] = element;
		}
	}

	public int pop() throws Exception {
		if (head < 0) {
			throw new Exception("Stack is empty");
		} else {
			int ele = arr[head--];
			return ele;
		}
	}

	public int size() {
		
		return head+1;
	}

	public static void main(String[] args) throws Exception {
		StackImplementation stack = new StackImplementation(5);
		stack.push(3);
		stack.push(5);
		stack.push(365);
		stack.push(4353);
		stack.push(3674);
		System.out.println("Elements in stack are :" + stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
