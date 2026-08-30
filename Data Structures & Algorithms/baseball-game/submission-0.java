class Solution {
    public int calPoints(String[] operations) {
        int ans = 0;
        int n = operations.length;
        Deque<Integer> stack = new ArrayDeque<>();

       for(String op : operations){
        
        if(op.equals("+")){
            int top = stack.pop();
            int newtop = top + stack.peek();
            stack.push(top);
            stack.push(newtop);

        }
        else if(op.equals("D")){
            stack.push(2*stack.peek());
        }
        else if(op.equals("C")){
            stack.pop();
        }
        else{
            stack.push(Integer.parseInt(op));
        }

       }
       for(int i : stack){
        ans += i;
       }
       return ans;
    }
}