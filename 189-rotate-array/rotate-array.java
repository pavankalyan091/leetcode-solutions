class Solution {
    public static void rotateRight(int nums[],int l,int r){
        while(l<r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        l++;
        r--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n; // it can be handle the if K size greater than the array size ...
        rotateRight(nums,0,n-1); //first rotating the all the array first
        rotateRight(nums,k,n-1); //rotate the rest of the elements
        rotateRight(nums,0,k-1);

    }
}