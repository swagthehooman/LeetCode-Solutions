class Solution {
    public int search(int[] nums, int target) {
        int lower=0, higher=nums.length-1, mid=0;
        while(lower<=higher){
            mid=(lower+higher)/2;
            if(nums[mid]==target)
                return mid;
            if( nums[mid]<target){
                lower=mid+1;
            }
            else{
                higher=mid-1;
            }
        }
        return -1;
    }
}