import java.util.ArrayList;
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        } else {
            String xString = String.valueOf(x);
            int xLength = xString.length();
            int[] xArray = new int[xLength];
            for (int i = 0; i < xLength; i++) {
                int y = x%10;
                xArray[i] = y;
                x = x/10;
            }
            
            for (int i = 0; i < xArray.length/2; i++) {
                int a = xArray[i];
                int b = xArray[xArray.length - 1 - i];
                if (a != b){
                    return false;
                }
            }
            
            return true;
            
        }
    }
}