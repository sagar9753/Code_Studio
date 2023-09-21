Ques Link - https://www.codingninjas.com/studio/problems/subset-sum_3843086?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

--------------------------------------------------- Solution -------------------------------------------------------

import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<Integer> subsetSum(int num[]) {
        ArrayList <Integer> ans = new ArrayList<>();
        solve(ans,0,num,0);
        Collections.sort(ans);
        return ans;
    }

    public static void solve(List<Integer> ans,int i,int[] num,int sum){
        if(i == num.length){
            ans.add(sum);
            return;
        }
        solve(ans,i+1,num,sum);
        solve(ans,i+1,num,sum+num[i]);
    }

}
