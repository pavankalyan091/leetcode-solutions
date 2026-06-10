class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();

        int rowBeg = 0;
        int rowEnd = matrix.length - 1;
        int colBeg = 0;
        int colEnd = matrix[0].length - 1;

        while (rowBeg <= rowEnd && colBeg <= colEnd) {

            // Left -> Right
            for (int i = colBeg; i <= colEnd; i++) {
                ans.add(matrix[rowBeg][i]);
            }
            rowBeg++;

            // Top -> Bottom
            for (int i = rowBeg; i <= rowEnd; i++) {
                ans.add(matrix[i][colEnd]);
            }
            colEnd--;

            // Right -> Left
            if (rowBeg <= rowEnd) {
                for (int i = colEnd; i >= colBeg; i--) {
                    ans.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }

            // Bottom -> Top
            if (colBeg <= colEnd) {
                for (int i = rowEnd; i >= rowBeg; i--) {
                    ans.add(matrix[i][colBeg]);
                }
                colBeg++;
            }
        }

        return ans;
    }
}