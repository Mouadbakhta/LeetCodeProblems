class Solution {
    public int reverseBits(int n) {
        String input = "";
        for(int i = Integer.SIZE - 1 ; i >= 0 ; i--){
            input += (n >> i)&1 ; 
        }
        StringBuilder result = new StringBuilder();
        for (int j = input.length() -1 ; j >= 0 ; j--){
            result.append(input.charAt(j));
        }
        
        return Integer.parseInt(result.toString(),2);
        
    }
}