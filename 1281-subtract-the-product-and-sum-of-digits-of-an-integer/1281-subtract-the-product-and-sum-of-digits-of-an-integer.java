class Solution {
    public int subtractProductAndSum(int n) {
        return product(n)-sum(n);
    }
    private int product(int n){
        int prod=1,temp=n;
        while(temp!=0){
            prod*=temp%10;
            temp/=10;
        }
        return prod;
    }
    private int sum(int n){
        int sums=0,temp=n;
        while(temp!=0){
            sums+=temp%10;
            temp/=10;
        }
        return sums;
    }
}