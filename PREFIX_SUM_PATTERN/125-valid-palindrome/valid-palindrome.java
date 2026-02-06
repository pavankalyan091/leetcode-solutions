class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] arr=s.toCharArray();

        int l=0; 
        int r=arr.length-1;
        while(l<=r){
            if(arr[l]!=arr[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}