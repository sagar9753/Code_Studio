Ques Link - https://www.codingninjas.com/studio/problems/square-root-integral_893351?leftPanelTab=0&utm_medium=website&utm_campaign=a_zcoursetuf

--------------------------------------------------- Solution -----------------------------------------------------------

import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		long l = 0;
		long r = N;
		while(l<=r){
			long mid = (l+r)/2;

			if(mid*mid == N)
				return (int)mid;
			else if (mid*mid > N)
				r = mid - 1;
			else
				l = mid + 1;
		}
		return (int)r;
	}
}
