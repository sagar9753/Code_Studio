Ques Link - https://www.codingninjas.com/studio/problems/k-th-element-of-2-sorted-array_1164159?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

-------------------------------------------------- Solution --------------------------------------------------------

import java.util.ArrayList;
public class Solution {
    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        int i = 0,j = 0;
        int ans = 0;
        int count = 0;

        while(i < n && j < m && count < k){
            if(arr1.get(i) < arr2.get(j)){
                ans = arr1.get(i);
                i++;
            }
            else{
                ans = arr2.get(j);
                j++;
            }
            count++;
        } 
        if(count != k){
            if(i != n-1)
                ans = arr1.get(k-count);
            else
                ans = arr2.get(k-count);
        }
        return ans;
    }
}
