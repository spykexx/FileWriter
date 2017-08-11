import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static final String file = "sales.txt";
    public static void main(String[] args) {
        String[][] Text = new String[2][8];
        Text[0][0] = "1001";
        Text[0][1] = "Jennifer";
        Text[0][2] = "Ward";
        Text[0][3] = "2140.20";
        Text[0][4] = "5200.10";
        Text[0][5] = "455.23";
        Text[0][6] = "NORTH";
        Text[0][7] = "Phone";

        Text[1][0] = "1";
        Text[1][1] = "2";
        Text[1][2] = "3";
        Text[1][3] = "4";
        Text[1][4] = "5200.10";
        Text[1][5] = "455.23";
        Text[1][6] = "NORTH";
        Text[1][7] = "Phone";

        try{
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 0; i < Text.length; i++){
                for (int e = 0; e < Text[0].length; e++){
                    if(e == 3) bw.write("SUPPLIES ");
                    if(e == 4) bw.write("BOOKS ");
                    if(e == 5) bw.write("PAPER ");
                    bw.write(Text[i][e] + " ");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
