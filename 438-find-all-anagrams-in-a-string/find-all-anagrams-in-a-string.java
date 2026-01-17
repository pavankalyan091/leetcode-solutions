class Solution {
    public static boolean match(int a[],int b[]){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer>ans=new ArrayList<>();
        int l=0;
        int k=p.length();//fixing the wind size here 

        int freq1[]=new int[26];//creating s frequency 
        int freq2[]=new int[26];//creating the p frequency

        for(char c:p.toCharArray()){
            freq1[c-'a']++;
        }

        for(int r=0;r<s.length();r++){
            freq2[s.charAt(r)-'a']++;
            if(r-l+1>k){
                freq2[s.charAt(l)-'a']--;
                l++;
            }

            if(match(freq1,freq2)){
                ans.add(l);
            }
        }
        return ans;
    }
}