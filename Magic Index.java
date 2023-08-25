Ques Link - https://www.codingninjas.com/studio/problems/magic-index_1199229?leftPanelTab=0

---------------------------------------- Solution -----------------------------------------

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int magicIndex(ArrayList<Integer> a, int n) {
        return find(a,0);

    }
    public static int find(ArrayList<Integer> a, int i){
        if(i == a.size())
            return -1;
        if(a.get(i) == i)
            return i;
        return find(a,i+1);
    }
}
