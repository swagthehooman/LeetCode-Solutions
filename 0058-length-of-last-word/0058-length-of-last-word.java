import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        StringTokenizer st=new StringTokenizer(s);
        int len=0;
        while(st.hasMoreTokens()){
            len=st.nextToken().length();
        }
        return len;
    }
}