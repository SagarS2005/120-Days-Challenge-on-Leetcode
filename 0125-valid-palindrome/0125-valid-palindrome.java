class Solution {
    public boolean isPalindrome(String s) {
        
        int left =0;
        int right=s.length()-1;

        while (left<right) {
            char l=s.charAt(left);
            char r=s.charAt(right);

            if( !Character.isLetterOrDigit(l)){
                left++;
            }

            // if(!Character.isLetterOrDigit(r)){      
            //     right--;
            // }
            // this logic will be true if i want to check both pointer at same iteration but here else statement will belong only for second (this) if block, above block condition will not affect else statement

            else if(!Character.isLetterOrDigit(r)){
                right--;
            }
            else{
                if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}