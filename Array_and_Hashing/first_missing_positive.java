class Solution {
    void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]  = nums[j];
        nums[j]  = temp;
    }
    public int firstMissingPositive(int[] nums) {
        int j=0;
        int N = nums.length;
        while(j<N){
            if(nums[j]>0 && nums[j]<N && nums[j]!=nums[nums[j]-1]){
                swap(nums,j,nums[j]-1);
            } 
            else{
                j++;
            }
        }
        for(int i=0;i<N;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return N+1;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.firstMissingPositive(new int[]{1,2,0}));
    }
}
