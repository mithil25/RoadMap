class Solution {
    public int maxProfit(int[] prices) {
        int N = prices.length;
        int minStockPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0;i<N;i++)
        {
            minStockPrice = Math.min(prices[i],minStockPrice);
            
            maxProfit = Math.max(maxProfit,prices[i]-minStockPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(solution.maxProfit(prices));
    }
}