package com.company;
import java.security.Key;
import java.util.HashMap;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
       int []arr={1,5,3,8,0};
       int max=0;
       int smax=0;
       for(int i=0;i<5;i++){
           if(max<=arr[i]){
               smax=max;
               max=arr[i];
           }
           else if(smax<=arr[i] && max>arr[i]){
               smax=arr[i];
           }
       }

        System.out.println("largest number is "+max);
        System.out.println("second largest is "+smax);

    }

}




