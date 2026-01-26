class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int []>pq=new PriorityQueue<>((a,b)-> b[0]-a[0]);
        for(int[]p:points){
            int x=p[0];
            int y=p[1];
            int distance=x*x+y*y;

            pq.add(new int[]{distance,x,y});
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[][] result = new int[k][2];
        int i = 0;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            result[i][0] = cur[1]; 
            result[i][1] = cur[2]; 
            i++;
        }

        return result;
    }
}