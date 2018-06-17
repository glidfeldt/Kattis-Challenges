import java.util.*;
import java.io.*;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args){ 
        //Arrays, variables etc
        int n=0;
        Double value = null, x, y, z;
        ArrayList<Double> dist = null;
        ArrayList<Double> cord = null;
        ArrayList<String> temp = null; //AllCoordinates
        Scanner input = new Scanner(System.in); //Input
        
        
        //
        DecimalFormat f = new DecimalFormat("##.00"); //Function for getting only two decimals
        
        
        while (input.hasNextLine()){
            //System.out.println("Enter number of coordinates: ");
            n = input.nextInt();
            
            //Saves correct input in array
            temp = new ArrayList<String>();
            for (int counter1=-1; counter1<n; counter1++){
                //System.out.println("Enter coordinate (x y z): ");
                String koordinat = input.nextLine();
                String k = koordinat.trim();
                temp.add(k);
            }temp.remove(0);
            
            //Fixa string till double
            cord = new ArrayList<Double>();
            for (String s: temp){
                Scanner ds = new Scanner(s).useDelimiter(" ");
                x = ds.nextDouble();
                y = ds.nextDouble();
                z = ds.nextDouble();
                cord.add(x);
                cord.add(y);
                cord.add(z);
            }//System.out.println(cord);
            
            /*Distance equation and to list with all distances
            dist = new ArrayList<Double>();
            for (int counter2=0; counter2<cord.size(); counter2+=3){
                double distance = Math.sqrt(Math.pow(cord.get(counter2)-cord.get(counter2+3),2)+Math.pow(cord.get(counter2+1)-cord.get(counter2+4), 2)+Math.pow(cord.get(counter2+2)-cord.get(counter2+5), 2));
                dist.add(distance);
            }System.out.println(dist);*/
            
            int p=0;
            int s=1;
            dist = new ArrayList<Double>();
            while(s<n){
                //System.out.printf("Sqrt((%f - %f)^2+(%f - %f)^2+(%f - %f)^2)",cord.get(3+p),cord.get(0+p), cord.get(4+p),cord.get(1+p),cord.get(5+p), cord.get(2+p));
                //System.out.println("\n");
                double distance = Math.sqrt(Math.pow(cord.get(3+p)-cord.get(0+p),2)+Math.pow(cord.get(4+p)-cord.get(1+p), 2)+Math.pow(cord.get(5+p)-cord.get(2+p), 2));
                dist.add(distance);
                p+=3;
                s++;
            }//System.out.println(dist);
            
            //Sum of all distances
            double out = 0;
            for (double k: dist){
                out = out+k;
            }
            //Output
            System.out.println(f.format(out));
        }
    }
}
