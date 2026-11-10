class Solution {
    public int[] countBits(int n) {
       int[] result   = new int[n+1];
       for (int i = 0 ; i <= n;i++){
        int val  = calcule(i);
        result[i] = val ;
       }
       return result ; 
    }
    private int calcule(int n){
        if (n == 0){
            return 0;
        }
        return calcule(n&(n-1))+1;
    }
}