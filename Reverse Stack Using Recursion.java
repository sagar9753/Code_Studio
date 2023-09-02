Ques Link - https://www.codingninjas.com/studio/problems/reverse-stack-using-recursion_631875?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

------------------------------------------------------------ Solution ------------------------------------------------

import java.util.Stack;

public class Solution {
    
	public static void reverseStack(Stack<Integer> stack) {
		// write your code here
		if(stack.empty())
			return;
		
		int temp = stack.pop();

		reverseStack(stack);

		solve(stack,temp);
		
	}
	public static void solve(Stack<Integer> stack,int num){
		if(stack.empty()){
			stack.push(num);
			return;
		}
		int temp = stack.pop();

		solve(stack,num);

		stack.push(temp);
	}


}
