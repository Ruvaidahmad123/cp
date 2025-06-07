import java.util.*;

public class Kamika_and_the_Sheep {
    
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int testCount = inputReader.nextInt();
        
        while (testCount-- > 0) {
            int sizeVal = inputReader.nextInt();
            int[] numsArray = new int[sizeVal];
            
            for (int idx = 0; idx < sizeVal; idx++) {
                numsArray[idx] = inputReader.nextInt();
            }
            
            // Instead of sorting, find min and max in one pass (slight logic change)
            int minNum = numsArray[0];
            int maxNum = numsArray[0];
            for (int idx = 1; idx < sizeVal; idx++) {
                if (numsArray[idx] < minNum) {
                    minNum = numsArray[idx];
                }
                if (numsArray[idx] > maxNum) {
                    maxNum = numsArray[idx];
                }
            }
            
            System.out.println(maxNum - minNum);
        }
        inputReader.close();
    }
}
