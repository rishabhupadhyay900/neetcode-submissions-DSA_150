class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     int  count =0;
     int n = temperatures.length;
     int arr[] =new int[n];
     for(int i=0;i<n;i++){

        for(int j=i+1;j<n;j++){
         if(temperatures[i] < temperatures[j]){
            arr[i] = j-i;
            break;
         }
         else{
            arr[i] = 0;
         }

        }
     }
     return arr;

        
    }
}
