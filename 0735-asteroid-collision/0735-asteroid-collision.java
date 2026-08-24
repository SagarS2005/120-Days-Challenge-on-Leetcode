class Solution {
    public int[] asteroidCollision(int[] asteroids) {
    Stack <Integer> stack = new Stack<>();

        for(int a : asteroids){
                
            while (!stack.isEmpty() && stack.peek() > 0 && a < 0 && stack.peek() < -a) {
                stack.pop();
            }

            if(!stack.isEmpty() && stack.peek() > 0 && a < 0){
                if(stack.peek() == -a){
                    stack.pop();
                }
            }
            else{
                stack.push(a);
            }
        }

        int ans[] = new int[stack.size()];
        for(int i = ans.length-1; i >= 0; i--){
            ans[i] = stack.pop();
        }

        return ans;
    }

}