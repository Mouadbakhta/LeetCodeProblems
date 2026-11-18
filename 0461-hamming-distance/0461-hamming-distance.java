class Solution {
    public int hammingDistance(int x, int y) {
        int counter =0 ;
        int n = x ^ y ;
        while(n != 0){
            n = n&(n-1);
            counter ++ ;
        }
        return counter ;
    }
}