Ques Link - https://www.codingninjas.com/studio/problems/next-greater-element_670312?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1

------------------------------------------------------- Solution --------------------------------------------------------

import java.io.*;
import java.util.*;

public class Solution {
    public static int[] nextGreaterElement(int[] arr, int n) {
        Stack <Integer> st = new Stack <>();
        for(int i = n-1 ; i >= 0 ; i--){
            while(!st.empty() && st.peek() <= arr[i])
                st.pop();
            int p = arr[i];
            if(st.empty())
                arr[i] = -1;
            else
                arr[i] = st.peek();
            st.push(p);
        }
        return arr;
    }
}
