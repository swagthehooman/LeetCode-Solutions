class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
        int ans=-1;
        int minDiff=Integer.MAX_VALUE;
        long currSum=0;
        
        long total=0;
        for(int x:nums)
            total+=x;
        
        for(int i=0;i<n;i++){
            currSum+=nums[i];
            
            long left=currSum;
            left/=(i+1);
            
            long right=total-currSum;
            
            if(i!=n-1)
                right/=(n-i-1);
            
            int currDiff=(int)Math.abs(left-right);
            
            if(currDiff<minDiff){
                minDiff=currDiff;
                ans=i;
            }
        }
        return ans;
    }
}