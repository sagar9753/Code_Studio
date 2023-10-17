Ques Link - https://www.codingninjas.com/studio/problems/subset-sum-equal-to-k_1550954?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

---------------------------------------------------------- Solution --------------------------------------------------------------------------

import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        int[][] dp = new int[n][k+1];
        for (int ar[] : dp)
            Arrays.fill(ar, -1);

        return solve(n-1,k,arr,dp);
    }
    public static boolean solve(int n,int k,int[] arr,int[][] dp){
        if(k==0)
            return true;
        if(k < 0)
            return false;
        if(n < 0)
            return false;
        if(dp[n][k] != -1)
            return dp[n][k] == 1 ? true : false;
        
        boolean take = solve(n-1,k-arr[n],arr,dp);
        boolean nottake = solve(n-1,k,arr,dp);

        dp[n][k] = take || nottake ? 1 : 0;

        return take || nottake;
    }
}
