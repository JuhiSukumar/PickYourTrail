import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MinimumUniqueArraySum {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int inputLength=in.nextInt();
		int[] array=new int[inputLength];
		for(int index=0;index < inputLength ; index++) {
			array[index]=in.nextInt();
		}
		int minimumSum=getMinimumUniqueSum(array);
		System.out.println(minimumSum);
		in.close();
	}
	
	public static int getMinimumUniqueSum(int[] array) {
		Set<Integer> distinctElements= new HashSet<>();
		int sum=0;
		for (int element : array) {
			while(distinctElements.contains(element)) {
				element++;
			}
			distinctElements.add(element);
			sum+=element;
		}
		return sum;
	}
}
