package Arrays;

public class move_zeroes_to_end {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }

    }
}