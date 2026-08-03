class Solution {
    public boolean isAnagram(String s, String t) {
      
      char ch[] = new char[26];
      int n = s.length();
      int m = t.length();
      if(n != m){
        return false;
      }

      for(int i=0;i<n;i++){
        ch[s.charAt(i) - 'a']++;
        ch[t.charAt(i) - 'a']--;
      }
    
      for(int i=0;i<26;i++){
        if(ch[i] != 0){
          return false;
        }
      }
      return true;    }
}
