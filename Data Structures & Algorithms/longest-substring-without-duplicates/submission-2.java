class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character > set = new HashSet<>();
        int maxlen =0;
        int len =0;
        int l = 0;
        for(int i=0;i<s.length();i++){

          while(set.contains(s.charAt(i))){
              set.remove(s.charAt(l));
              l++;
              len--;
          }
          set.add(s.charAt(i));
          len++;
          maxlen = Math.max(maxlen,len);
        }
        return maxlen;
    }
}
