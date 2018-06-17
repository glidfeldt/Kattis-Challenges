import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main{
    public static int arrayToInt(List<Integer> digits){
        int number = 0;
        for (int digit: digits) {
            number *= 10;
            number += digit;
        }return number;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()){
            //Counter for output
            int count=0;
            String number=input.nextLine();
            while (number.compareTo("6174")!=0){
                //Biggest value &convert biggestvalue too int
                char[] bigChar = number.toCharArray();
                Arrays.sort(bigChar);
                String bigString="";
                for (int i=bigChar.length-1; i>=0;i--){
                    bigString+=bigChar[i];
                }int bigNum=Integer.parseInt(bigString);

                //small value &convert
                char[] smallChar=number.toCharArray();
                Arrays.sort(smallChar);
                String smallString = new String(smallChar);
                int smallNum= Integer.parseInt(smallString);

                //c=bigvalue-smallvalue
                int intNumber = bigNum-smallNum;
                number = String.format("%04d", intNumber);

                count++;
            }System.out.println(count);
        }
    }
}
