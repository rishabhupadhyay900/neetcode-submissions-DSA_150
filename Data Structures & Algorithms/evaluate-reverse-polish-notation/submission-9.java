

class Solution {
    public int evalRPN(String[] tokens) {
       
       if(tokens.length == 0){
        return 0;
       }
        
        
      List<String> list = new ArrayList<>(Arrays.asList(tokens));
        while(list.size() > 1){
       
       for(int i=0;i<list.size();i++){
        if("+-*/".contains(list.get(i))){
         int first = Integer.parseInt(list.get(i-2));
         int second = Integer.parseInt(list.get(i-1));
         int res = 0;

         if(list.get(i).equals("+")){
          res = first + second;
         }
         else if(list.get(i).equals("-")){
          res = first - second;
         }
         else if(list.get(i).equals("*")){
          
          res = first*second;
         }
         else{
          res = first/second;
         }

         list.set(i-2,String.valueOf(res));
        
         list.remove(i);
          list.remove(i-1);
          break;
        }
         
         
        
       }

   

    }
   return Integer.parseInt(list.get(0));
    }
}
