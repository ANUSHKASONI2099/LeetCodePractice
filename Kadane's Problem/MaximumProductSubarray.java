class MaximumProductSubarray {

    public int maxProduct(int[] a) {
        int minEnding = a[0];
        int maxEnding = a[0];
        int res = a[0];
        for (int i = 1; i < a.length; i++) {
            int v1 = a[i];
            int v2 = minEnding * a[i];
            int v3 = maxEnding * a[i];
            maxEnding = Math.max(v1, Math.max(v2, v3));
            minEnding = Math.min(v1, Math.min(v2, v3));
            res = Math.max(res, Math.max(maxEnding, minEnding));
        }
        return res;

    }

}