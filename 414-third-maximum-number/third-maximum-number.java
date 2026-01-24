class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer>pq =new PriorityQueue<>();
        for(int n:nums){
            if(pq.contains(n)) continue;
            pq.add(n);

            if(pq.size()>3){
                pq.poll();
            }
        }
            if(pq.size()<3){
                while(pq.size()>1) pq.poll();
            }
        return pq.peek();
    }
}