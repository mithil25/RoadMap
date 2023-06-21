class Solve
{
    boolean comparator(int[] nums,int M)
    {
        if(M>0 && nums[0]<nums[M]){
            return false;
        }
        return true;
    }
    public int findMin(int[] nums)
     {
        if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }
        int L = 0;
        int R = nums.length-1;
        while(L+1<R){
            int M = L+(R-L)/2;
            if(!comparator(nums,M)){
                L = M;
            }
            else{
                R = M;
            }
        }
        return nums[R];
    }
    public static void main(String[] args){
        int[] arr = new int[]{4,5,6,7,0,1,2,3};
        Solve s1 = new Solve();
        System.out.println(s1.findMin(arr));
    }
    
}