class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int ans[]= new int[Math.min(nums1.length, nums2.length)];
        int l=0;
        int r=0;
        int k=0;
        while(l<nums1.length && r<nums2.length){
            if(nums1[l]==nums2[r]){
                ans[k]=nums1[l];
                k++;
                l++;
                r++;
            }else if(nums1[l]<nums2[r]){
                l++;
            }else{
                r++;
            }

        }
        return Arrays.copyOf(ans,k);
    }
}