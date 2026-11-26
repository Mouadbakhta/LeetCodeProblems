class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int n : nums){
            if (map.containsKey(n)){
                map.put(n,map.get(n) + 1 );

            }else {
                map.put(n, 1);
            }
        }
        // TreeMap<Integer , Integer> result = new TreeMap<>(map);

        // // int n = (lastresulr)

        // Map.Entry<Integer, Integer> n = result.lastEntry();
        // System.out.println(result);

        // int result = 0 ;        
        // for (Map.Entry<Integer , Integer> entry : map.entrySet()){
        //     result = (result > entry.getValue()) ? result : entry.getValue();
        // }
        int max = nums[0];
        for (Integer n : nums){
            max = (map.get(max) > map.get(n))? max : n ;
        }

        return max;

        
        
    }
}