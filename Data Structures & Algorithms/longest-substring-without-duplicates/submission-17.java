class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();
        int n = s.length();

        int l=0,r=0;
        int len =0;
        while(r < n){

            while(set.contains(s.charAt(r))){
                
                set.remove(s.charAt(l));
                l++;

            }
            set.add(s.charAt(r));
            len = Math.max(len, r-l+1);
            r++;
        }
        return len;
    }
}
