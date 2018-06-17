import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        int checkEndofBoat;
        try {
            while ((line = input.readLine()) != null) {
                line.trim();
                Scanner sc = new Scanner(line);
                int rows = sc.nextInt();
                int columns = sc.nextInt();

                String[][] plane = new String[rows][columns];

                for (int counterRow=0;counterRow<rows; counterRow++){
                    String[] onerow= input.readLine().split("");
                    for (int counterCol=0;counterCol<columns;counterCol++){
                        plane[counterRow][counterCol]=onerow[counterCol];
                    }
                }List<Boat> allBoats= new ArrayList<Boat>();
                for (int rowIndex=0;rowIndex<rows;rowIndex++){
                    for (int colIndex=0;colIndex<columns;colIndex++){
                        if (plane[rowIndex][colIndex].equals("O")){
                            plane[rowIndex][colIndex]=".";
                            Boat skepp = new Boat(rowIndex,colIndex);
                            if(rowIndex+1<rows && plane[rowIndex+1][colIndex].equals("O")) {
                                plane[rowIndex+1][colIndex]=".";
                                skepp.changeDirection("Horizontal");
                                skepp.upLength();
                                checkEndofBoat=2;
                                while(rowIndex+checkEndofBoat<rows && plane[rowIndex+checkEndofBoat][colIndex].equals("O")) {
                                    skepp.upLength();
                                    plane[rowIndex + checkEndofBoat][colIndex] = ".";
                                    checkEndofBoat++;
                                }
                            }else if(colIndex+1<columns && plane[rowIndex][colIndex+1].equals("O")){
                                plane[rowIndex][colIndex+1]=".";
                                skepp.changeDirection("Vertical");
                                skepp.upLength();
                                checkEndofBoat=2;
                                while(colIndex+checkEndofBoat<columns && plane[rowIndex][colIndex+checkEndofBoat].equals("O")){
                                    skepp.upLength();
                                    plane[rowIndex][colIndex+checkEndofBoat]=".";
                                    checkEndofBoat++;
                                }
                            }allBoats.add(skepp);
                        }
                    }
                }for (int i=0; i<allBoats.size();i++){
                    if (allBoats.get(i).length==1){
                        allBoats.remove(i);
                    }
                }
                System.out.println(allBoats.size());

            }
        }catch (Exception e ){e.printStackTrace();}
    }public static void printRow(String[] row) {
        for (String i : row) {
            System.out.print(i);
        }System.out.println();
    }
}class Boat{
    int row;
    int col;
    int length;
    String orientation;
    public Boat(int row, int col){
        this.row=row;
        this.col=col;
        this.length=1;
        this.orientation=null;
    }
    public void upLength(){this.length++;}

    public void changeDirection(String status){this.orientation=status;}


}
