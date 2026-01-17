class Solution {
    public static boolean match(int a[],int b[]){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int k=s1.length();
        int l=0;

        int freq1[]=new int[26];
        int freq2[]=new int[26];
        //frequency count for s1
        for(char c:s1.toCharArray()){
            freq1[c-'a']++;
        }
        for(int r=0;r<s2.length();r++){
            freq2[s2.charAt(r)-'a']++;
            if(r-l+1>k){
                freq2[s2.charAt(l)-'a']--;
                l++;
            }
            if(match(freq1,freq2)){
            return true;
            }
        }
        return false;
    }  
}