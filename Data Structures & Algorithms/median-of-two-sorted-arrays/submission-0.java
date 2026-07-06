class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        int arr[] = new int[n1+n2];
        int m = n1+n2;
        double res =0;
        for(int i=0;i<n1;i++){
            arr[i] = nums1[i];
        }
        for(int i = n1;i<m;i++){
         arr[i] = nums2[i-n1];
        }

        Arrays.sort(arr);
        if(m%2 == 0){
         return res = (arr[m/2 -1] + arr[m/2])/2.0;
        }
        else{
          return arr[m/2];
        }
       // return 0;
    }
}