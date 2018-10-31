import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        if(s.substring(0,2).equals("12") && s.substring(8,10).equals("PM")){
            return s.substring(0,8);
        }
        else if(s.substring(0,2).equals("12") && s.substring(8,10).equals("AM")){
            return "00" + s.substring(2,8);
        }
        else if(s.substring(8,10).equals("AM")){
            return s.substring(0,8);
        }
        else{
        String twoChars;
        String remainingChars;
        twoChars = s.substring(0,2);
        remainingChars = s.substring(2,8);
        int hours = Integer.parseInt(twoChars);
        hours = hours + 12;
        twoChars = Integer.toString(hours);
        return hours + remainingChars;
        }
        
            
        /*
         * Write your code here.
         */

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
