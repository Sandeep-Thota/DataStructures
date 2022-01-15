package twonumbersum;

import java.util.Arrays;

public class TwoWordsSum {
	public static void main(String args[]) {
		int[] arr = {3,5,10,11,-1,14,13,0};
		twoSum(arr,10);
	}
	
	public static int[] twoSum(int[] array, int targetNum) {
		Arrays.sort(array);
		int left =0;
		int right = array.length-1;
		while(left<right) {
			int resultSet = array[left]+array[right];
			if(targetNum == array[left]+array[right]) {
				System.out.println("numbers are "+array[left]+" "+array[right]);
				return new int[] {array[left],array[right]};
			}
			else if(targetNum > resultSet) {
				left++;
			}
			else if(targetNum < resultSet) {
				right--;
			}
		}
		return new int[0];
	}

}
