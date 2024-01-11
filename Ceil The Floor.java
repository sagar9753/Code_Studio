Ques Link - https://www.codingninjas.com/studio/problems/ceiling-in-a-sorted-array_1825401?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

----------------------------------------------------- Solution ------------------------------------------------------

import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      int l = 0;
      int r = n-1;
      int mid;

      while(l < r){
        mid = (l+r)/2;
        
        if(a[mid] < x)
          l++;
        else
          r = mid;
      }
      if(a[l] == x)
        return new int[]{x,x};
      if(l == 0 && a[l] > x)
        return new int[]{-1,a[l]};
      if(l == n-1 && a[l] < x)
        return new int[]{a[l],-1};

      return new int[]{a[l-1],a[l]};

    }
    
}
