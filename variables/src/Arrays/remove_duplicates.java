package Arrays;

public class remove_duplicates {
    public int removeDups(int[]nums){
        int n=nums.length;
        int j=0;
        for(int i=1;i<n;i++){
            if(nums[j]!=nums[i]){
                j++;
                nums[j]=nums[i];

            }
        }
        return j+1;

    }
}
