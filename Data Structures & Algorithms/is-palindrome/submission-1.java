class Solution {
    public boolean isPalindrome(String s) {

        String ss = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n = ss.length();
        for(int i=0;i<n;i++){
            if(ss.charAt(i) != ss.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
