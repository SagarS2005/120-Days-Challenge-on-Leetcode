class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        Map<Character, Integer> map = new HashMap<>();
        for(char ch : p.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
     
        int count = p.length();   int left = 0; 
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);

            int freq = map.getOrDefault(ch, 0);
            if( freq > 0){  // if freq of ch > 0 in map 
                count--;
            }
            map.put(ch, freq-1); // if freq < 0 means window required that character

            if(right + left + 1 > p.length()){
                char leftChar = s.charAt(left);
                
                int leftFreq = map.getOrDefault(leftChar, 0);
                if(leftFreq >= 0){  //  if discarding character's frequency is > 0 then increase count ; becuase we are removing that character from current window
                    count++;       
                }
                map.put(leftChar, leftFreq+1);   // if frequency is positive (or == 0) means we  need that character for window
                left++; // removing leftCharacter 
            }

            if(count == 0){
                res.add(left);
            }
        }

        return res;
    }
}