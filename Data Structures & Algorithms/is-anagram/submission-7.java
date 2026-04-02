class Solution {
    public boolean isAnagram(String s, String t) {
      
      char ss[] = s.toCharArray();
      char tt[] = t.toCharArray();
      Arrays.sort(ss);
      Arrays.sort(tt);
    
     String a = new String(ss);
     String b = new String(tt);

     if(a.equals(b)){
      return true ;
     }
     else{
      return false;
     }
    }
}
