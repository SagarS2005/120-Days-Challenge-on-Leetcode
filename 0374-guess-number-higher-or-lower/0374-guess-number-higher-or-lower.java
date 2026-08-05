/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 0, end = n;
        while(start <= n){
            int choice = start + (end - start)/2;
            int res = guess(choice);

            if(res == -1) end = choice - 1;
            
            else if(res == 1) start = choice + 1;

            else return choice;
          
        }
        return -1;
    }
}