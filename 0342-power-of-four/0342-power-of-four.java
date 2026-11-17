class Solution {
    public boolean isPowerOfFour(int n) {
        boolean result = false ;
        int counter = 0 ;
        if (n <= 0){return result;}
        if ((n & 0x55555555) == 0){ return result; }
        while ( n!=0){
            n = n&(n-1);
            counter++ ;
        }
        if (counter == 1 ){
            result = true ;
        }
        return result ;
    }
}


/*




*/