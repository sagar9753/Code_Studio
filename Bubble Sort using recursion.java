Ques Link - https://www.codingninjas.com/studio/problems/bubble-sort_624380?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

---------------------------------------------- Solution -----------------------------------------------------


public class Solution {
    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        if(n == 0 || n == 1)
            return;

        for(int i = 0 ; i < n-1 ; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSort(arr,n-1);
    }
}
