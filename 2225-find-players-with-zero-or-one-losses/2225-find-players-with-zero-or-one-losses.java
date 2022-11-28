class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> zeroLoss=new HashSet<>(), oneLoss=new HashSet<>(), moreLoss=new HashSet<>();
        
        for(int []match: matches){
            int winner=match[0], loser=match[1];
            if(!oneLoss.contains(winner) && !moreLoss.contains(winner))
                zeroLoss.add(winner);
            
            if(zeroLoss.contains(loser)){
                zeroLoss.remove(loser);
                oneLoss.add(loser);
            }else if(oneLoss.contains(loser)){
                oneLoss.remove(loser);
                moreLoss.add(loser);
            }else if(moreLoss.contains(loser))
                continue;
            else
                oneLoss.add(loser);
        }
        List<List<Integer>> list=Arrays.asList(new ArrayList<>(), new ArrayList<>());
        list.get(0).addAll(zeroLoss);
        list.get(1).addAll(oneLoss);
        Collections.sort(list.get(0));
        Collections.sort(list.get(1));
        return list;
    }
}