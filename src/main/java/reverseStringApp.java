import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class reverseStringApp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\jason\\IdeaProjects\\reverseGroups\\src\\test\\java\\Test1.text"));
        String input;

        while ((input = br.readLine()) != null) {
            String[] firstSplit = input.split(";");
            String[] lineNums = firstSplit[0].split(",");
            int k = Integer.parseInt(firstSplit[1]);
            int[] numbers = new int[5];
            List<String> numList = new ArrayList<>();

            for (int z = 0; z < lineNums.length; z++) {
                numbers[z] = Integer.parseInt(lineNums[z]);
            }

            for (int currentPosition = 0; currentPosition < numbers.length; currentPosition = currentPosition + k) {
                if(currentPosition+k >= numbers.length){
                    break;
                }
                int currentNumber = numbers[currentPosition];
                int numberToSwapWith = numbers[currentPosition + (k-1)];
                numbers[currentPosition + (k-1)] = currentNumber;
                numbers[currentPosition] = numberToSwapWith;

            }
            for (int x = 0; x < 5; x++) {
                numList.add(String.valueOf(numbers[x]));
            }
            System.out.println(numList);
        }
    }
}