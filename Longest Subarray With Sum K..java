Ques Link - https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_5713505?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

-------------------------------------------------------- Solution ---------------------------------------------------------------

import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
		Map <Integer,Integer> hm = new HashMap<Integer,Integer>();
		int sum = 0;
		int max = 0;

		for(int i = 0 ; i < nums.length ; i++){
			sum += nums[i];

			if(sum == k)
				max = Math.max(max,i+1);

			if(hm.containsKey(sum-k))
				max = Math.max(max,i - hm.get(sum-k));

			if(!hm.containsKey(sum))
				hm.put(sum,i);

		}
		return max;
	}
}
