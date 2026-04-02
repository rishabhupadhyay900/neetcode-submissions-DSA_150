class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        Map<Character,Integer> mp = new HashMap<>();
        int res =0;
        int maxf=0;
        int l=0;

        for(int i=0;i<n;i++){
           
           mp.put(s.charAt(i) , mp.getOrDefault(s.charAt(i),0)+1);
           maxf = Math.max(maxf,mp.get(s.charAt(i)));

           while((i-l+1) - maxf > k){
            mp.put(s.charAt(l) , mp.getOrDefault(s.charAt(l),0)-1);
            l++;
           }

           res = Math.max(res,i-l+1);

        }

        return res;
    }
}
