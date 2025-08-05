class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int j = 1;
        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] % 2 != 0) {
            
                while (nums[j] % 2 != 0) {
                    j += 2;
                }
            
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
}
