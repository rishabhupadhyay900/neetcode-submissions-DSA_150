class Solution {
    public int evalRPN(String[] tokens) {
        
        List<String> l = new ArrayList<>(Arrays.asList(tokens));
        
        while(l.size() > 1){
            for(int i =0;i<l.size();i++){
                String s = l.get(i);

                if("-+*/".contains(s)){
                    int a = Integer.parseInt(l.get(i-2));
                    int b = Integer.parseInt(l.get(i-1));
                    int result =0;

                    if(s.equals("+")){
                       result = a + b;
                    }
                    else if(s.equals("-")){
                        result = a-b;
                    }
                    else if(s.equals("*")){
                        result = a*b;
                    }
                    else{
                        result = a/b;
                    }
                    l.set(i-2,String.valueOf(result));
                    l.remove(i);
                    l.remove(i-1);
                    break;
                    
                }
            }
        }
        return Integer.parseInt(l.get(0));
    }
}
