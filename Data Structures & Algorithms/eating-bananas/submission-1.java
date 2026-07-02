class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int n = piles.length;
        Arrays.sort(piles);
        int l =0,r= piles[n-1];
        int k =0;
        while(l<= r){
           
           int mid = l + (r -l)/2;
           int th =0;
            for(int j=0;j<n;j++){

                th += Math.ceil((double)piles[j]/mid);
            }

             if(th <= h){
                k =mid;
                r = mid-1;
            }
            else{
                l = mid +1;
            }
            
           
        }
        return k;
    }
}
