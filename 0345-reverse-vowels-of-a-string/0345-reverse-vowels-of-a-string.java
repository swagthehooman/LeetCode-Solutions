class Solution {
    public String reverseVowels(String s) {
        int i=0, j=s.length()-1;
        
        char[] sArr=s.toCharArray();
        
        while(i<j){
            while(i<s.length() && !isVowel(sArr[i]))
                i++;
            
            while(j>=0 && !isVowel(sArr[j]))
                j--;
            if(i<j){
                swap(sArr,i++,j--);
            }
        }
        return new String(sArr);
        
    }
    public void swap(char[] s, int i, int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
    public boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='O' || c=='I' || c=='U';
    }
}