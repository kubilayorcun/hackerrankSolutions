import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
        s = s.replaceAll("\\s","");
        int strLength = s.length();
        double squareRoot = Math.sqrt(strLength);
        int row, column;
        row = (int)Math.floor(squareRoot);
        column = (int)Math.ceil(squareRoot);
        if(row*column < strLength) row++;
        int diff = row*column - strLength;
        char[][] array = new char[row][column];
        int index = 0;
        System.out.println(row);
        System.out.println(column);
        for(int i = 0; i < row; i++)
            for(int j = 0; j < column && index < s.length(); j++){
                array[i][j] = s.charAt(index);
                index++;
            }
        
        StringBuilder result = new StringBuilder(); 
        for(int i = 0; i < column; i++){
            if(i == column - diff) row -= 1;
            for(int j = 0; j < row; j++){
                result.append(array[j][i]);
            }
            result.append(" ");
        }

        return result.toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
