class Solution {
    public int pivotIndex(int[] nums) {
        int left=0;
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            int rightSum=totalSum-left-nums[j];
            if(rightSum==left){
                return j;
            }else{
                left+=nums[j];
            }
        }
    return -1;
    }
}