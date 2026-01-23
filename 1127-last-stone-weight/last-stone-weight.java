class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:stones){
            pq.add(n);
        } 
        while(pq.size()>1){
           int y=pq.poll();
           int x=pq.poll();
            if(y!=x){
                pq.add(y-x);
            }
        }
        return pq.isEmpty()?0:pq.peek();
    }
}