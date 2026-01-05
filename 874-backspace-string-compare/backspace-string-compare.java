class Solution {
    
    public static String getStringComp(String s1){
        StringBuilder sb =new StringBuilder();
        int n=s1.length();
        int hashCount=0;
        for(int i=n-1;i>=0;i--){
            if(s1.charAt(i)=='#'){
                hashCount++;
            }else if(hashCount>0){
                hashCount--;
            }else{
                sb.insert(0,s1.charAt(i));
            }
        }
        return sb.toString();
    }



    public boolean backspaceCompare(String s, String t) {
        return getStringComp(s).equals(getStringComp(t));
    }
}