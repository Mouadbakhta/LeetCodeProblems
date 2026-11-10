class Solution {
    public int singleNumber(int[] nums) {
       int result = nums[0] ;
        for (int i =1 ; i <= nums.length -1 ; i++){
            result  ^= nums[i];
        }
        return result ;
        
    }
}

// 2 = 0010  ^  0001 = 0000