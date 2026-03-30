class Solution {
    public int[][] intervalIntersection(int[][] a, int[][] b) {
        int i = 0 , j = 0 ;
        List<int[]> ans = new ArrayList<>();

        while(i < a.length && j < b.length){
            int s1 = a[i][0];
            int e1 = a[i][1];
            int s2 = b[j][0];
            int e2 = b[j][1];

            // FIX: direct intersection logic
            int s = Math.max(s1 , s2);
            int e = Math.min(e1 , e2);

            if(s <= e){
                ans.add(new int[]{s , e});
            }

            // FIX: correct pointer movement
            if(e1 < e2){
                i++;
            } else {
                j++;
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}