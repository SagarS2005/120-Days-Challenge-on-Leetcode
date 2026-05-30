class Solution {
    public String longestPalindrome(String s) {
        if (s.length() ==1) return s;
        int max=1;
        String result=s.substring(0,1);

        for(int i=0; i<s.length(); i++){      
            for(int j=i+1; j<s.length(); j++){  
                int length=0;
                if(s.charAt(i) == s.charAt(j)){
                    String sub = s.substring(i,j+1);
                    length = resultSubstring(s.substring(i,j+1));
                    if(length > max){
                        max = length;
                        result = sub;
                    }
                }
                
                
            }
        }
        
        // System.out.println("Result is : " + result);
        return result;
    }

    static int resultSubstring(String s){
        int length=s.length();
        int st=0;
        int end=length-1;
        
        while(st<end){
            char left=s.charAt(st);
            char right =s.charAt(end);
            if(left != right){
                return 0;
            }
            else{
            
                st++;
                end--;
            }
        }
        return length;
    }
}