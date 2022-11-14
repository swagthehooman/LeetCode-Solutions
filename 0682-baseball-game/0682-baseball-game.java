class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String x: operations){
            if(x.charAt(0)=='+'){
                int firstNum=stack.pop();
                int secondNum=stack.pop();
                stack.push(secondNum);
                stack.push(firstNum);
                stack.push(firstNum+secondNum);
            }
            else if(x.charAt(0)=='D'){
                stack.push(stack.peek()*2);
            }
            else if(x.charAt(0)=='C'){
                stack.pop();
            }
            else{
                int num=Integer.parseInt(x);
                stack.push(num);
            }
            //System.out.println(stack);
        }
        int total=0;
        while(!stack.isEmpty())
            total+=stack.pop();
        return total;
    }
}