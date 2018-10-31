import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static String convert(int a){
        if(a != 45 && a > 30){
            a = 60 -a ;
        }
         String[] arr = { "", "one", "two", "three", "four",
			"five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
			"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "nineteen" };
        String[] tens = {
            "",        // 0
            "",        // 1
            "twenty",  // 2
            "thirty",  // 3
            "forty",   // 4
            "fifty",   // 5
            "sixty",   // 6
            "seventy", // 7
            "eighty",  // 8
            "ninety"   // 9
    };
        if(a < 20){
            return  arr[a];
        }
        else 
            return tens[a/10] + (a%10!=0 ? " " : "") + arr[a%10]; 
    }
    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
       
        
        String result="";
        if(m==00){
            result = convert(h) + " o' clock";
        }
        else{
            if(m<=30 && m>=1){
                if(m==1) result = convert(m) + " minute past " + convert(h); 
                else if(m==30) result= "half past " + convert(h); 
                else if(m==15) result= "quarter past " + convert(h); 
                else{
                    result = convert(m) + " minutes past " + convert(h);
                }
            }
            else if(m>30){
                h = h + 1;
                if(m == 1) result = convert(m) + " minute to " + convert(h);
                else if(m==45) result = "quarter to " + convert(h);
                else result = convert(m) + " minutes to " + convert(h);
            }            
        }
    return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
