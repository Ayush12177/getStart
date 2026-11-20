class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int row=0,col=matrix[0].length-1;
        // while( row <matrix.length && col>=0){
        //     if(matrix[row][col]==target){
        //         // System.out.println("found key at (" + row +","+ col +")");
        //         return true;
        //     }
        //     else if (target<matrix[row][col]){
        //         col--;
        //     }
        //     else{
        //         row++;
        //     }
        // }
        // return false;

        int n=matrix.length;
        int m=matrix[0].length;

        int low=0;
        int high=m*n -1;

        while(low <= high){
            int guess=(low + high)/2;

            int row=guess/m;
            int col=guess%m;

            if(matrix[row][col]==target){
                return true;
            } else if(matrix[row][col] < target){
                low=guess+1;
            } else {

                high=guess-1;
            }
        }
        return false;
        
    }
}