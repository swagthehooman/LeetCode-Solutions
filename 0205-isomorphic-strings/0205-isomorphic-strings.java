class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sChar[]=new int[256];
        int tChar[]=new int[256];
        Arrays.fill(sChar,-1);
        Arrays.fill(tChar,-1);
        
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i), c2=t.charAt(i);
            
            if(sChar[c1]==-1 && tChar[c2]==-1){
                sChar[c1]=c2;
                tChar[c2]=c1;
            }
            else if(!(sChar[c1]==c2 && tChar[c2]==c1))
                return false;
        }
        
        return true;
    }
}