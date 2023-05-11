package Homework_three;

import java.util.ArrayList;
import java.util.Random;

public class task_three {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        addNumsForList(nums);
        System.out.println(nums);
        showMaxMinAverageValue(nums);
    }

    public static void showMaxMinAverageValue(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);

        for (Integer num : nums) {
            if(max < num) max = num;
            if(min > num) min = num;
        }
        System.out.println("Максимальное = " + max);
        System.out.println("Минимальное = " + min);

        int average = (max + min) / 2;
        if(nums.contains(average))
        System.out.println("Среднее = " + average);
        else{
            int average1 = average + 1;
            int average2 = average - 1;

            while (true) {
                if(nums.contains(average1)){
                    System.out.println("Среднее = " + average1);
                    break;
                }
                else average1++;

                if(nums.contains(average2)){
                    System.out.println("Среднее = " + average2);
                    break;
                }
                else average2--;
            
            }
            
        }
    }
    public static void addNumsForList(ArrayList<Integer> list) {
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(rnd.nextInt(0, 40));
        }
    }
}
