class Solution {
    public int missingNumber(int[] nums) {
        int result=0,i=0;
        for( i=0;i<nums.length;i++){
            result=result^i^nums[i];
        }
        return result^i;
    }
}