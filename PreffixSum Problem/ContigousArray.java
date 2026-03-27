class Solution {
    public int findMaxLength(int[] nums) {
        int CntOne = 0 , CntZero = 0 , ans = 0;
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] == 0) CntZero++;
            else CntOne++;

            int diff = CntZero - CntOne ;
            if(diff == 0) {
                ans = Math.max(ans ,i+1);
            }
            if(map.containsKey(diff)){
                int idx = map.get(diff);
                int len = i - idx;
                ans = Math.max(ans, len);
            }else{
                map.put(diff , i);
            }
        }
        return ans;
    }
}