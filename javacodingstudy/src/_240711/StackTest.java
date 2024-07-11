package _240711;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("size:" + stack.size());
		System.out.println("peek:" + stack.peek());
		
		System.out.println("pop:" + stack.pop());
		System.out.println("pop2:" + stack.pop());
		System.out.println("size:" + stack.isEmpty());
	}

}
