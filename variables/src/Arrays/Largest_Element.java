package Arrays;

public class Largest_Element {
    public int largest(int[]arr){
        int n=arr.length;
        int maxi=0;
        for(int i=0;i<n;i++){
            if(arr[i]>maxi)maxi=arr[i];

        }
        return maxi;
    }
}
