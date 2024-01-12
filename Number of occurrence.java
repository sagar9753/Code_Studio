Ques Link - https://www.codingninjas.com/studio/problems/occurrence-of-x-in-a-sorted-array_630456?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

------------------------------------------------------------------------ Solution ---------------------------------------------------------------------------

public class Solution {
    public static int count(int arr[], int n, int x) {
        int l = 0;
        int r = n-1;
        int mid;

        while(l < r){
            mid = (l+r)/2;
            if(arr[mid] < x)
                l = mid + 1;
            else
                r = mid;
        }
        if(arr[l] != x)
            return 0;
        int st = l;
        l = 0;
        r = n-1;
        int end = -1;
        while(l <= r){
            mid = (l+r)/2;
            if (arr[mid] == x) {
                end = mid;
                l = mid + 1;
            } else if (arr[mid] < x) {
                l = mid + 1; 
            } else {
                r = mid - 1; 
            }
        }

        return end - st + 1;
    }
}
