class Solution {
    public int[] sortedSquares(int[] nums) {
        // int[] arr= new int[nums.length];

        // for(int i=0; i<nums.length;i++){
        //     arr[i]=nums[i]*nums[i];    
        // }
        // Arrays.sort(arr);
        // return arr;

    //     int n= nums.length;

    //    List<Integer> neg= new ArrayList<>();
    //    List<Integer> pos= new ArrayList<>();

    //     for(int num:nums){
    //         if(num<0){
    //             neg.add(num);
    //         } else {
    //             pos.add(num);
    //         }
    //     }
        
        
    //     if(a.length ==0){
    //         for(int i=0; i<a.length; i++){
    //              a[i]=a[i]*a[i];
    //              return a.reverse();
    //         }
    //     }
    //     if(b.length==0){
    //         for(int i=0; i<b.length;i++){
    //             b[i]=b[i]*b[i];
    //             return b;
    //         }
    //     }

    int i=0;
    int j= nums.length-1;

    int[] ans= new int[nums.length];
    int k= nums.length-1;

    while(i <= j){
        if( nums[i]*nums[i] < nums[j]*nums[j] ){
            ans[k]=nums[j]*nums[j];
            j--;
        } else {
            ans[k]=nums[i]*nums[i];
            i++;
        }
        k--;

    }
    return ans;

    }
}