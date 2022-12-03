class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Map.Entry<Character, Integer>> q=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        Map<Character, Integer> map=new HashMap<>();
        for(char c: s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        for(Map.Entry m: map.entrySet())
            q.add(m);
        StringBuilder str=new StringBuilder();
        while(!q.isEmpty()){
            Map.Entry element=q.remove();
            for(int i=0;i<(int)element.getValue();i++)
                str.append(element.getKey());
        }
        return str.toString();
    }
}