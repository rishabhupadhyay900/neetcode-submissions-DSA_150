class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char cs1[] = s1.toCharArray();
        Arrays.sort(cs1);
        String sorteds1 = new String(cs1);

        for(int i=0;i<s2.length();i++){

            for(int j=i;j<s2.length();j++){

                char subs[] = s2.substring(i,j+1).toCharArray();
                Arrays.sort(subs);
                String ssubs = new String(subs);
                if(ssubs.equals(sorteds1)){
                    return true;
                }
            }
        }
       return false; 
    }
}
