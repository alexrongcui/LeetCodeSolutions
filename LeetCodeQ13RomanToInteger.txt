class Solution {
    public int romanToInt(String s) {
        String temp1 = ""; 
        String temp2 = ""; 
        int result = 0;
        
        for (int i = 0; i < s.length(); i ++){
            
            temp1 = s.substring(i,i+1);
            
            switch (temp1) {
                case "I":
                    result += 1;
                    break;
                case "V":
                    result += 5;
                    break;
                case "X":
                    result += 10;
                    break;
                case "L":
                    result += 50;
                    break;
                case "C":
                    result += 100;
                    break;
                case "D":
                    result += 500;
                    break;
                case "M":
                    result += 1000;
                    break;
                default:
                    System.out.println("Error");
                    
            }
        }
        
        for (int i = 0; i < s.length() - 1; i ++){
            
            temp2 = s.substring(i,i+2);
            
            switch (temp2) {
                case "IV":
                    result += -2;
                    break;
                case "IX":
                    result += -2;
                    break;
                case "XL":
                    result += -20;
                    break;
                case "XC":
                    result += -20;
                    break;
                case "CD":
                    result += -200;
                    break;
                case "CM":
                    result += -200;
                    break;          
            }
        }
        return result;
        
    }
}