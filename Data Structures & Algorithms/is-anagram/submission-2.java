class Solution {
    public boolean isAnagram(String s, String t) {

      if(s.length() != t.length()){
        return false;
      }

   HashMap<Character , Integer> ss = new HashMap<>();
   HashMap<Character , Integer> tt = new HashMap<>();
 
   for(int i=0;i<s.length();i++){
   char ch = s.charAt(i);
   char cb = t.charAt(i);
    ss.put(ch, ss.getOrDefault(ch,0)+1);
    tt.put(cb,tt.getOrDefault(cb,0)+1);
    
   }
   return ss.equals(tt);
  
    }
}
