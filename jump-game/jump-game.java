class Solution {
    public boolean canJump(int[] nums) {
        int N=nums.length;
        int count=0;
        for(int i =0;i<N;i++){
            if(i>count){
               //  count=-1;
               // break;
            return false;
            }
			count=Math.max(count,i+nums[i]);
            
        }
        // return count==-1?false:true;
        return true;
        
    }
}