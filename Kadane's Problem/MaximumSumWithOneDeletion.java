
class MaximumSumWithOneDeletion {

    public int maximumSum(int[] a) {
        int n = a.length;
        int noDel = a[0];
        int oneDel = 0;
        int res = a[0];

        for (int i = 1; i < n; i++) {
            int prevNoDel = noDel;

            noDel = Math.max(a[i], noDel + a[i]);

            oneDel = Math.max(prevNoDel, oneDel + a[i]);

            res = Math.max(res, Math.max(noDel, oneDel));
        }

        return res;
    }

}
