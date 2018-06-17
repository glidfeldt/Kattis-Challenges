import java.util.*;
import java.util.regex.Pattern;
import java.io.*;

public class Main {
    public static void main(String[] args){
        //Array, scanner and variable
        ArrayList<String> temp = null;
        ArrayList<String> lista = null;
        StringBuilder sb = null;
        Scanner input = null;
        
        //Program
        input = new Scanner(System.in);
        while (input.hasNextLine()){
            int n = input.nextInt();
            temp = new ArrayList<String>();
            for (int counter=-1; counter<n; counter++){
                String string = input.nextLine();
                String k = string.trim();
                temp.add(k);
            }temp.remove(0);
            
            //System.out.println(temp);
            sb = new StringBuilder();
            for (String s:temp){
                sb.append(s);
                sb.append("");
            }String out =sb.toString();
            System.out.println(out);
        }
    }
}
