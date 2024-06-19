public class EffectiveTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {74, 78, 80, 79, 83, 85, 81, 81, 84, 83, 84, 84, 84, 90};
        int sum = 0;
        for (int i = 0; i < temperatures.length; i = i+1) {
            sum = sum+temperatures[i];
        }
        int average = sum/temperatures.length;
        System.out.println("Average temp was "+average);
    }
}
