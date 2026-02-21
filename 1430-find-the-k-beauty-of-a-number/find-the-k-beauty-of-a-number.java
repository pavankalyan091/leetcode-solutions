class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num);
        int l=0;
        int ans=0;
        for(int r=0;r<s.length();r++){
            if(r-l+1==k){
                int val=Integer.parseInt(s.substring(l,r+1));
                if(val!=0 && num%val==0){
                    ans++;
                }
                l++;
            }
        }
        return ans;
    }
}