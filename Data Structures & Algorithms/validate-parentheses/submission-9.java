class Solution {
    public boolean isValid(String s) {

      Deque<Character> st = new ArrayDeque<>();
      
      for(Character c : s.toCharArray()){
         if (c == '(' || c == '{' || c == '['){
          st.push(c);
        }
        else{
         if(st.isEmpty()){
          return false;
         }
          if ((c == ')' && st.peek() == '(') ||
        (c == '}' && st.peek() == '{') ||
        (c == ']' && st.peek() == '[')) {
            st.pop();
          }
          else{
            return false;
          }
        }
      }
      if(st.isEmpty()){
        return true;
      }
      else {
        return false;
      }
        
    }
}
