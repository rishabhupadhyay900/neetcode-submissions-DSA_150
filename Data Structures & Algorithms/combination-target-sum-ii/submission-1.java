class Solution {
    public void sum(int arr[],int target,List<Integer> curr,List<List<Integer>> res,int index){

        if(target == 0){
           
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0 || index >= arr.length){
            return;
        }
        for (int i = index; i < arr.length; i++) {
             // skip duplicates at same level
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            

        curr.add(arr[i]);
        sum(arr,target - arr[i],curr,res,i+1);
        curr.remove(curr.size()-1);
       
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer> > res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        sum(candidates,target,curr,res,0);
        return res;
    }
}
