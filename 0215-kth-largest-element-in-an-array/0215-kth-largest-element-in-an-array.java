class Solution {
    public int findKthLargest(int[] nums, int k) {
  PriorityQueue<Integer> heap= new PriorityQueue<>();

        // for(int x:nums){
        //     heap.add(x);
        //     if(heap.size()>k){
        //         heap.poll();
        //     }
        // }
        // return heap.peek();

        for(int i=0; i<k; i++){
            heap.add(nums[i]);
        }

        for(int i=k; i<nums.length; i++){
            if(nums[i] <= heap.peek()){
                continue;
            } else {
                heap.poll();
                heap.add(nums[i]);
            }
        }
        return heap.peek();
        
    }
}