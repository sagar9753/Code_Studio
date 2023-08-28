Ques Link - https://www.codingninjas.com/studio/problems/rotation_7449070?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

----------------------------------------------------- Solution ---------------------------------------------------------

public class Solution {
    public static int findKRotation(int []arr){
        int l = 0 ; 
        int r = arr.length-1;
        int mid;
        if(arr[l] <= arr[r])
            return 0;

        while(l <= r){
            mid = (l + r)/2;

            if(arr[mid] > arr[mid+1])
                return mid+1;
            if(arr[mid] < arr[mid-1])
                return mid;
            
            if(arr[mid] > arr[arr.length-1])
                l = mid+1;
            else
                r = mid-1;
        }
        return 0;
    }
}
