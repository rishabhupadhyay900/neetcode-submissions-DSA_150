class Solution {
    public int shipWithinDays(int[] weight, int days) {
        
        int max_element = Integer.MIN_VALUE;
        int n = weight.length;
        int sum =0;
        int res =0;
        for(int i =0;i<n;i++){
            if(weight[i] > max_element){
                max_element = weight[i];
            }
           sum += weight[i];
        }

        for(int i=max_element;i<=sum;i++){
            
            int load =0,day =1;

            for(int j =0;j<n;j++){
                if(load + weight[j] > i){
                    load  = weight[j];
                    day = day + 1;
                }
                else{
                    load += weight[j];
                }
            }
            if(day <= days){
               return i;
            }
        }
        return 0;
    }
}