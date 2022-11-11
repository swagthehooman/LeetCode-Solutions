class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0,n=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int x: nums){
            if(!arr.contains(x))
                arr.add(x);
        }
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return arr.size();
    }
}