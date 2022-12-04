import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(new File(".").getAbsolutePath());
            File myObj = new File("C:\\Users\\jvill\\IdeaProjects\\aoc-day-1\\resources\\elf-calories");
            Scanner myReader = new Scanner(myObj);
            List<Integer> calorieTotals = new ArrayList<>();
            int calorieCounter = 0;
            int highestCalories = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.isEmpty()){
                    calorieTotals.add(calorieCounter);
                    highestCalories = Math.max(calorieCounter, highestCalories);
                    calorieCounter = 0;
                }
                else {
                    calorieCounter += Integer.parseInt(data);
                }
            }
            calorieTotals.sort(Collections.reverseOrder());
            System.out.println("Highest Calorie Total: " + calorieTotals.get(0));
            System.out.println("Second Highest Calorie Total: " + calorieTotals.get(1));
            System.out.println("Third Highest Calorie Total: " + calorieTotals.get(2));
            int totalTop3 = calorieTotals.get(0) + calorieTotals.get(1) + calorieTotals.get(2);
            System.out.println(System.lineSeparator() + "Total of Top 3: " + totalTop3);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}