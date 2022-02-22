/**
You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

Example


The maximum height candles are  units high. There are  of them, so return .

Function Description

Complete the function birthdayCakeCandles in the editor below.

birthdayCakeCandles has the following parameter(s):

int candles[n]: the candle heights
Returns

int: the number of candles that are tallest
Input Format

The first line contains a single integer, , the size of .
The second line contains  space-separated integers, where each integer  describes the height of .

Constraints

Sample Input 0

4
3 2 1 3
Sample Output 0

2

 */

 import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class BirthdayCandle {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int tall = 0;
        int count = 0;
        
        
        for(int i=0; i < a; i++){
            int height = in.nextInt();
            
            if(height > tall){
                tall = height;
                count = 1;
            }
            else if(height == tall) count++;
        }
        System.out.println(count);
    }
}


/**
input:-
4
3 2 1 3

output:-
2

 */