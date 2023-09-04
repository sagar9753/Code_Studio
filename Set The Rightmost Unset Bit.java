Ques Link - https://www.codingninjas.com/studio/problems/set-the-rightmost-unset-bit_8160456?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

--------------------------------------------------- Solution -------------------------------------------------------

public class Solution {
    public static int setBits(int N){
        int num = N ;
        int count = 0;
        while(num % 2 != 0){
            num = num>>1;
            count++;
        }
        if(num >> 1 % 2 != 0){
            num |= 1;
            num = num<<count;
            return N | num;
        } 
        return N;
    }
}
