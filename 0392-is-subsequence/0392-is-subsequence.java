class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length())
            return false;
        int j=0;
        for(int i=0;i<t.length();i++){
            if(j<s.length() && t.charAt(i)==s.charAt(j))
                j++;
        }
        if(j==s.length())
            return true;
        else
            return false;
    }
}