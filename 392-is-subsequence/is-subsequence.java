class Solution {
    public boolean isSubsequence(String s, String t) {
        int s1=s.length();
        int t1=t.length();
        int l=0;
        int r=0;
        while(l<s1 && r< t1){
            if(s.charAt(l)==t.charAt(r)){
                l++;
                r++;
            }else{
                r++;
            }
        }
        return (l==s1);
    }
}