class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        List<List<Integer>> ans = new ArrayList<>();

        // Total number of elements
        int total = m * n;

        // k can be bigger than total
        k = k % total;

        for (int i = 0; i < m; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {

                // Convert 2D position to 1D index
                int index = i * n + j;

                // Find old position
                int oldIndex = (index - k + total) % total;

                int oldRow = oldIndex / n;
                int oldCol = oldIndex % n;

                row.add(grid[oldRow][oldCol]);
            }

            ans.add(row);
        }

        return ans;
    }
}