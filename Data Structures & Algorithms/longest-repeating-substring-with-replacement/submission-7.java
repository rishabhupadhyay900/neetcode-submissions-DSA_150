class Solution {
    public int characterReplacement(String s, int k) {
        int res =0;
        Map<Character,Integer> mp = new HashMap<>();
        int maxf =0;
        int l =0;
        for(int r=0;r<s.length();r++){
           
           mp.put(s.charAt(r), mp.getOrDefault(s.charAt(r),0) + 1);
           
           maxf = Math.max(maxf,mp.get(s.charAt(r)));
           while((r-l+1) - maxf > k){
            mp.put(s.charAt(l), mp.getOrDefault(s.charAt(l),0) - 1);
            l++;
           }
          
          // if((r-l+1) - maxf <= k)
            res = Math.max(res,r-l+1);
           
        
        }
        

       
      return res; 
    }
}

