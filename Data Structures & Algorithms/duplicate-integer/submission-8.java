class Solution {
    public boolean hasDuplicate(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }
}