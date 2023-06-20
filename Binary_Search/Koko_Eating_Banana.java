class Solution {
    boolean canEatAllBanana(int[] piles,int hour,int eatingSpeed)
    {
        long total_hours = 0;
        for(int i=0;i<piles.length;i++)
        {
            total_hours += (piles[i]%eatingSpeed == 0 ? piles[i]/eatingSpeed: (piles[i]/eatingSpeed)+1);
        }
        return total_hours>hour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int L = 0;
        int R = Integer.MAX_VALUE;
        while(L+1<R){
            int K = L+(R-L)/2;
            if(canEatAllBanana(piles,h,K)){
                L = K;
            }
            else{
                R = K;
            }
        }
        return R;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minEatingSpeed(new int[]{3,6,8,11},8));
    }
}