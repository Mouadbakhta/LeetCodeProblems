class Solution {
    public int binaryGap(int n) {
        int maxCounter = 0 ; 
        int position = 0 ;
        int lastone = -1 ;
       while (n != 0){
     
        if ((n&1) == 1){
            if(lastone != -1 ){
                int distance = position - lastone ;
                maxCounter = (maxCounter > distance) ? maxCounter : distance ;
            }
            lastone = position ;
        }

        position ++ ; 
        n >>= 1;
        
       }
       return maxCounter ;
    }
}