class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int resultSum=0;
        int closestDist=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==target){
                    return target;
                }else if(sum<target){
                    l++;
                }else{
                    r--;
                }
            if(Math.abs(sum-target)<closestDist){
                resultSum=sum;
                closestDist=Math.abs(sum-target);
            }
        }
    }
        return resultSum;
    }
}