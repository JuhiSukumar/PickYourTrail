import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SuperStack {
	private int top;
	private List<Integer> stackElements;
	
	public SuperStack() {
		top=-1;
		stackElements = new ArrayList<>();
	}
	
	public void push(int element) {
		top++;
		stackElements.add(element);
	}
	
	public void pop() {
	 stackElements.remove(top--);	
	}
	
	public void inc(int bottomCount,int value) {
		for(int index=0;index<bottomCount;index++)
		{
			stackElements.set(index, stackElements.get(index) + value);
		}
	}
	
	public void printTop() {
		if(top == -1) {
			System.out.println("EMPTY");	
		}
		else {
			System.out.println(stackElements.get(top));
		}
	}
	
	public static void main(String args[]) throws Exception 
	{
		Scanner in = new Scanner(System.in);
		int inputLength=Integer.parseInt(in.nextLine());
		String[] stackOperations= new String[inputLength];
		for (int index=0; index < inputLength ; index++) 
		{
			stackOperations[index]=in.nextLine();
		}
		superStack(stackOperations);
		in.close();
	}
	
	private static void superStack(String[] stackOperations) throws Exception
	{
		SuperStack s=new SuperStack();
		for (String stackOperation : stackOperations) 
		{
			String[] subStrings=stackOperation.split("\\s+");
			if("push".equalsIgnoreCase(subStrings[0]))
			{
				s.push(Integer.parseInt(subStrings[1]));
			}
			else if("pop".equalsIgnoreCase(subStrings[0]))
			{
				s.pop();
			}
			else if("inc".equalsIgnoreCase(subStrings[0]))
			{
				s.inc(Integer.parseInt(subStrings[1]),Integer.parseInt(subStrings[2]));
			}
			else
			{
				throw new Exception("Unsupported Operation");
			}
			s.printTop();
				
		}
	}

}
