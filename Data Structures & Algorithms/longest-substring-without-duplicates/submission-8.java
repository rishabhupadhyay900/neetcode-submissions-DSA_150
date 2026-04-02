class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
       
        int ans =0 ;

        for(int i=0;i<n;i++){
            Set<Character> ss = new HashSet<>();
            
            for(int j=i;j<n;j++){
                if(ss.contains(s.charAt(j)))
                 {
                  break;
                 }
                 
                 ss.add(s.charAt(j));
            }
             ans = Math.max(ans,ss.size());
        }
        return ans;
    }
}
