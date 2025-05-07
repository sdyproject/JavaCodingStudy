package _240711;

public class Stack {
	private static int MAX_STACK_SIZE = 5; //스택 최대크기
	private int top; // 스택 맨위 인덱스
	private int[] stackArray = new int[MAX_STACK_SIZE]; //스택 위한배열
	
	public Stack() {
		// 스택 비어있는 상태 나타내기 위해 -1로 초기화
		top = -1;
	}
	
	public void push(int data) {
		
		if(top == MAX_STACK_SIZE -1)
		{
			System.out.println("스택이 가득 찾습니다.");
			return;
		}
		
		stackArray[++top] = data;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return -1;
		}
		return stackArray[top--];
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return -1;
		}
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public int size() {
		return top + 1;
	}
}
