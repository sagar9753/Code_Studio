Ques Link - https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

----------------------------------------------------------------- Solution -----------------------------------------------------------------------

public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int max = -1;
        long sum = 0;
        int i = 0,j = 0;

        while(j < a.length){
            sum += a[j];
            while(i < j && sum > k){
                sum -= a[i];
                i++;
            }
            if(sum == k)
                max = Math.max(max,j-i+1);
            j++;
                
        }
        return max;
    }
}
