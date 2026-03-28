class Solution {
    public int[][] merge(int[][] arr) {
        int n = arr.length;
        if(n == 0) return new int[0][0];
        Arrays.sort(arr , (a,b)-> a[0] - b[0]);
        List<int[]> ans = new ArrayList<>();
        int s1 = arr[0][0];
        int e1 = arr[0][1];
        for(int i =1 ; i < n ; i++){
            int s2 = arr[i][0];
            int e2 = arr[i][1];
            if( e1 >= s2){
                e1 = Math.max(e1 , e2);
            }else{
                ans.add(new int[] {s1, e1});
                s1 = s2;
                e1 = e2;

            }
        }
        ans.add(new int[]{s1 , e1});
        return ans.toArray(new int[ans.size()][]);
    }
}