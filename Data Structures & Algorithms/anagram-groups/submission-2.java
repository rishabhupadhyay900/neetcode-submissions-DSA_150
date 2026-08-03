class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
    Map<String ,List<String> > mp = new HashMap<>();


    
    for(String s : strs){

        char ss[] = s.toCharArray();
        Arrays.sort(ss);
        String sorted =  new String(ss);

        mp.putIfAbsent(sorted , new ArrayList<>() );

        mp.get(sorted).add(s);
        
    }

     return new ArrayList<>(mp.values() );

    }
}
