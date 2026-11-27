class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i <= nums.length - 1 ; i++) {
            int n = nums[i];
            if (map.containsKey(n)) {
                map.put(n, Math.abs(map.get(n) - i ));
                if (map.get(n) <= k) {
                    return true;
                } else {
                    map.put(n,i);
                }

            }else{
                map.put(n,i);
            }

        }
        return false ;
    }
}