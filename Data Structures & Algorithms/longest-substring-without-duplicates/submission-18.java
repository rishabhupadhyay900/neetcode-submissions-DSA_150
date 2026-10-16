class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0;
        int n = s.length();
        int l=0;
        for(int r =0;r<n;r++){
            
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
          

            set.add(s.charAt(r));
            maxLen = Math.max(maxLen,set.size());
            
        }
   return maxLen;
    }
}
