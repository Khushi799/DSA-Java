package Arrays;

import java.util.HashMap;
import java.util.Map;

public class longest_subarray_given_sum {
    public int func(int[]arr,int k){
        int n=arr.length;
        int sum=0;
        Map<Integer,Integer> prefixSum=new HashMap<>();
        int maxLen=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k)maxLen=Math.max(maxLen,i+1);
            int rem=sum-k;
            if(prefixSum.containsKey(rem)){
                int len=i-prefixSum.get(arr[i]);
                maxLen=Math.max(len,maxLen);
            }
            if(!prefixSum.containsKey(sum)){
                prefixSum.put(sum,i);
            }
        }
        return maxLen;
    }



}
