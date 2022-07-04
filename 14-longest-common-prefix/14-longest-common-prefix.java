class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String common = strs[0];
        String temp = "";
        int index = common.length()-1;
        
        for (int i = 1; i < strs.length; i++) {
            temp = strs[i];
            
            if (index > temp.length()-1){
                index = temp.length()-1;
                common = common.substring(0, index+1);
            }
            
            for (int j=0; j<=index; j++){
                if (common.charAt(j) != temp.charAt(j)){
                    index = j-1;
                    common = common.substring(0, index+1);
                    break;
                }
            }
        }
        
        return common;
    }
}