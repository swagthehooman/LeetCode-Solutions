class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        
        List<String> list=new ArrayList<>();
        
        PriorityQueue<Map.Entry<String,Integer>> heap=new PriorityQueue<>(
            (a,b)->{
            if(a.getValue()!=b.getValue()){
                return a.getValue().compareTo(b.getValue());
            }
            else{
                return -a.getKey().compareTo(b.getKey());
            }
        });
        
        for(String s: words){
            map.merge(s,1,Integer::sum);
        }
        
        for(Map.Entry<String, Integer> i: map.entrySet()){
            heap.offer(i);
            if(heap.size()>k)
                heap.poll();
        }
        
        while(heap.size()>0){
            list.add(heap.poll().getKey());
        }
        
        Collections.reverse(list);
        
        return list;
        
    }
}