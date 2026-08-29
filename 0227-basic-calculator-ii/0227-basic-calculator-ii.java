class Solution {
    public int calculate(String s) {
        List<Integer> nums = new ArrayList<>();
        List<Character> operators = new ArrayList<>();
        int num = 0;

        for(char ch : s.toCharArray()){
            if(ch == ' ') continue;

            if(Character.isDigit(ch)){
                num = num*10 + (ch - '0');
            }
            else{
                nums.add(num);
                operators.add(ch);
                num = 0;
            }
        }
        nums.add(num);

        for(int i = 0; i < operators.size(); ){
            if(operators.get(i) == '*' || operators.get(i) == '/'){
                int a = nums.get(i);
                int b = nums.get(i+1);
                int val = (operators.get(i) == '*') ? a * b : a / b;

                nums.set(i, val);
                nums.remove(i+1);
                operators.remove(i);
            }
            else{
                i++;
            }
        }

        int result = nums.get(0);
        for(int i = 0; i < operators.size(); i++){
            if(operators.get(i) == '+' ) result += nums.get(i + 1);
            else{
                result -= nums.get(i + 1);
            }
        }
        return result;
    }
}