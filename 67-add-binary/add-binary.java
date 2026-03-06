class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Loop until both strings are exhausted and no carry remains
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to int
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char to int
                j--;
            }
            
            sb.append(sum % 2); // Append the bit (0 or 1)
            carry = sum / 2;    // Calculate the carry for the next position
        }
        
        // The digits were added in reverse order
        return sb.reverse().toString();
    }

}