Ques Link - https://www.codingninjas.com/studio/problems/odd-even_7993579?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

----------------------------------------------------- Solution ------------------------------------------------------

public class Solution {
    public static String oddEven(int N){
        // Write your code here.
        if((N & 1) == 1)
            return "odd";
        return "even";
    }
}
