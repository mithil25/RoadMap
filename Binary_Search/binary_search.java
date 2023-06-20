class Solution {
    boolean comparator(int[] nums,int M,int target)
    {
        if(M==-1){
            return true;
        }
        if(M==nums.length){
            return false;
        }
        return nums[M] < target;
    }
    public int search(int[] nums, int target) {
        int L = -1;
        int R = nums.length;
        while(L+1<R){
            int M = L+(R-L)/2;
            if(comparator(nums,M,target)){
                L = M;
            }
            else{
                R = M;
            }
        }
        if(R == nums.length || nums[R]!=target){
            return -1;
        }
        return R;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{0,1,2,3,5,7,8,9,10,12,13},10));
    }
}