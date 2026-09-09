class Solution {
    // public String removeDuplicates(String s) {
    //     Stack <Character> stack = new Stack<>();

    //     for(int i = 0; i< s.length() ; i++){
    //         char ch = s.charAt(i);

    //         if(!stack.isEmpty() && stack.peek() == ch){
    //             stack.pop();
    //         }
    //         else{
    //             stack.push(ch);
    //         }

    //     }
    //     StringBuilder res = new StringBuilder();
    //     while(!stack.isEmpty()){
    //         res.insert(0, stack.pop());
    //     }

    //     return res.toString();
    // }
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){

            int len =sb.length();   // last index
            
            if(len > 0 && sb.charAt(len-1) == ch){
                sb.deleteCharAt(len-1);     // delete from the last of sb
            }
            else{
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}