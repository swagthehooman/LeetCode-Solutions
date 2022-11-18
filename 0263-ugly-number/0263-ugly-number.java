class Solution {
    public boolean isUgly(int n) {
        if(n<=0)
            return false;
        for(int factors: new int[]{2,3,5})
            n=division(n,factors);
        return n==1;
    }
    public int division(int dividend, int divisor){
        while(dividend%divisor==0)
            dividend/=divisor;
        return dividend;
    }
}