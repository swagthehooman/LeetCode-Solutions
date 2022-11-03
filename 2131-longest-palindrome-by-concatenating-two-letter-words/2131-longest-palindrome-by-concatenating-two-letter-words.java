class Solution {
    public int longestPalindrome(String[] words) {
        final int size=26;
        int count[][]=new int[size][size];
        for(String word: words){
            count[word.charAt(0)-'a'][word.charAt(1)-'a']++;
        }
        int ans=0;
        boolean central=false;
        for(int i=0;i<size;i++){
            if(count[i][i]%2==0)
                ans+=count[i][i];
            else{
                ans+=count[i][i]-1;
                central=true;
            }
            for(int j=i+1;j<size;j++){
                ans+=2*Math.min(count[i][j],count[j][i]);
            }
        }
        if(central)
            ans++;
        return 2*ans;
    }
}