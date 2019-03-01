import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingPairs {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int inputLength = in.nextInt();
		int[] array = new int[inputLength];
		for (int index = 0; index < inputLength; index++) {
			array[index] = in.nextInt();
		}
		int difference = in.nextInt();
		in.close();
		int count = countPairs(array, difference);
		System.out.println(count);
	}

	public static int countPairs(int[] numbers,int value) { 
		int count=0;
		Arrays.sort(numbers);
		Set<Integer> distinctSum=new HashSet<>();
		for(int index=0;index<numbers.length ;index++) {
			if(Arrays.binarySearch(numbers,numbers[index]+value)>=0
					&& !distinctSum.contains(numbers[index]+ value + numbers[index])) {
				count++;
				distinctSum.add(numbers[index]+ value + numbers[index] );
			}
  
		}
		return count;

	}
}

