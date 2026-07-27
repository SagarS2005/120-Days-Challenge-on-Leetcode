class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
        int count = s1.length();

        for(char ch : s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        int left = 0;
        for(int right = 0; right < s2.length(); right++){
            char ch = s2.charAt(right);
            
            if(map.containsKey(ch)){
                if(map.get(ch) > 0){
                    count --;
                }
                map.put(ch, map.get(ch) - 1);
            }

            if( right - left + 1 > s1.length()){
                char leftChar = s2.charAt(left);

                if( map.containsKey(leftChar)){

                    if(map.get(leftChar) >= 0){
                        count++;
                    }                
                    map.put(leftChar, map.get(leftChar)+1);
                }
                left ++;
            }

            if(count == 0){
                return true;
            }   
        }   
        return false;
    }
}