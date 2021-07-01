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
            String[] firstSplit = input.split(";");
            String[] lineNums = firstSplit[0].split(",");
            int[] numbers = new int[5];

            for(int y=0; y<lineNums.length; y++){
                int k = Integer.parseInt(firstSplit[1]);
                numbers[y] = Integer.parseInt(lineNums[y]);
                if(numbers[y] % k == 0){
                    int numToMove = numbers[y];
                    int numToSave = numbers[y-1];
                    numbers[y] = numToSave;
                    numbers[y-1] = numToMove;
                }
            }

            for(int x=0; x < numbers.length; x++){
                System.out.println(numbers[x]);
            }
        }
    }
}
