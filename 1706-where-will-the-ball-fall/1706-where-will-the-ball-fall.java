class Solution {
    public int[] findBall(int[][] grid) {
        int result[]=new int[grid[0].length];
        
        for(int j=0;j<grid[0].length;j++){
            int curr=j;
            for(int i=0; i<grid.length;i++){
                int next=curr+grid[i][curr];
                if(next<0 || next>grid[0].length-1 || grid[i][curr]!=grid[i][next]){
                    result[j]=-1;
                    break;
                }
                result[j]=next;
                curr=next;
            }
        }
        return result;
    }
}