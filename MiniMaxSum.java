import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxMinSumArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);

        long min = 0 , max = 0;
        for(int k=0 ; k<4 ; k++){
            min = min + arr[k];
        }
        for(int m=1 ; m<5 ; m++){
            max = max + arr[m];
        }   
        
        System.out.print(min + " " + max);
    }
}
