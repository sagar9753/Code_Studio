Ques Link - https://www.codingninjas.com/studio/contests/beginner-contest-43/9472777/problems/27078

--------------------------------------- Solution ---------------------------------------------

public class Solution {
    static char getCharacter(int k, String s) {
        // Write your code here.
        if(k <= s.length())
            return s.charAt(k);
        
        int m = k%s.length();

        return s.charAt(m);
    }
}
