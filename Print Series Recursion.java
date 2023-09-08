Ques Link - https://www.codingninjas.com/studio/problems/print-series_1081471?leftPanelTab=0

--------------------------------------------- Solution ------------------------------------------------

import java.util.*;
public class Solution {
    public static List<Integer> printSeries(int n,int k) {
        List<Integer> ls = new ArrayList<>();
        solveSeries(n,k,ls);
        return ls;
    }
    public static void solveSeries(int n,int k,List<Integer> ls){
        ls.add(n);

        if(n < 1)
            return;
            
        n -= k;
        solveSeries(n,k,ls);
        n += k;

        ls.add(n);
    }
}
