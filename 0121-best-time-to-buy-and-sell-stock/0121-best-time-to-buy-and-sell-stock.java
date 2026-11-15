class Solution {
    public int maxProfit(int[] prices) {

       // int min = Arrays.stream(prices).min().getAsInt();
       // ArrayList<Integer> result = new ArrayList<>();
        //int index = 0;

       // if (min == prices[prices.length - 1]){
         //   return 0 ;
        //}
        int maxProfit = 0 ;
        int minPrice = prices[0] ;

        for (int day = 0 ; day <= prices.length - 1 ; day++){
             
            if (prices[day] <= minPrice ) {
                minPrice = prices[day];
            }

            if (maxProfit <= (prices[day] - minPrice )) {
                maxProfit = prices[day]   - minPrice ;
            }
        }
        return maxProfit ; 
        




    }
}