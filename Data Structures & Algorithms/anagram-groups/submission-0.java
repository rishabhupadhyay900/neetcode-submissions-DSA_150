class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
      Map<String , List<String>> mp = new HashMap<>();
      for(String s : strs){

        char a[] = s.toCharArray();
        Arrays.sort(a);
        String b = new String(a);
        mp.putIfAbsent(b , new ArrayList<>());
        mp.get(b).add(s);
      }
      return new ArrayList<>(mp.values());
        
    }
}
