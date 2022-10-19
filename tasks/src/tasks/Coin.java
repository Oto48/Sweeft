package tasks;

import java.util.Arrays;

public class Coin {
		public static int minSplit(int amount) {
			int[] coins = {1,5,10,20,50};
	    	int dp[][] = new int[coins.length+1][amount+1];
	    	Arrays.sort(coins);
	    
	    	for (int i = 0; i < coins.length; ++i) {
	        	dp[i][0] = 0;
	    	}
	    
	    	for (int j = 0; j <= amount; ++j) {
	        	dp[0][j] = amount+1;
	    	}	
	    
	    	for (int i = 1; i <= coins.length; ++i) {
	        	for (int j = 1; j <= amount; ++j) {
	            	if (coins[i-1] > j) {
	               	dp[i][j] = dp[i-1][j];
	            	} else {
	               	dp[i][j] = Math.min(dp[i-1][j], 1 + dp[i][j-coins[i-1]]);
	            	}
	        	}
	    	}
	    	if (dp[coins.length][amount] > amount) {
	        	return -1;
	    	} else {
	       	 	return dp[coins.length][amount];
	    	}
		}
	
		public static void main(String[] args) {
		
			int A = minSplit(11);
			System.out.println(A);
		}
}
