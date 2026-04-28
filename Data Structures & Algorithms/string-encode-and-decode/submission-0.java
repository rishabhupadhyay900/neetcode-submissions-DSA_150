class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for(String s : strs){
            int len = s.length();
            encoded.append(len).append('#');
            encoded.append(s);
            
        }
        return encoded.toString();

    }

    public List<String> decode(String str) {
        List<String> decoded = new LinkedList<>();
        int i=0;
        while(i < str.length()){
            int j = i;

            while(  j < str.length() && str.charAt(j) != '#'){  
                j++;
            }
           
            int len  = Integer.parseInt(str.substring(i,j));
            int start = j +1;
            String s = str.substring(start,start + len);
            decoded.add(s);
            i = start + len;

        }
        return decoded;

    }
}
