class Solution {
    public int compress(char[] chars) {
        int write = 0; // Where we write the result
        int read = 0;  // Where we read the input

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Count occurrences of the current character
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // Write the count if it's greater than 1
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}