class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer>ans=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l=0;
        int r=0;
        while(l<nums1.length && r<nums2.length){
            if(nums1[l]==nums2[r]){
                if(ans.size()==0 || ans.get(ans.size()- 1)!=nums1[l]){
                    ans.add(nums1[l]);
                }
                l++;
                r++;
            }else if(nums1[l]<nums2[r]){
                    l++;
                }else{
                    r++;    
                }
            
            }
            int anss[]=new int[ans.size()];

            for(int i=0;i<ans.size();i++){
                anss[i]=ans.get(i);
        }
        return anss;
    }
}