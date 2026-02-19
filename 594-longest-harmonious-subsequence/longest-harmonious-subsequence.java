class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int count=0;
        for(int r=0;r<nums.length;r++){
            while(nums[r]-nums[l]>1){
                l++;
            }
            if(nums[r]-nums[l]==1){
                count=Math.max(count,r-l+1);
            }
           
        }
        return count;
    }
}