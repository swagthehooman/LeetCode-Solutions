class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int x: arr){
            map.merge(x,1,Integer::sum);
        }
        
        Set<Integer> set=new HashSet<>();
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(!set.contains(e.getValue()))
                set.add(e.getValue());
            else return false;
        }
        return true;
    }
}