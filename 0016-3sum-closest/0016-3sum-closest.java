class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        //[-4,-1,1,2]
        int closestsum = nums[0]+nums[1]+nums[2];

        for (int i = 0 ; i <= nums.length - 1 ; i++){
            int left = i + 1;
            int rigth = nums.length-1 ;
            while (left < rigth){
                int sum = nums[i]+nums[left]+nums[rigth];
                int diff1 = Math.abs(target - sum);
                int diff2 = Math.abs(target - closestsum);

                if (sum == target ){
                    return sum ;
                }

                if (diff1 < diff2){
                    closestsum = sum ;
                }

                

                if (sum < target ){
                    left++;
                }else {
                    rigth --;
                }
                
            }
        }
        return closestsum ;

        
    }
}