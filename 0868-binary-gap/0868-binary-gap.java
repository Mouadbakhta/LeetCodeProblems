class Solution {
    public int binaryGap(int n) {
        String sn = Integer.toBinaryString(n);
        int counter = 0 ;
        int lastone = -1;
        int maxdistance = 0;
        for (int i = 0 ; i<= sn.length() - 1 ; i++){
            if(sn.charAt(i) == '1'){
                if (lastone != -1){
                    int distance = i - lastone ; 
                    maxdistance =(maxdistance > distance)?maxdistance  : distance ;
                }
                lastone = i ;
            }
        }
        return maxdistance ;
        
    }
}