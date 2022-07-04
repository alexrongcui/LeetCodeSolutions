class Solution {
    public String getHint(String secret, String guess) {
        
        int a=0;
        int b=0;
        int countInGuess = 0;
        int countInSecret = 0;
        
        
        for (int i=0; i<guess.length(); i++){
            if (guess.charAt(i)==secret.charAt(i)){
                a++;
            }
        }
        
        for (int i=0; i<=9; i++){
            countInGuess = guess.length() - guess.replace(""+i, "").length();
            countInSecret = secret.length() - secret.replace(""+i, "").length();          
            
            b += Math.min(countInGuess, countInSecret);
        }
        
        b -= a;
                   
        return a + "A" + b + "B";       
        
    }
}