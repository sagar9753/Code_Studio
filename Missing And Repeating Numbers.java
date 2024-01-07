Ques link - https://www.codingninjas.com/studio/problems/missing-and-repeating-numbers_6828164?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse

-------------------------------------------------------------- Solution ----------------------------------------------------------------------

public class Solution {
    public static int[] findMissingRepeatingNumbers(int []a) {
        // Write your code here
        int n  = a.length;
        int sn = (n*(n+1))/2;
        int s2n = (n*(n+1)*(2*n+1))/6;
        int s = 0,s2 = 0;

        for(int i = 0 ; i < n ; i++){
            s += a[i];
            s2 += a[i]*a[i];
        }
        int v1 = s-sn;
        int v2 = s2-s2n;

        v2 = v2/v1;
        
        int x = (v1+v2)/2;
        int y = x - v1;

        return new int[]{x,y};
    }
}
