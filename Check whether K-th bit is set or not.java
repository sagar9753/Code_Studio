Ques Link - https://www.codingninjas.com/studio/problems/check-whether-k-th-bit-is-set-or-not_5026446?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

---------------------------------------------------------- Solution ---------------------------------------------------------

public class Solution {
    static boolean isKthBitSet(int n, int k) {
        // Write your code here.
        int a = n >> k-1;

        if((a & 1) == 1)
            return true;
        return false;
    }
}
