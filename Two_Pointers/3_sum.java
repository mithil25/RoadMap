import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class threeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        int N = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<N-2;i++)
        {
            int start = i+1;
            int end = N-1;
            while(start<end)
            {
                int target = nums[i]+nums[start]+nums[end];
                if(target == 0)
                {
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[start]);
                    ans.add(nums[end]);
                    result.add(ans);
                    while(start<N-1 && nums[start]==nums[start+1])start++;
                    while(end>0 && nums[end] == nums[end-1]) end--;
                    start++;
                    end--;
                }
                else if(target>0){
                    end--;
                }
                else{
                    start++;
                }
            }
            while(i<N-1 && nums[i]==nums[i+1]) i++;
        }
        return result;
    }
    public static void main(String[] args) {
        threeSumSolution solution = new threeSumSolution();
        List<List<Integer>> result = solution.threeSum(new int[]{-1,0,1,2,-1,-4});
        System.out.println(result);
    }
}
