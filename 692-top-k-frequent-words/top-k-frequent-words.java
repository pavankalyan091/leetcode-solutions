class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hm =new HashMap<>();
        for(String s:words){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        PriorityQueue<String>pq=new PriorityQueue<>((a,b)->{
            if(hm.get(a).equals(hm.get(b))){
               return b.compareTo(a);
            }
            return hm.get(a)-hm.get(b);
        });

        for(String s:hm.keySet()){
            pq.add(s);
            if(pq.size()>k){
                pq.poll();
            }
        }
        ArrayList<String> ans=new ArrayList<>();
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        Collections.reverse(ans);
        return ans;
    }
}