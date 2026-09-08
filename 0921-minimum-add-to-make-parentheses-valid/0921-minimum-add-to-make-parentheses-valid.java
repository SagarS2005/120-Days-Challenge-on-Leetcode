class Solution {
    // public int minAddToMakeValid(String s) {
    //     Stack<Character> stack = new Stack<>();
    //     int count = 0;

    //     for(char ch : s.toCharArray()){
    //         if(ch == '(' ){
    //             stack.push(ch);
    //             count ++;
    //         }
    //         else{
    //             if(!stack.isEmpty() && count >0){
    //                 stack.pop();
    //                 count--;
    //             }
    //             else{
    //                 count ++;
    //             }
    //         }
    //     }
    //     return count;
    // }


    public int minAddToMakeValid(String s) {
        int countOpen = 0;
        int countClose = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                countOpen ++;
            }
            else{
                if(countOpen > 0){
                    countOpen --;
                }
                else{
                    countClose ++;
                }
            }
        }

        return countOpen + countClose;
    }
}