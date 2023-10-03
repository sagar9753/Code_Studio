Ques Link - https://www.codingninjas.com/studio/problems/frog-jump_3621012?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

------------------------------------------- Solution (Recursion + Memoization) ---------------------------------------------------

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int frogJump(int n, int arr[]) {
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return solve(n-1,arr,dp);
    }
    public static int solve(int n, int arr[], int dp[]){
        if(n == 0) return 0;
        if(dp[n] != -1) return dp[n];
        int prev2 = Integer.MAX_VALUE;
        int prev1 = Math.abs(arr[n] - arr[n-1]) + solve(n-1,arr,dp);
        if(n > 1)
            prev2 = Math.abs(arr[n] - arr[n-2]) + solve(n-2,arr,dp);
        return dp[n] = Math.min(prev1,prev2);
    }

}
------------------------------------------- Solution (Tabulation) ----------------------------------------------------------

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int frogJump(int n, int arr[]) {
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        for(int i = 1 ; i < arr.length ; i++){
            int prev2 = Integer.MAX_VALUE;
            int prev1 = Math.abs(arr[i] - arr[i-1]) + dp[i-1];
            if(i > 1)
                prev2 = Math.abs(arr[i] - arr[i-2]) + dp[i-2];
            dp[i] = Math.min(prev1,prev2);
        }
        return dp[n-1];
    }

}
------------------------------------------- Solution (Space Optimization) ----------------------------------------------------

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int frogJump(int n, int arr[]) {
        int prev1 = 0;
        int prev2 = 0;
        for(int i = 1 ; i < arr.length ; i++){
            int jump2 = Integer.MAX_VALUE;
            int jump1 = Math.abs(arr[i] - arr[i-1]) + prev1;
            if(i > 1)
                jump2 = Math.abs(arr[i] - arr[i-2]) + prev2;
            prev2 = prev1;
            prev1 = Math.min(jump1,jump2);
        }
        return prev1;
    }

}
