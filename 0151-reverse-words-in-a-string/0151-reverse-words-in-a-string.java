class Solution {
    public String reverseWords(String s) {
        StringBuilder str=new StringBuilder();
        Stack<String> stack=new Stack<>();
        String word="";
        s+=" ";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=32)
                word+=c;
            else{
                if(!word.equals(""))
                    stack.push(word);
                word="";
            }
        }
        while(!stack.isEmpty())
            str.append(stack.pop()+" ");
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }
}