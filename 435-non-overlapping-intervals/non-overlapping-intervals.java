class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[1]-b[1]);
        int count=0;
        
        int preEnd=intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            int currentStart=intervals[i][0];
            if(currentStart>=preEnd){
                preEnd=intervals[i][1];
            }else{
                count++;
            }
        }
        return count;
    }
}