package Arrays;

public class sorted_array {
    public boolean checkSorted(int []arr){
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i])count++;
        }
        if(arr[arr.length-1]>arr[0])count++;
        return count<=1;

    }
}
