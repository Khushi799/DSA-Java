package Arrays;

public class missing_number {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int xor=0,xor2=0;
        for(int i=0;i<n;i++){
            xor^=nums[i];
            xor2^=(i+1);
        }

        return xor^xor2;
    }

}
