class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null ||strs.length == 0)
            return "";
        int minlen=Integer.MAX_VALUE;
        for(String str: strs){
            minlen=Math.min(minlen,str.length());
        }
        int low=1, high=minlen;
        while(low<=high){
            int middle=(low+high)/2;
            if(isCommonPrefix(strs,middle))
                low=middle+1;
            else
                high=middle-1;
        }
        return strs[0].substring(0,(low+high)/2);
    }

private boolean isCommonPrefix(String[] strs, int len){
        String str1=strs[0].substring(0,len);
        for(int i=1;i<strs.length;i++){
            if(!strs[i].startsWith(str1))
                return false;
        }
        return true;
    }
}