class Solution {
    public boolean hasDuplicate(int[] arr) {
        Set<Integer> s = new HashSet<>()      ;
        int n = arr.length;
        for(int i=0;i<n;i++){

            if(s.contains(arr[i]) ) {
                return true;
            }
            s.add(arr[i]);
        }
        return false;
    }
}