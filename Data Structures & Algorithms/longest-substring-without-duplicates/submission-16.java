class Solution {
    public int lengthOfLongestSubstring(String s) {
        
     int n = s.length();
     
     int l =0;
     int res =0;
     Set<Character> ss = new HashSet<>();
     for(int i=0;i<n;i++){
        
    
            
            while(ss.contains(s.charAt(i))) {
                ss.remove(s.charAt(l));
                l++;
            }
         
        
        ss.add(s.charAt(i));
        res = Math.max(res,ss.size());

     }
     return res;

    }
}
