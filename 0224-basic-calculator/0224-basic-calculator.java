class Solution {
    public int calculate(String s) {
        int len=s.length(), result=0, sign=1;
        Stack<Integer> stck=new Stack<>();
        for(int i=0;i<len;i++){
            if(Character.isDigit(s.charAt(i))){
                int number=s.charAt(i)-'0';
                while(i+1<len && Character.isDigit(s.charAt(i+1))){
                    number=(number*10)+(s.charAt(i+1)-'0');
                    i++;
                }
                result+=number*sign;
            }
            else if(s.charAt(i)=='+'){
                sign=1;
            }
            else if(s.charAt(i)=='-'){
                sign=-1;
            }
            else if(s.charAt(i)=='('){
                stck.push(result);
                stck.push(sign);
                sign=1;
                result=0;
            }
            else if(s.charAt(i)==')'){
                result=(result*stck.pop())+stck.pop();
            }
        }
        return result;
    }
}