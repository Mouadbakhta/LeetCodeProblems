class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        StringBuilder result = new StringBuilder();
        for (char a : s.toCharArray()){
            if (a == '1') {
                a='0';}else{a='1';}
            result.append(a);
        }
        return Integer.parseInt(result.toString(),2);
    }
}