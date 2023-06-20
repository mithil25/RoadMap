class Solution {
    boolean comparator(int[][] matrix,int M,int target)
    {
        int row = matrix.length;
        int col = matrix[0].length;
        if(M==-1){
            return true;
        }
        if(M==row*col){
            return false;
        }
        int i = M/col;
        int j = M%col;
        return matrix[i][j] < target;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int L = -1;
        int R = row*col;
        while(L+1<R)
        {
            int M = L+(R-L)/2;
            if(comparator(matrix,M,target)){
                L = M;
            }
            else{
                R = M;
            }
        }
        int i = R/col;
        int j = R%col;
        if(R == row*col || matrix[i][j]!=target){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] mat = new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        Solution s = new Solution();
        System.out.println(s.searchMatrix(mat,10));
    }
}