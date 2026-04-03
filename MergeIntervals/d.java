
class Solution {

    public int[][] insert(int[][] arr, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            // Case 1: no overlap, current left side
            if (arr[i][1] < newInterval[0]) {
                ans.add(arr[i]);
            } // Case 2: no overlap, current right side
            else if (arr[i][0] > newInterval[1]) {
                ans.add(newInterval);
                newInterval = arr[i];
            } // Case 3: overlap → merge
            else {
                newInterval[0] = Math.min(newInterval[0], arr[i][0]);
                newInterval[1] = Math.max(newInterval[1], arr[i][1]);
            }
        }

        ans.add(newInterval);
        return ans.toArray(new int[ans.size()][]);
    }
}