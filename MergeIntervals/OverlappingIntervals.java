class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        List<int[]> ans = new ArrayList<>();

        int start = arr[0][0];
        int end = arr[0][1];

        for (int i = 1; i < arr.length; i++) {
            int currStart = arr[i][0];
            int currEnd = arr[i][1];

            // Step 2: Check overlap
            if (currStart <= end) {
                // Step 3: Merge
                end = Math.max(end, currEnd);
            } else {
                // No overlap
                ans.add(new int[]{start, end});
                start = currStart;
                end = currEnd;
            }
        }

        // Add last interval
        ans.add(new int[]{start, end});

        return ans.toArray(new int[ans.size()][]);
    }

    
}