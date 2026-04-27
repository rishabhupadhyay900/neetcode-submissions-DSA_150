class Solution {

    public void mergesort(int arr[],int l,int r){

        if(l >= r){
            return;
        }
        int mid = l+ (r-l)/2;

        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    public void merge(int arr[],int l,int mid,int r){
        ArrayList<Integer> res = new ArrayList<>();
        int i =l;
        int j = mid+1;

        while(i<= mid && j<=r){
            if(arr[i] <= arr[j]){
                res.add(arr[i]);
                i++;
            }
            else{
                res.add(arr[j]);
                j++;
            }
            
        }
        while(i <=mid ){
           res.add(arr[i]);;
            i++;
        }
        while(j <= r){
            res.add(arr[j]);
            j++;
        }

        for(int x=0;x<res.size();x++){
            arr[l+x] = res.get(x);
        }
    }
    public int[] sortArray(int[] nums) {
        
        mergesort(nums,0,nums.length-1);
        return nums;
    }
}