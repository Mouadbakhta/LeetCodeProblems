class Solution {
    public int reverseBits(int n) {
        int result = 0 ;
        for(int i = Integer.SIZE - 1 ; i >= 0 ; i--){
            result = result |(((n >> i)&1) << Integer.SIZE - i) ;
        }
        return result >>> 1 ;
    }
}