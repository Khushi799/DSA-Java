package Arrays;

public class second_largest {
    public int secondlargest(int[]arr){
        int smax=0,maxi=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                smax=maxi;
                maxi=arr[i];
            }
            else if(arr[i]<maxi && arr[i]>smax)smax=arr[i];
        }
        return smax;
    }
}
