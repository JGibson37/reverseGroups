import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class reverseStringApp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\WeCanCodeIT\\Documents\\reverseGroups\\src\\test\\java\\Test1.text"));
        String input;

        while((input = br.readLine()) != null){
            String[] lineNums = input.split(",");

            for(int x=0; x < lineNums.length; x++){
                System.out.println(lineNums[x]);
            }
        }
    }
}
