class Solution {
    public void rotate(int[][] matrix) {
        int left = 0;
        int right = matrix.length - 1 ; 
        while(left < right){
            for (int i=0 ;i < right - left ; i++ ){
                int t = left ;
                int b = right ;

                int first = matrix[t][left+i];
                matrix[t][left+i] = matrix[b-i][left];
                matrix[b-i][left] = matrix[b][right-i] ; 
                matrix[b][right-i] = matrix[t+i][right];
                matrix[t+i][right] = first ; 

                
            }
            left++;
            right--;
        }



    }
}