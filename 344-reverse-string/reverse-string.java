class Solution {
    public void reverseString(char[] s) {
        int l=0;
        int r=s.length-1;
        while(l<r){
            int temp=s[l];
            s[l]=s[r];
            s[r]=(char)temp;
            r--;
            l++;
        }
    }
}