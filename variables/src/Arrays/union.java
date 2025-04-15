package Arrays;

import java.util.ArrayList;
import java.util.List;

public class union {
    public List<Integer> findUnion(int[]a, int[]b){
        int n=a.length,m=b.length;
        int i=0,j=0;
        ArrayList<Integer>union=new ArrayList<>();
        while(i<n && j<m){
            if(a[i]>=b[i]){
                if(union.size()==0 ||union.get(union.size()-1)!=a[i]){
                    union.add(a[i]);
                    i++;
                }
            }
            else{
                if(union.size()==0 ||union.get(union.size()-1)!=a[i]){
                    union.add(b[i]);
                    j++;
                }
            }
        }
        return union;
    }
}
