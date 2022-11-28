class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int freq[]=new int[128];
        int max=0;
        int longestSubstring=0;
        
        for(int j=0;j<s.length();j++){
            int curr=s.charAt(j)-'A';
            
            freq[curr]++;
            
            max=Math.max(max,freq[curr]);
            
            boolean isValid=(j+1-i-max)<=k ? true:false;
            
            if(!isValid){
                int outChar=s.charAt(i)-'A';
                freq[outChar]--;
                i++;
            }
            longestSubstring=j+1-i;
        }
        return longestSubstring;
    }
}