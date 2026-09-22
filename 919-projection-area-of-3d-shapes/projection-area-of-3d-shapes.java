class Solution {
    public int projectionArea(int[][] grid) {

        int n = grid.length;
        int area = 0;

        for (int i = 0; i < n; i++) {

            int rowMax = 0;
            int colMax = 0;

            for (int j = 0; j < n; j++) {

                // Top projection
                if (grid[i][j] > 0) {
                    area++;
                }

                // Maximum height in current row
                rowMax = Math.max(rowMax, grid[i][j]);

                // Maximum height in current column
                colMax = Math.max(colMax, grid[j][i]);
            }

            // Front projection
            area += rowMax;

            // Side projection
            area += colMax;
        }

        return area;
    }
}