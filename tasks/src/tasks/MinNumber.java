package tasks;

import java.util.Arrays;

public class MinNumber {
	
	public static int notContains(int[] array) {
		Arrays.sort(array);
		int lowest = 1;
		
		for (int i = 0; i < array.length; i++) {
			int n = array[i];
			
			if (n > 0) {
				if (lowest < n) {
					return lowest;
				} else {
					lowest = n + 1;
				}
			}
		}
		return lowest;
	}

	public static void main(String[] args) {
	
		int[] arr = {-1,-2,-3,1,2};
	
		int answer = notContains(arr);
		System.out.println(answer);
	}

}
