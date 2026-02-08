class Solution {

    public static boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return (c=='a'|| c=='e'|| c=='i'|| c=='o'||c=='u');
    }
    public String reverseVowels(String s) {
        // HashSet<Character>hs =new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        
        char arr[]=s.toCharArray();
        int l=0;
        int r=arr.length-1;
        while(l<r){
            // while(l<r && !hs.contains(arr[l])){
            //     l++;
            // }

            // while(l<r && !hs.contains(arr[r])){
            //     r--;
            // }

            while (l<r && !isVowel(arr[l])){
                l++;
            }
            while(l<r && !isVowel(arr[r])){
                r--;
            }
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return new String(arr);
    }
}