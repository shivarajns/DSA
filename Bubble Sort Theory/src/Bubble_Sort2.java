import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Bubble_Sort2 {
    public static void main(String[] args) {
        Bubble_Sort2_class sort = new Bubble_Sort2_class();

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = scnr.nextInt();
        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the "+(i+1)+"th element of an Array: ");
            nums[i] = scnr.nextInt();
        }

        sort.bubblesort(nums);
        System.out.println("Sorted Array");
        for(int num:nums){
            System.out.print(num+" ");
        }

    }
}
