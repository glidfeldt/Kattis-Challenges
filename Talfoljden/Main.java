import java.util.*;
import java.util.Scanner;


public class apples {
    public static void main(String[] args){
        //Declaring variables, arrays and scanner
        long x, y;
        ArrayList<Long> arr = new ArrayList<Long>();
        ArrayList<Long> temp = new ArrayList<Long>();
        Scanner input = null;
        
        //Input
        input = new Scanner(System.in);
        while (input.hasNextLong()){
            x = input.nextLong();
            y = input.nextLong();
            for (long counter=x; counter<y+1; counter++){
                arr.add(counter);
            }
            for (long z : arr){
                temp.clear();
                while(z!=1){
                    if (z % 2 ==0){
                        //System.out.println(z);
                        temp.add(z);
                        z = z/2;
                    }else{
                        temp.add(z);
                        z=1+z*3;
                    }
            }temp.add(z);
            System.out.println(temp.size()-1);
            }
        }
    }
}
