class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();//min heap for storing the k lagest elements
        for(int n:nums){
            pq.add(n);
            if(pq.size()>k){
                pq.poll();  
            }
        }
        return pq.peek();
    }
}