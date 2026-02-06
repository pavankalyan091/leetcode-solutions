class Solution {
    public String longestPalindrome(String s) {
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int fLen=palind(s,i,i);
            int secLen=palind(s,i,i+1);

            
            int len=Math.max(fLen,secLen);
            if(len>end-start){
                start=i-(len-1)/2;
                end=i+(len)/2;
            }
        }
        return s.substring(start, end + 1);
       
    }

    public static int palind(String s, int l, int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}