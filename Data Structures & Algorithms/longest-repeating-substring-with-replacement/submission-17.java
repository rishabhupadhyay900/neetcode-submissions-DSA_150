class Solution {
    public int characterReplacement(String s, int k) {

        Map<Character,Integer> mp = new HashMap<>();
        int n = s.length();
        int maxf =0;
        int l=0,r=0;
        int len=0;
        while(r < n){

            mp.put(s.charAt(r) , mp.getOrDefault(s.charAt(r),0) +1);
             maxf = Math.max(maxf,mp.get(s.charAt(r)));
            
             while(r-l+1 - maxf > k){
               mp.put(s.charAt(l) , mp.getOrDefault(s.charAt(l),0) -1);
               l++;
             }

        len = Math.max(len,r-l+1);
           r++; 
        }
        return len;
    }
}
