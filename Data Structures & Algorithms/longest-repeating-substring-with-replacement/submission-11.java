class Solution {
    public int characterReplacement(String s, int k) {
        
        int i =0;
        int maxf = Integer.MIN_VALUE;
        int ans =0;
        Map<Character,Integer> mp = new HashMap<>();
      for(int j=0;j<s.length();j++){
 
          mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j),0)+1);
          maxf = Math.max(maxf,mp.getOrDefault(s.charAt(j),0));

          while((j-i+1) - maxf > k){
             mp.put(s.charAt(i) , mp.getOrDefault(s.charAt(i),0)-1);
             i++;
          } 
        ans = Math.max(ans,j-i+1);
         
        }
        return ans;
    }
}
