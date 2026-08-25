class Solution {
    public int[] asteroidCollision(int[] asteroids) {
                        // Left to Right
    /*         
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
    */
                    // Right to Left
        Stack <Integer> stack = new Stack<>();

        for(int i = asteroids.length-1; i >= 0; i--){
            int a = asteroids[i];
            boolean alive = true;       // int alive = 1;

            while(alive && !stack.isEmpty() && stack.peek() < 0 && a > 0){
                if(Math.abs(stack.peek()) < Math.abs(a) ){
                    stack.pop();
                } 
                else if(Math.abs(stack.peek()) == Math.abs(a) ){
                    stack.pop();
                    alive = false;      // alive = 0
                }    
                else{
                    alive = false;    // alive =0
                }                         
            }
            
            if(alive){
                stack.push(a);
            }
            
        }
        int ans[] = new int[stack.size()];
        for(int j = 0; j <= ans.length-1; j++){
            ans[j] = stack.pop();
        }
        return ans;
    }
}