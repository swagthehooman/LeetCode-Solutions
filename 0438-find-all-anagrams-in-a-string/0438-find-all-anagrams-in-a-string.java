class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        if(p.length()>s.length())
            return list;
        
        int []hashMap=new int[128];
        
        for(char c: p.toCharArray())
            hashMap[c]++;
        
        int start=0,end=0,count=p.length();
        
        while(end<s.length()){
            if(hashMap[s.charAt(end++)]-->0)
                count--;
            
            if(count==0)
                list.add(start);
            
            if(end-start==p.length() && hashMap[s.charAt(start++)]++>=0)
                count++;
        }
        return list;
    }
}