class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c != ']'){
                stack.push(c);
            }
            else{
                StringBuilder str = new StringBuilder();
                while(stack.peek() != '['){
                    str.insert(0,stack.pop()); // new data will be add in index 0 and remaining will shift to the right. Eg : if str = [a,b], now new data 's' is append then result will be str = [s, a, b]
                }
                stack.pop();

                StringBuilder trackNums = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    trackNums.insert(0, stack.pop());
                }

                int multiplyTimes = Integer.parseInt(trackNums.toString());

                StringBuilder repeatation = new StringBuilder();

                for(int i = 0; i < multiplyTimes; i++){
                    repeatation.append(str);
                }

                for(char ch : repeatation.toString().toCharArray()){
                    stack.push(ch);
                }
            }
        } 

        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.insert(0,stack.pop());
        }
        return ans.toString();
    }
}