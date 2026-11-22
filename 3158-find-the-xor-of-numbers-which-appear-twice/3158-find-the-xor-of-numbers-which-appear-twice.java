class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int result = 0;
        for(int i = 0 ; i <= nums.length - 1 ; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue().equals(2)){
                result ^= entry.getKey() ;
            }
        }
        return result;
        
    }
}


/* 
0001 xor 0000 = 0001 
0001 xor 0010 = 0011
0011 xor 0010 = 00

*/