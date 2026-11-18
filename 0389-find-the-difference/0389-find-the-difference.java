class Solution {
    public char findTheDifference(String s, String t) {
        char diff = 0 ;

        for (char a :s.toCharArray()){
            diff ^= a;
        }
        for (char b :t.toCharArray()){
            diff ^= b;
        }
        return diff ;
    }
}