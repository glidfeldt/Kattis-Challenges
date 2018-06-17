import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line=null;
        try {
            while ((line = br.readLine()) != null) {
                line.trim();
                Scanner startvalue = new Scanner(line);
                int rows = startvalue.nextInt();
                int columns = startvalue.nextInt();

                //Sparar 1 för symmetrisk rad, 0 för ej symmetrisk rad
                int[] symmetri = new int[rows];

                //En rad i taget
                for (int counter=0; counter<rows; counter++){
                    String rad_ror = br.readLine();

                    //En rad
                    char[] bokstaver1 = rad_ror.toCharArray();

                    //samma rad baklänges
                    char[] bokstaver2 = new char[columns];
                    int count=0;
                    for (int rakna2=bokstaver1.length-1; rakna2>=0; rakna2--){
                        bokstaver2[count]=bokstaver1[rakna2];
                        count++;
                    }
                    //Genomgång för att se att alla element stämmer överens
                    outerloop:
                    for (int x=0; x<bokstaver1.length; x++){
                        if (bokstaver1[x]!=bokstaver2[x]){
                            symmetri[counter]=0;
                            break outerloop;
                        }else{
                            symmetri[counter]=1;
                        }
                    }
                }
                boolean endastEttor = true;
                outerloop:
                for (int value: symmetri){
                    if (value!=1){
                        endastEttor=false;
                        break outerloop;
                    }
                }if (endastEttor==true){
                    System.out.println("Ja");
                }else{
                    System.out.println("Nej");
                }



            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
