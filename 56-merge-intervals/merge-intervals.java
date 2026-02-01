class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort intervals using bubble sort (no import)
        for (int i = 0; i < intervals.length - 1; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i][0] > intervals[j][0]) {
                    int[] temp = intervals[i];
                    intervals[i] = intervals[j];
                    intervals[j] = temp;
                }
            }
        }

        int[][] result = new int[intervals.length][2];
        int index = 0;

        result[0][0] = intervals[0][0];
        result[0][1] = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            // Overlapping case
            if (intervals[i][0] <= result[index][1]) {
                result[index][1] =
                        Math.max(result[index][1], intervals[i][1]);
            } else {
                // Non-overlapping
                index++;
                result[index][0] = intervals[i][0];
                result[index][1] = intervals[i][1];
            }
        }

        // Create exact size output array
        int[][] output = new int[index + 1][2];
        for (int i = 0; i <= index; i++) {
            output[i][0] = result[i][0];
            output[i][1] = result[i][1];
        }

        return output;
    }
}