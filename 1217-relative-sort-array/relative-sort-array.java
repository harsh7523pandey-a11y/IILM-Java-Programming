class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];

        // Count elements of arr1
        for (int num : arr1) {
            count[num]++;
        }

        int index = 0;

        // Put elements according to arr2
        for (int num : arr2) {
            while (count[num] > 0) {
                arr1[index++] = num;
                count[num]--;
            }
        }

        // Put remaining elements in ascending order
        for (int num = 0; num <= 1000; num++) {
            while (count[num] > 0) {
                arr1[index++] = num;
                count[num]--;
            }
        }

        return arr1;
    }
}