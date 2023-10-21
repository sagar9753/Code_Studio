Ques Link - https://www.codingninjas.com/studio/problems/longest-subarray-with-zero-sum_6783450?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

------------------------------------------------------------------- Solution -----------------------------------------------------------------------------

import java.util.HashMap;

public class Solution {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int ans = 0;

        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];

            if(hm.containsKey(sum))
                ans = Math.max(ans,i-hm.get(sum));
            
            if(!hm.containsKey(sum))
                hm.put(sum,i);
        }
        return ans;
    }
}
