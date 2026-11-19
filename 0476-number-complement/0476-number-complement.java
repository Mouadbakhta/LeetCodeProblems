class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        int numofbit = s.length();
        int mask = (1 << numofbit) - 1;
        return num ^ mask;
    }
}