import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    //this program takes in a text file of integer values separated by spaces
    //it calculates the sum of the values in each section and puts it into a hashmap
    //it then calculates the top 3 values in the hashmap and prints them out
    //and also prints the sum of the top 3 values
    public static void main(String[] args) {
        HashMap<Integer, Integer> map;
        int maxValue = Integer.MIN_VALUE;
        File file = new File("C:\\Users\\g\\Documents\\SECONDYEAR\\AoC\\AoC1\\src\\calories.txt");
        Scanner reader;
        map = new HashMap<>();
        int calories = 0;
        int count = 0;
        int top3[] = new int[3];
        Arrays.fill(top3, Integer.MIN_VALUE);

            try {
                reader = new Scanner(file);
                while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.equals("")) {
                    map.put(count, calories);
                    count++;
                    calories = 0;
                    continue;
                }
                calories += Integer.parseInt(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Map.Entry<Integer, Integer> val : map.entrySet()) {
            int value = val.getValue();
            if (value > top3[0]) {
                // update the top 3 values
                top3[2] = top3[1];
                top3[1] = top3[0];
                top3[0] = value;
            } else if (value > top3[1]) {
                top3[2] = top3[1];
                top3[1] = value;
            } else if (value > top3[2]) {
                top3[2] = value;
            }
        }
        reader.close();


        int t3Sum = top3[0] + top3[1] + top3[2];
        System.out.println(count);
        System.out.println(Arrays.toString(top3));
        System.out.println(t3Sum);


    }
}