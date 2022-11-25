class Solution {
    public int sumSubarrayMins(int[] arr) {
        int mod=1000000007;
        
        Stack<Integer> stack=new Stack<>();
        int dp[]=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty()&& arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.size()>0){
                dp[i]=dp[stack.peek()]+(i-stack.peek())*arr[i];
            }
            else{
                dp[i]=(i+1)*arr[i];
            }
            stack.push(i);
        }
        long sum=0;
        for(int x: dp){
            sum+=x;
            sum%=mod;
        }
        return (int)sum;
    }
}