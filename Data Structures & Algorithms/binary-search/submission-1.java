class Solution {
    public int search(int[] nums, int target) {
        int count=-1;
        for(int i:nums){
            count++;
            if(i==target){
                return count;
            }
        }
        return -1;
    }
}
