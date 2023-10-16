Ques Link - https://www.codingninjas.com/studio/problems/convert-min-heap-to-max-heap_1381084?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1

------------------------------------------------------------- Solution ----------------------------------------------------------------

public class Solution {
    public static int[] MinToMaxHeap(int n, int[] arr){
        for(int i = (n/2)-1 ; i >= 0 ; i--)
            heapify(arr,i,n);
        return arr;
    }
    public static void heapify(int[] a,int i,int n){
        int m = i;
        int l = 2*i+1;
        int r = 2*i+2;

        if(l < n && a[l] > a[m]){
            m = l;
        }
        if(r < n && a[r] > a[m]){
            m = r;
        }

        if(i != m){
            int temp = a[m];
            a[m] = a[i];
            a[i] = temp;
            heapify(a,m,n);
        }
    }

}
