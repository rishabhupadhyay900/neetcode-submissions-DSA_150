class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
       Map<String , List<String> > mp = new HashMap<>();

       for(String s : strs){

          char ss[] = s.toCharArray();
          Arrays.sort(ss);
          String sorteds = new String(ss);
          mp.putIfAbsent(sorteds, new ArrayList<>());
          mp.get(sorteds).add(s);
       }
        
       return new ArrayList<>(mp.values());

        
    }
}
