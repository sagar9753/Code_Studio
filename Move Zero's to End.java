Ques LInk - https://www.codingninjas.com/studio/problems/ninja-and-the-zero-s_6581958?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse&leftPanelTab=0

---------------------------------------------------------- Solution ---------------------------------------------------------------------

public class Solution {
        public static int[] moveZeros(int n, int []a) {
        int i = 0 ;
        int j = 0 ;
        while(j < n){
            if(a[j] != 0){
                a[i] = a[j];
                i++;j++;
            }
            else
                j++;
        }
        while(i < a.length){
            a[i] = 0;
            i++;
        }
        return a;
    }
}
