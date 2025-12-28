class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]=new int[nums.length];
        int l=0;
        int r=nums.length-1;
        int k=arr.length-1;
        while(l<=r){
            int leftSquare=nums[l]*nums[l];
            int rightSquare=nums[r]*nums[r];
            if(leftSquare>rightSquare){
                arr[k]=leftSquare;
                l++;
            }else{
                arr[k]=rightSquare;
                r--;
            }
            k--;
        }
        return arr;
    }
}