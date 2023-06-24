public class MaxNumberPosition {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 3, 9, 8, 2, 8, 1};
        
        int maxNumber = numbers[0];
        int maxIndex = 0;
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
                maxIndex = i;
            }
        }
        
        System.out.println("Maximum Number: " + maxNumber);
        System.out.println("Position/Index: " + maxIndex);
    }
}