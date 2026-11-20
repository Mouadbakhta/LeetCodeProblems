class Solution {
    public int xorOperation(int n, int start) {
        int result = start  ;
        int[] nums = new int[n] ;
        nums[0] = result ;
        for (int i=1;i <= n-1 ; i++){
            nums[i] = start + 2*i ;
            result ^= nums[i];
        }
        return result ; 
    }
}