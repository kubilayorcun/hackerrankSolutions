import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static String solve(int year) {
        String res="";
        if(year == 1918){
            res="26.09.1918";
        }
        else if(year < 1919){
            if(year%4==0) res="12.09."+ Integer.toString(year);
                else res="13.09."+ Integer.toString(year);
        }
        else{
            if((year%400==0) || (year%4==0 && year%100!=0 )){
                res="12.09."+Integer.toString(year);
            }
            else res="13.09."+Integer.toString(year);
        }

return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = solve(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
